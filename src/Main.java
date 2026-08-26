import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

         String url = "jdbc:mysql://localhost:3306/supermercado";
         String usuario = "root";
         String senha = "a996104003@";
         Connection connection;

         try {
             connection = DriverManager.getConnection(url, usuario, senha);
             System.out.println("Conexao Estabelecida");
             var comando = connection.createStatement();
             var resultado = comando.executeQuery("SELECT * FROM produtos");

             while (resultado.next()) {
                 String nome = resultado.getString("nome");
                 int quantidade = resultado.getInt("quantidade");
                 double preco = resultado.getDouble("preco");
                 System.out.println(nome + " | " + preco + " | " + quantidade);

             }
         } catch (SQLException e){
             System.out.println(e.getMessage());
             System.out.println("Conexao Falhou");
         }




    }
}