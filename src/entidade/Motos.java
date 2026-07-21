package entidade;

public class Motos extends Veiculos {

    private int cilindradas;

    public Motos(String marca, String modelo, String placa, int anoFabricacao, boolean emManutencao, int cilindradas){
        super(marca,modelo,placa,anoFabricacao,emManutencao);
            this.cilindradas = cilindradas;
    }


    public int getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }


}
