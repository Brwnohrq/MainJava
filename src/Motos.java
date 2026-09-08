public class Motos extends Veiculo {

    private int cilindradas;


    public Motos(String placa, String modelo, double diaria, boolean disponivel, int cilindradas) {
        super(placa, modelo, diaria, disponivel);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        double valorAluguel = super.calcularValorAluguel(dias);

        if (valorAluguel == -1){
            return -1;
        }
        return valorAluguel + 100;

    }

}

