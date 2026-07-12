package entidade;

import java.util.Scanner;

public class Biblioteca {


    Livros livrosHP;
    Livros livrosSA;
    Livros livrosHB;

    Scanner sc = new Scanner(System.in);

    public Biblioteca() {

        livrosHP = new Livros();

        livrosHP.autor = "J.K Rolling";
        livrosHP.titulo = "Harry Potter e o Calice de Fogo";
        livrosHP.paginas = 475;
        livrosHP.disponivel = true;


        livrosSA = new Livros();

        livrosSA.autor = "J.R.R Tolkien";
        livrosSA.titulo = "O Senhor dos Aneis e o Anel do Poder";
        livrosSA.paginas = 405;
        livrosSA.disponivel = true;

        livrosHB = new Livros();

        livrosHB.autor = "J.R.R Tolkien";
        livrosHB.titulo = "O Hobbit";
        livrosHB.paginas = 521;
        livrosHB.disponivel = true;

    }

    public void devolverTodos(){
        livrosHB.devolver();
        livrosSA.devolver();
        livrosHP.devolver();

    }

    public void mostrarLivros() {

        livrosHP.mostrarLivro();
        livrosSA.mostrarLivro();
        livrosHB.mostrarLivro();

    }
    public void emprestar () {
        System.out.println("Qual livro voce quer emprestar?");
        System.out.println("[1] - Harry Potter");
        System.out.println("[2] - Senhor dos Aneis");
        System.out.println("[3] - O Hobbit");
        int escolha = sc.nextInt();
        switch (escolha) {

            case 1:
                System.out.println("Escolheu Harry Potter");
                livrosHP.emprestar();
                break;
            case 2:
                System.out.println("Escolheu O Senhor dos Aneis");
                livrosSA.emprestar();
                break;
            case 3:
                System.out.println("Escolheu O Hobbit");
                livrosHB.emprestar();
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
            public void devolver(){

                System.out.println("Qual livro deseja devolver?");
                System.out.println("[1] Harry Potter");
                System.out.println("[2] Senhor dos Aneis");
                System.out.println("[3] O Hobbit");
                System.out.println("[4] TODOS");

                int escolha = sc.nextInt();

                switch(escolha){

                    case 1:
                        livrosHP.devolver();
                        break;

                    case 2:
                        livrosSA.devolver();
                        break;

                    case 3:
                        livrosHB.devolver();
                        break;

                    case 4:
                        devolverTodos();
                        break;

                    default:
                        System.out.println("Opção inválida");
                }
            }
        }



