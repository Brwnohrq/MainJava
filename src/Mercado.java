import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mercado {

    private String url = "jdbc:mysql://localhost:3306/supermercado";
    private String usuario = "root";
    private String senha = "a996104003@";
    private Connection connection;


    public boolean conectar() {
        try {
            connection = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao Estabelecida");
            System.out.println(" ");
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Conexao Falhou");
            return false;
        }
    }

    public boolean mostrarProduto(){
        if (!conectar()){
            return false;
        }
        try {
            var comando = connection.createStatement();
            var resultado = comando.executeQuery("SELECT * FROM produtos");

            while (resultado.next()){
                String nome = resultado.getString("nome");
                int quantidade = resultado.getInt("quantidade");
                double preco = resultado.getDouble("preco");

                System.out.println(nome + " | " + preco + " | " + quantidade);


        }
            System.out.println(" ");
            return true;

        } catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }

    }

 public boolean buscarProduto(String nome){
        if (!conectar()){
            return false;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM produtos WHERE nome = ?");
            comando.setString(1, nome);
            var resultado = comando.executeQuery();
            boolean achou = false;

            while (resultado.next()) {
                String nomeRetor = resultado.getString("nome");
                int quantidade = resultado.getInt("quantidade");
                double preco = resultado.getDouble("preco");
                System.out.println(nomeRetor + " | " + preco + "|" + quantidade);
                achou = true;
            }
            return achou;

        } catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }

 }

    public boolean cadastrarProduto(String nome, int quantidade, double preco){
        if (!conectar()){
            return false;
        }
            try {
                var comando = connection.prepareStatement("INSERT INTO produtos (nome, quantidade, preco) VALUES (?,?,?)");
                comando.setString(1, nome);
                comando.setInt(2,quantidade);
                comando.setDouble(3,preco);
                int linhasAfetadas = comando.executeUpdate();
                if (linhasAfetadas > 0) {
                    System.out.println("Produto cadastrado:");
                    System.out.println(nome + " | " + preco + " | " + quantidade);
                    return true;
                }

            } catch (SQLException e){
                System.out.println(e.getMessage());

            }
        return false;
    }
}


