import entidade.Biblioteca;
import entidade.Livros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao =0;

        Biblioteca biblioteca = new Biblioteca();
        Livros Livros = new Livros();

        while (opcao !=4){

        System.out.println("Biblioteca");
        System.out.println("[1]: Mostrar Livro");
        System.out.println("[2]: Emprestar Livro");
        System.out.println("[3]: Devolver Livro");
        System.out.println("[4]: Sair do Sistema");
        opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Mostrar Livros");
                    biblioteca.mostrarLivros();
                    System.out.println("");

                    break;

                case 2:
                    System.out.println("Emprestar Livro");
                    biblioteca.emprestar();


                    break;

                case 3:
                    System.out.println("Devolver Livro");
                    biblioteca.devolver();


                    break;

                case 4:
                    System.out.println("Sair do Sistema");
                    System.out.println("Desligando..");
                    break;

                default:
                    System.out.println("Opcao invalida");


            }




    }
}}