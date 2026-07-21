package entidade;

public class Carros extends Veiculos {

    private int numeroDePortas;

    public Carros(String marca, String modelo, String placa,
                  int anoFabricacao,boolean emManutencao, int numeroDePortas) {

super(marca,modelo,placa,anoFabricacao,emManutencao);
        this.numeroDePortas = numeroDePortas;

    }


    public int getNumeroDePortas(){
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }



}
