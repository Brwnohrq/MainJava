public class PagamentoPix extends Pagamento {

    public PagamentoPix(String nome, double valorCompra) {
        super(nome, valorCompra);
    }


    @Override
    public double calcularValorFinal(){
        double valorDesconto = getValorCompra() * 0.09;
        double valorFinal = getValorCompra() - valorDesconto;
        return valorFinal;
    }


    @Override
    public boolean validar(){
        if (getValorCompra() <= 0){
            return false;
        }
        return true;
    }
    @Override
    public String getTipo(){
            String retorno = "Pix";
            return retorno;
        }

    }

