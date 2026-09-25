public class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(double valorCompra, String nome) {
        super(valorCompra, nome);
    }

    @Override
    public double calcularValorFinal(){
        double desconto = getValorCompra() * 0.08;
        double valorComDesconto = getValorCompra() - desconto;
        return valorComDesconto;
    }

    @Override
    public boolean validar(){
    double valor = getValorCompra();
    if (valor <= 0){
        return false;
    }
    return true;
    }

}
