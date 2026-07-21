package entidade;

public class Veiculos {



    private String marca;
    private String modelo;
    private String placa;
    private int anoFabricacao;
    private boolean emManutencao = false;
    public Veiculos(String marca, String modelo, String placa, int anoFabricacao,boolean emManutencao){

        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.emManutencao = emManutencao;


    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public boolean isEmManutencao(){
        return  emManutencao;
    }

    public void setMarca (String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public void setEmManutencao(boolean emManutencao){
        this.emManutencao = emManutencao;
    }

    public boolean emManutencao() {
        if (!emManutencao) {
            System.out.println("Veiculo foi pra Manutencao");
            emManutencao = true;
            return true;

        } else {
            System.out.println("O Veiculo ja esta na Manutencao");
            return false;
        }
    }
        public boolean veiculoFinalizado(){
            if (emManutencao){
                System.out.println("Veiculo ja esta finalizado e pronto!");
                emManutencao = false;
                return true;

            } else {
                System.out.println("O Veiculo nao estava na manutencao");
                return false;
            }
        }
    }







