public class Veiculo {

    private String placa;
    private String modelo;
    private double diaria;
    private boolean disponivel;

    public Veiculo(String placa, String modelo, double diaria, boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.diaria = diaria;
        this.disponivel = disponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public double getDiaria() {
        return diaria;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public double calcularValorAluguel(int dias){
        if (dias < 0){
            return -1;
        }
        double valorDiaria = getDiaria();
        double valorTotal = valorDiaria *dias;
        return valorTotal;
    }

}
