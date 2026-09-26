public class PagamentoDinheiro extends  Pagamento{


    public PagamentoDinheiro(String nome, double valorCompra) {
        super(nome, valorCompra);
    }

    @Override
    public boolean validar(){
        if (getValorCompra() <= 0){
            return false;
        }
        return true;
    }
    @Override
    public double calcularValorFinal(){
        double desconto = getValorCompra() * 0.08;
        double total = getValorCompra() - desconto;
        return total;
    }

    @Override
    public String getTipo(){
        String retorno = "Dinheiro";
        return retorno;
    }



}