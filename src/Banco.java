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
                return true;
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public String buscarCliente (int idCliente) {
        if (!conectar()) {
            return null;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM Cliente WHERE id = ?");
            comando.setInt(1,idCliente);
            var resultado = comando.executeQuery();
            if (resultado.next()){
                String nome = resultado.getString("NOME");
                String cpf = resultado.getString("CPF");
                int idRetorno = resultado.getInt("ID");
                String texto = String.format("Nome: %s CPF: %s ID %d" , nome, cpf,idRetorno);
            return texto;
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
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
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public String buscarConta(int idCliente) {
        if (!conectar()) {
            return null;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM Conta WHERE ID_CLIENTE = ?");
            comando.setInt(1, idCliente);
            var resultado = comando.executeQuery();

            if (resultado.next()){
                int id = resultado.getInt("ID");
                int idClienteRetorno = resultado.getInt("ID_CLIENTE");

                double saldo = resultado.getDouble("SALDO");
                String texto = String.format("ID: %d ID_CLIENTE: %d  SALDO RS$: %.2f",id,idClienteRetorno,saldo);
                return texto;
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
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
                double saldo = resultado.getDouble("SALDO");
                return saldo;
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public double depositar(int idCliente, double valor){
        if (!conectar()){
            return -1;
        }
        if (valor <=0){
            return -1;
        }

        try {
            var comando = connection.prepareStatement("UPDATE CONTA SET SALDO = SALDO + ? WHERE ID_CLIENTE = ?");
            comando.setDouble(1,valor);
            comando.setInt(2,idCliente);

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas >0){
                return buscarSaldo(idCliente);

            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public double saque(int idCliente, double valor){
        if (!conectar()){
            return -1;
        }
        double saldoo = buscarSaldo(idCliente);

        if (valor <=0 || valor > saldoo){
            return -1;
        }
        try {
            var comando = connection.prepareStatement("UPDATE Conta SET SALDO = SALDO - ? WHERE ID_CLIENTE = ?");
            comando.setDouble(1, valor);
            comando.setInt(2, idCliente);

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                return buscarSaldo(idCliente);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public boolean excluirCliente (int idCliente){
        if (!conectar()){
            return false;
        }
        try {
            var comando = connection.prepareStatement("DELETE FROM CLIENTE WHERE ID = ?");
            comando.setInt(1, idCliente);
            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                return true;
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

}
