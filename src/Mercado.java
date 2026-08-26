import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mercado{

    private String url = "jdbc:mysql://localhost:3306/supermercado";
    private String usuario = "root";
    private String senha = "a996104003@";
    private Connection connection;

    public boolean conectar(){
        try {
            connection = DriverManager.getConnection(url,usuario,senha);
                System.out.println("Conexao Estabelecida");
                return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
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

            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}
