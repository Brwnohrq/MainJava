public class Carros extends Veiculo{

    private String cor;

    public Carros(String placa, String modelo, double diaria, boolean disponivel,String cor){
        super(placa,modelo,diaria,disponivel);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }


    @Override
    public double calcularValorAluguel(int dias) {
        double valorAluguel = super.calcularValorAluguel(dias);

        if (valorAluguel == -1)
        {
            return -1;
        }
        return valorAluguel + 150;
    }


}
