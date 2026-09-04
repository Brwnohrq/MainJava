public class Conta {

    private int id;
    private int idCliente;
    private double saldo;


    public Conta(int id, int idCliente, double saldo) {
        this.id = id;
        this.idCliente = idCliente;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
