import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;



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

    public double transferencias (int idClienteRecebedor, double enviarValor, int idClienteEnviador){
    if (!conectar()){
        return -1;
    }
    if (idClienteEnviador == idClienteRecebedor){
        return -1;
    }
    String clienteRecebedor = buscarCliente(idClienteRecebedor);

    if (clienteRecebedor ==null){
        return -1;
    }
    double saldoDisponivel = buscarSaldo(idClienteEnviador);

    if (enviarValor <= 0 || enviarValor > saldoDisponivel){
        return -1;
    }

    double resultadoSaque = saque(idClienteEnviador,enviarValor);

    if (resultadoSaque == -1){
        return -1;
    }
    double resultadoDeposito = depositar(idClienteRecebedor,enviarValor);
    if (resultadoDeposito == -1){
        return -1;
    }

    return resultadoSaque;

    }

    public boolean deletarConta (int idCliente) {
        if (!conectar()) {
            return false;
        }
        try {
            var comando = connection.prepareStatement("UPDATE CONTA SET ATIVADO = 0 WHERE ID_CLIENTE = ?");
            comando.setInt(1, idCliente);
            int linhasAfetadas = comando.executeUpdate();
            var comando2 = connection.prepareStatement("UPDATE CLIENTE SET ATIVADO = 0 WHERE ID = ?");
            comando2.setInt(1,idCliente);

            int linhasAfetadas2 = comando2.executeUpdate();

          if (linhasAfetadas >0 && linhasAfetadas2 >0){
              return true;
          }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public ArrayList<String> mostrarClientes(){
        if (!conectar()){
            return null;
        }
        ArrayList <String> clientes = new ArrayList<>();

        try{
            var comando = connection.prepareStatement("SELECT * FROM CLIENTE");
            var resultado = comando.executeQuery();
            while (resultado.next()){
                int ID = resultado.getInt("ID");
                String nomeRetorno = resultado.getString("NOME");
                String cpfRetorno = resultado.getString("CPF");
                String texto = String.format("ID: %d Nome: %s CPF: %s ",ID,nomeRetorno,cpfRetorno);
                clientes.add(texto);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return clientes;

    }

    public ArrayList<String> mostrarConta (){
        if (!conectar()){
            return null;
        }
        ArrayList<String> conta = new ArrayList<>();

        try {
        var comando = connection.prepareStatement("SELECT * FROM CONTA");
        var resultado = comando.executeQuery();
        while (resultado.next()) {
            int id = resultado.getInt("ID");
            double saldo = resultado.getDouble("SALDO");
            int idCliente = resultado.getInt("ID_CLIENTE");
            boolean ativado = resultado.getBoolean("ATIVADO");
            String texto = String.format("ID: %d SALDO: %.2f ID CLIENTE: %d CONTA ATIVA: %s",id,saldo,idCliente,ativado);
            conta.add(texto);

        }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conta;
    }

    public String buscarClienteCPF (String cpf) {
        if (!conectar()) {
            return null;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM Cliente WHERE cpf = ?");
            comando.setString(1,cpf);
            var resultado = comando.executeQuery();
            if (resultado.next()){
                String nome = resultado.getString("NOME");
                String cpfRetorno = resultado.getString("CPF");
                int idRetorno = resultado.getInt("ID");
                String texto = String.format("Nome: %s CPF: %s ID %d" , nome, cpfRetorno,idRetorno);
                return texto;
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
