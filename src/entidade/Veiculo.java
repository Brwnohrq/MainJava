package entidade;

public class Veiculo {

    String marca;
    String modelo;
    String placa;
    int ano;
    int valorDiaria;
    boolean disponivel = true;

    public void mostrarCarro(){

        System.out.println("Marca: " +marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Placa: "+placa);
        System.out.println("Ano Fabricacao: "+ano);
        System.out.println("Valor diaria: "+valorDiaria);
        System.out.println("Disponivel: "+disponivel);
        System.out.println("");


    }

    public boolean alugarCarro () {
        if (disponivel) {
            System.out.println(marca + " Esta Disponivel");
            disponivel = false;

            return true;


        } else {
            System.out.println("Carro INDISPONIVEL");
            return false;
        }
    }

    public boolean devolverCarro(){
           if (!disponivel){
               disponivel = true;
               System.out.println("Voce acabou de devolver o carro " + marca);
               return true;


        }   else {
               System.out.println("Voce nao pode devolver um carro que nao alugou");
               return false;
           }

    }

}
