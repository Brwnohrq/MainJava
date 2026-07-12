package entidade;

import java.util.Scanner;
import entidade.Biblioteca;
public class Menu {

    Biblioteca biblioteca = new Biblioteca();


    Scanner sc = new Scanner(System.in);

    boolean rodarMenu = true;


    public void rodarMenu() {
        while (rodarMenu) {
            System.out.println("Biblioteca Online GPT");
            System.out.println("=====================");
            System.out.println("[1] = MOSTRAR LIVROS");
            System.out.println("[2] = EMPRESTAR");
            System.out.println("[3] = DEVOLVER");
            System.out.println("[4] = SAIR DA BIBLIOTECA");
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    biblioteca.mostrarLivros();
                    break;

                case 2:
                    System.out.println("Livros");
                    System.out.println("[1] - Harry Potter");
                    System.out.println("[2] - Senhor dos Aneis");
                    System.out.println("[3] - O Hobbit");

                    int escolher = sc.nextInt();


                    switch (escolher) {

                        case 1:
                            System.out.println("Harry Potter");
                            biblioteca.HarryPotter.emprestar();
                            break;

                        case 2:
                            System.out.println("Senhor dos Aneis");
                            biblioteca.SenhorAneis.emprestar();
                            break;

                        case 3:
                            System.out.println("O Hobbit");
                            biblioteca.OHobbit.emprestar();
                            break;

                        default:
                            System.out.println("Opcao invalida!");
                            break;
                    } break;

                case 3:
                    System.out.println("Devolvendo Livros");
                    System.out.println("[1] - Devolver Harry Potter");
                    System.out.println("[2] - Devolver Senhor dos Aneis");
                    System.out.println("[3] - Devolver O Hobbit");

                    int escolhaDevolver = sc.nextInt();
                        switch (escolhaDevolver){
                            case 1:
                                System.out.println("Devolvendo Harry Potter");
                                biblioteca.HarryPotter.devolver();
                                break;

                            case 2:
                                System.out.println("Devolvendo Senhor dos Aneis");
                                biblioteca.SenhorAneis.devolver();
                                break;

                            case 3:
                                System.out.println("Devolvendo O Hobbit");
                                biblioteca.OHobbit.devolver();
                                break;
                        }
                    break;

                case 4:
                    System.out.println("Desligando Aplicativo");
                    rodarMenu = false;
                    break;

            }

        }

    }
}

