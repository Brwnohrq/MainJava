public class PagamentoCartao extends Pagamento {

private int numeroParcelas;

    public PagamentoCartao(double valorCompra, String nome, int numeroParcelas) {
        super(valorCompra, nome);
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double calcularValorFinal() {
        if (numeroParcelas <= 3){
            return getValorCompra();
        }

        int parcelasComJuros = numeroParcelas -3;

        double taxaDeJuros = getValorCompra() * 0.02;

        double valorFinal = (parcelasComJuros * taxaDeJuros) + getValorCompra();
        return valorFinal;

    }

    public double valorParcela(){
     double valorParcelado = calcularValorFinal() / numeroParcelas;
        return valorParcelado;
    }

    @Override
    public boolean validar() {
        if (numeroParcelas > 12) {
            return false;
        }
        return true;
    }





}
