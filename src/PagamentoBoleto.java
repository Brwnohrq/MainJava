public class PagamentoBoleto extends  Pagamento  {

    private int diaDoMes;

    public PagamentoBoleto (String nome, double valorCompra, int diaDoMes){
        super(nome,valorCompra);
        this.diaDoMes = diaDoMes;

    }

    @Override
    public boolean validar (){
        if (diaDoMes < 1 || diaDoMes >31){
            return false;
        }
        return true;
    }
@Override
    public double calcularValorFinal(){
        if (diaDoMes <= 5){
            double desconto = (getValorCompra() * 0.05);
            double total = getValorCompra() - desconto;
            return total;
        }
        int diaComJuros = diaDoMes -5;
        double valorJuros = getValorCompra() *0.03;
        double totalFinal = (diaComJuros *valorJuros) +getValorCompra();
        return totalFinal;
    }

    @Override
    public String getTipo(){
        String retorno = "Boleto";
        return retorno;
    }

}