public abstract class Pagamento {

    private String nome;
    private double valorCompra;

    public Pagamento(String nome, double valorCompra) {
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public String getNome() {
        return nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }


    public abstract double calcularValorFinal();
    public abstract boolean validar();
    public abstract String getTipo();

    public void gerarComprovante(){
        System.out.println("Nome : " + getNome());
        System.out.println("Tipo de compra: " +getTipo());
        System.out.println("Valor do Produto: " + getValorCompra());
        System.out.println("Valor Total " +calcularValorFinal());
    }


    }
