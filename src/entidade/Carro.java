package entidade;

public class Carro {

    String marca;
    String modelo;
    String placa;
    int anoFabricacao;
    int valorDiaria;
    boolean disponivel = true;


    public void mostrarCarros(){

        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Placa: " +placa);
        System.out.println("Ano do Carro: " +anoFabricacao);
        System.out.println("Valor Diaria " +valorDiaria);
        System.out.println("Disponivel: " +disponivel);
    }

    public boolean alugarCarro(){
        if (disponivel){
            System.out.println(marca + " " + modelo + " Esta disponivel");
            disponivel = false;
            return true;

        }else {
            return false;
        }
    }

    public boolean devolver(){
        if (!disponivel){
            System.out.println(marca + " " + modelo + " Esta sendo Devolvido ao estoque");
            disponivel =true;
            return true;
        } else {
            System.out.println("Voce nao pode devolver um carro que nao foi alugado");
            return false;
        }
    }


}

