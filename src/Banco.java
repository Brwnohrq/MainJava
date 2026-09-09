import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Banco {

    private String url ="jdbc:mysql://localhost:3306/banco_java";
    private String username = "root";
    private String password = "a996104003";
    Connection connection;


    public boolean conectar(){

        try{
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established");
            return true;
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }


    public boolean cadastrarCliente(String nome, String cpf){
        if (!conectar()){
            return false;
        }
        try {
            var comando = connection.prepareStatement("INSERT INTO Cliente (nome,cpf) VALUES (?,?)");
            comando.setString(1,nome);
            comando.setString(2,cpf);
            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas >0){
                System.out.println("Registration successful.");
                return true;
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean buscarCliente (int idCliente) {
        if (!conectar()) {
            return false;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM Cliente WHERE id = ?");
            comando.setInt(1,idCliente);
            var resultado = comando.executeQuery();
            if (resultado.next()){
                String nome = resultado.getString("NOME");
                String cpf = resultado.getString("CPF");
                int idRetorno = resultado.getInt("ID");
                System.out.printf("Nome %s CPF: %s ID: %d ",nome,cpf,idRetorno);
            return true;
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean criarConta (int idCliente, double saldo) {
        if (!conectar()) {
            return false;
        }
        try {
            var comando = connection.prepareStatement("INSERT INTO Conta (ID_CLIENTE, SALDO) VALUES (?,?)");
            comando.setInt(1, idCliente);
            comando.setDouble(2, saldo);

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Successful");
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean buscarConta(int idCliente) {
        if (!conectar()) {
            return false;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM Conta WHERE ID_CLIENTE = ?");
            comando.setInt(1, idCliente);
            var resultado = comando.executeQuery();

            if (resultado.next()){
                int id = resultado.getInt("ID");
                int idClienteRetorno = resultado.getInt("ID_CLIENTE");

                double saldo = resultado.getDouble("SALDO");
                System.out.printf("ID: %d ID_CLIENTE: %d  SALDO RS$: %.2f",id,idClienteRetorno,saldo);
                return true;
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public double buscarSaldo(int idCliente){
        if (!conectar()){
            return -1;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM Conta WHERE ID_CLIENTE = ? ");
            comando.setInt(1, idCliente);
            var resultado = comando.executeQuery();

            if (resultado.next()) {
                int id = resultado.getInt("ID");
                int idClienteRetorno = resultado.getInt("ID_CLIENTE");

                double saldo = resultado.getDouble("SALDO");
                System.out.printf("ID: %d ID_CLIENTE: %d  SALDO RS$: %.2f", id, idClienteRetorno, saldo);
                return saldo;
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public boolean depositar(int idCliente, double valor){
        if (!conectar()){
            return false;
        }
        if (valor <=0){
            return false;
        }

        try {
            var comando = connection.prepareStatement("UPDATE CONTA SET SALDO = SALDO + ? WHERE ID_CLIENTE = ?");
            comando.setDouble(1,valor);
            comando.setInt(2,idCliente);

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas >0){
                System.out.println("Deposit Successful");
                System.out.println("SALDO ATUAL:");
                buscarSaldo(idCliente);
                return true;

            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean saque(int idCliente, double valor){
        if (!conectar()){
            return false;
        }
        double saldoo = buscarSaldo(idCliente);

        if (valor <=0 || valor > saldoo){
            return false;
        }
        try {
            var comando = connection.prepareStatement("UPDATE Conta SET SALDO = SALDO - ? WHERE ID_CLIENTE = ?");
            comando.setDouble(1, valor);
            comando.setInt(2, idCliente);

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Saque Sucessfull");
                return true;
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }


}
