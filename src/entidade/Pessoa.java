package entidade;

public class Pessoa {

    public String nome;
    public int idade;
    public double altura;
    public double peso;

    public void andar (){
        System.out.println(nome + " Esta Andando");
        peso -=0.5;
        System.out.println(peso);
    }
    public void aniversario(){
        System.out.println(" Feliz aniversario " +nome);
        idade++;
        System.out.println(idade);
    }
    public void correr(){
        System.out.println(nome + " Esta correndo");
        peso -=1;
        System.out.println(peso);
    }
    public void comer (){
        System.out.println(nome + " Esta comendo");
        peso ++;
        System.out.println(peso);
    }
    public void dadosPessoa(){

        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Altura: " +altura);
        System.out.println("Peso: " + peso);
        System.out.println("");
    }

}
