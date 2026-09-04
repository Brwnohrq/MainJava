import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Banco {

    private String url = "jdbc:mysql://localhost:3306/banco_java";
    private String usuario = "root";
    private String password = "a996104003@";
    private Connection connection;

    public boolean conectar() {
        try {
            connection = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexao Estabelecida");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean cadastrarCliente(String nome, String cpf) {
        if (!conectar()) {
            return false;
        }
        try {
            var comando = connection.prepareStatement("INSERT INTO Cliente (nome,cpf) VALUES (?,?)");
            comando.setString(1, nome);
            comando.setString(2, cpf);
            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas == 0) {
                return false;
            }
            System.out.println("Cadastro Concluido, Nome " + nome + " CPF: " + cpf);
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean buscarCliente(int id) {
        if (!conectar()) {
            return false;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM Cliente WHERE id = ?");
            comando.setInt(1, id);
            var resultado = comando.executeQuery();
            if (resultado.next()) {
                String nomeRetorno = resultado.getString("nome");
                String cpfRetorno = resultado.getString("cpf");
                int idRetorno = resultado.getInt("id");
                System.out.println("Nome:" + nomeRetorno + " CPF: " + cpfRetorno + " ID: " + idRetorno);
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean criarConta(int idCliente, double saldo) {
        if (!conectar()) {
            return false;
        }
        try {
            var comando = connection.prepareStatement("INSERT INTO Conta (ID_CLIENTE,Saldo) VALUES (?,?)");
            comando.setInt(1, idCliente);
            comando.setDouble(2, saldo);

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas == 0) {
                return false;
            }
            System.out.println("Conta Criada com sucesso");
            System.out.println("ID Cliente: " + idCliente + " Saldo: " + saldo);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }


    public boolean buscarConta(int idConta) {
        if (!conectar()) {
            return false;
        }
        try {
            var comando = connection.prepareStatement("SELECT * FROM Conta WHERE ID = ?");
            comando.setInt(1, idConta);
            var resultado = comando.executeQuery();
            if (resultado.next()) {
                int id = resultado.getInt("ID");
                double saldo = resultado.getDouble("SALDO");
                int idCliente = resultado.getInt("ID_CLIENTE");
                System.out.printf("ID: %d | Saldo: %.2f | ID Cliente: %d%n",
                        id, saldo, idCliente);
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean depositar (int idCliente, double valor){
        if (!conectar()){
            return false;
        }
        if (valor <=0){
            return false;
        }
        try {

        var comando = connection.prepareStatement("UPDATE Conta SET SALDO = SALDO + ? WHERE ID = ? ");
        comando.setDouble(1,valor);
        comando.setInt(2,idCliente);
        int linhasAfetadas = comando.executeUpdate();


        if (linhasAfetadas >0) {
            var resultado = connection.prepareStatement("SELECT SALDO FROM CONTA WHERE ID = ?");
            resultado.setInt(1, idCliente);
            var resultadoRetorno = resultado.executeQuery();
            if (resultadoRetorno.next()) {
                double saldoR = resultadoRetorno.getDouble("SALDO");
                System.out.println("Deposito Concluido, no valor de R$: " + valor + " Saldo R$:" + saldoR);
            }
            return true;
        }
    } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public double buscarSaldo (int idCliente){
        if (!conectar()){
            return -1;
        }
        try {
            var comando = connection.prepareStatement("SELECT SALDO FROM CONTA WHERE ID = ?");
            comando.setInt(1, idCliente);
            var resultado = comando.executeQuery();

            if (resultado.next()) {
                double saldoR = resultado.getDouble("SALDO");
                System.out.println(saldoR);
                return saldoR;
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public boolean saque (int idCliente, double valor){
        if (valor <= 0 || valor > buscarSaldo(idCliente)){
            return false;
        }
        try {
        var comando = connection.prepareStatement("UPDATE CONTA SET SALDO = SALDO - ? WHERE ID = ? ");
        comando.setDouble(1,valor);
        comando.setInt(2,idCliente);
        int linhasAfetadas = comando.executeUpdate();

        if (linhasAfetadas >0) {
            System.out.println("Saque efetuado com Sucesso");
            System.out.println("Saldo Atual R$:" + buscarSaldo(idCliente));
            return true;
        }
    } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

}