import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Mercado {



        private String url = "jdbc:mysql://localhost:3306/supermercado";
        private String usuario = "root";
        private String senha = "a996104003@";
        private Connection connection;

        public boolean conexao () {

            try {
                connection = DriverManager.getConnection(url, usuario, senha);
                System.out.println("Conexao Estabelecida");
                return true;

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return false;
            }

        }


        public boolean mostrarProduto(){
            if (!conexao()){
                return false;
            }

            try {
            var comando = connection.createStatement();
            var resultado = comando.executeQuery("SELECT * FROM produtos");
            while (resultado.next()){
                String nome = resultado.getString("nome");
                int quantidade = resultado.getInt("quantidade");
                double preco = resultado.getDouble("preco");
                System.out.println(nome + " | " + preco + "|" + quantidade);

            }
             return true;

        } catch (SQLException e){
                System.out.println(e.getMessage());
                return false;
            }

    }

    public boolean buscarProduto(String nome){
            if (!conexao()){
                return false;
            }

            try {
                var comando = connection.prepareStatement("SELECT * FROM produtos WHERE nome = ?");
                comando.setString(1, nome);
                var resultado = comando.executeQuery();

                boolean retornarProduto = false;

                while (resultado.next()) {
                    String nomeRetorno = resultado.getString("nome");
                    int quantidade = resultado.getInt("quantidade");
                    double preco = resultado.getDouble("preco");
                    System.out.println(nomeRetorno + " | "  + preco + "|" + quantidade );
                    retornarProduto = true;
                }
                return retornarProduto;
            } catch (SQLException e){
                System.out.println(e.getMessage());
                return false;
            }
    }

    public boolean cadastrarProduto(String nome, int quantidade, double preco){
            if (!conexao()){
                return false;
            }
            try {
                var comando = connection.prepareStatement("INSERT INTO produtos (nome, quantidade, preco) VALUES (?,?,?)");
                comando.setString(1,nome);
                comando.setInt(2,quantidade);
                comando.setDouble(3,preco);

                int linhasAfetadas = comando.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Produto Cadastrado");
                    System.out.println(nome + " | " + preco + " | " + quantidade);
                    return true;
                }
                return false;

            } catch (SQLException e){
                System.out.println(e.getMessage());
                return false;
            }

    }

    public boolean apagarProduto(String nome, double preco, int quantidade){
            if (!conexao()){
                return false;
            }

            try {
        var comando = connection.prepareStatement("DELETE FROM produtos WHERE nome = ? AND preco = ? AND quantidade = ?");
        comando.setString(1,nome);
        comando.setDouble(2,preco);
        comando.setInt(3,quantidade);

        int linhasAfetas = comando.executeUpdate();

        if (linhasAfetas >0) {
            System.out.println("Voce acabou de apagar o Produto " + nome + " O Preco era RS$: " + preco + " Com " + quantidade + " Unidades apagadas");
            return true;
        }
        } catch (SQLException e){
                System.out.println(e.getMessage());
                return false;
            }
            return false;
    }

    public boolean alterarPrecoProduto(double preco, String nome){
            if (!conexao()){
                return false;
            }
            try {
                var comando = connection.prepareStatement("UPDATE produtos SET preco =?  WHERE nome = ? ");
                comando.setDouble(1, preco);
                comando.setString(2, nome);

                int linhasAfetadas = comando.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Produto alterado");
                    System.out.println("Produto " + nome + " Agora custa " + preco);
                    return true;
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
                return false;
            }
            return false;
    }


}

