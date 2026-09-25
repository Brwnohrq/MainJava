public abstract class Pagamento {

    private String nome;
    private double valorCompra;

    public Pagamento(double valorCompra, String nome) {
        this.valorCompra = valorCompra;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public abstract double calcularValorFinal();

    public abstract boolean validar();
}
