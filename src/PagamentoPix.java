public class PagamentoPix extends Pagamento {


    public PagamentoPix(double valorCompra, String nome) {
        super(valorCompra, nome);
    }

@Override
    public double calcularValorFinal(){
        double descontoPix = getValorCompra() * 0.05;
        double valorFinal = (getValorCompra() - descontoPix);
        return valorFinal;
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
