public class PagamentoCartao extends Pagamento {

    private int numeroParcelas;

    public PagamentoCartao(String nome, double valorCompra, int numeroParcelas) {
        super(nome, valorCompra);
        this.numeroParcelas = numeroParcelas;
    }


    @Override
    public double calcularValorFinal(){
        if (numeroParcelas <= 3){
            double total = getValorCompra();
            return total;
        }
        int parcelasComJuros = numeroParcelas - 3;
        double valorJuros = getValorCompra() * 0.05;
        double valorTotal = (parcelasComJuros * valorJuros + getValorCompra());
        return valorTotal;
    }


    @Override
    public  boolean validar(){
        if (numeroParcelas <=0 || numeroParcelas >= 13){
            return false;
        }
        return true;
    }


    public int getNumeroParcelas() {
        return numeroParcelas;
    }

@Override
    public String getTipo(){
     String retorno = "Cartao";
     return retorno;
    }

}

