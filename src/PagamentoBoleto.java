public class PagamentoBoleto extends Pagamento{

    private int diaDoMes;

    public PagamentoBoleto(double valorCompra, String nome,int diaDoMes) {
        super(valorCompra, nome);
        this.diaDoMes = diaDoMes;
    }

    @Override
    public double calcularValorFinal(){
        if (diaDoMes <= 5 && diaDoMes >=1){
            double descontoPontualidade = (getValorCompra() * 0.05);
            double totalBoleto = getValorCompra() - descontoPontualidade;
            return totalBoleto;
        }
        int diasDeJuros = diaDoMes - 5;

        double valorDoJuros = (getValorCompra() * 0.02);
        double totalBoleto = (diasDeJuros * valorDoJuros ) + getValorCompra();
        return totalBoleto;
    }

    @Override
    public boolean validar(){
        if (diaDoMes <1 || diaDoMes > 31){
            return false;
        }
        return true;
    }



}
