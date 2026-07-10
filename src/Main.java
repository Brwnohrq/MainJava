import entidade.Pessoa;

public class Main{
    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Brwno";
        pessoa.idade = 28;
        pessoa.altura = 1.75;
        pessoa.peso = 88;

        pessoa.dadosPessoa();


        pessoa.andar();
        pessoa.correr();
        pessoa.aniversario();
        pessoa.comer();

        pessoa.dadosPessoa();

    }
}