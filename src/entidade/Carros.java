package entidade;

    public class Carros {

    public    String marca;
    public String modelo;
    public String cor;
    public int numeroPortas;
    public int tamanhoAro;
    public int velocidade;

    public void andar (){
        velocidade += 10;
        System.out.println("O carro esta andando");
        System.out.println("Velocidade atual: " +velocidade + " KM/h");
    }
    public void correr (){
        velocidade += 30;
        System.out.println("Voce esta correndo");
        System.out.println("Velocidade atual: " + velocidade + " KM/h");
    }
    public void parar(){
        if (velocidade <=0){
            System.out.println("Voce nao pode parar um ja carro parado");
            return;
        }

        else if (velocidade <=20){
            System.out.println("Voce Parou o carro");
            velocidade = 0;
            System.out.println(velocidade + "KM/H");
        } else {
            System.out.println("Voce esta muito rapido, tem que freiar antes de parar");
            System.out.println("Velocidade atual:" + velocidade + "KM/h");
        }

       }

       public void frear () {
        if (velocidade <=0){
            System.out.println("Voce nao pode freiar um carro parado");
            return;
        }
        else if (velocidade <=19){
            System.out.println("Voce ja esta lento, tem que parar");
            return;
        } else {
            System.out.println("Voce freiou o carro");
        }  velocidade -=20;
           System.out.println("Velocidade atual: " + velocidade + "KM/h");

    }
        public boolean desligar (){
            if (velocidade >=1) {

                System.out.println("Voce nao pode desligar o carro com ele andando");

                System.out.println("Velocidade atual: " + velocidade + "KM/H");
                return false;


            } else {
                System.out.println("Carro desligado");
                return true;

            }

        }
}
