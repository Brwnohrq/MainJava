import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Bank {

    private String url = "jdbc:mysql://localhost:3306/banco_java";
    private String username = "root";
    private String password = "a996104003";
    private Connection connection;

    public void firstConnection() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public void registerClient(String name, String taxId) throws SQLException, InvalidValueException {

        if (name == null || name.isEmpty()) {
            throw new InvalidValueException("Name cannot be empty");
        }
        if (!name.matches("^[a-zA-ZÀ-ÿ ]+$")) {
            throw new InvalidValueException("Name must contain only letters");
        }
        if (!taxId.matches("^[0-9]{11}$")) {
            throw new InvalidValueException("Tax ID must contain exactly 11 digits");
        }

        firstConnection();
        var command = connection.prepareStatement("INSERT INTO Cliente (NOME,CPF) VALUES (?,?)");
        command.setString(1, name);
        command.setString(2, taxId);
        int rows = command.executeUpdate();
        if (rows >= 1) {
            System.out.println("Success");
        }
    }

    public String getBalanceInfo(int id) throws SQLException, InvalidValueException {
        firstConnection();
        var command = connection.prepareStatement("SELECT * FROM Conta WHERE ID = ?");
        command.setInt(1, id);
        var result = command.executeQuery();
        if (result.next()) {
            int accountId = result.getInt("ID");
            double balance = result.getDouble("SALDO");
            int clientId = result.getInt("ID_CLIENTE");
            boolean active = result.getBoolean("ATIVADO");
            String info = String.format("ID %d%n BALANCE: %.2f %n CLIENT_ID %d%n ACCOUNT_ACTIVE %b",
                    accountId, balance, clientId, active);
            return info;
        } else {
            throw new InvalidValueException("Invalid ID");
        }
    }

    public double withdraw(int id, double amount)
            throws SQLException,
            InsufficientBalanceException,
            InvalidValueException,
            AccountNotFoundException {

        if (amount <= 0) {
            throw new InvalidValueException("Withdrawal amount must be greater than $0");
        }

        double balance = getBalanceValue(id);

        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds available balance");
        }

        firstConnection();

        var command = connection.prepareStatement("UPDATE CONTA SET SALDO = SALDO - ? WHERE ID = ?");
        command.setDouble(1, amount);
        command.setInt(2, id);
        var result = command.executeUpdate();

        if (result >= 1) {
            balance = balance - amount;
            return balance;
        } else {
            throw new AccountNotFoundException("Invalid ID");
        }
    }

    public double getBalanceValue(int id) throws SQLException, AccountNotFoundException {
        firstConnection();
        var command = connection.prepareStatement("SELECT * FROM Conta WHERE ID = ?");
        command.setInt(1, id);
        var result = command.executeQuery();
        if (result.next()) {
            double balance = result.getDouble("SALDO");
            return balance;
        } else {
            throw new AccountNotFoundException("Invalid ID");
        }
    }
}