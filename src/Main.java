import entidade.Carros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carros carro = new Carros();

        carro.marca = "Bmw";
        carro.modelo = "x1";
        carro.cor = "Branco";
        carro.numeroPortas = 4;
        carro.tamanhoAro = 17;
        carro.velocidade = 0;
        int opcaoCarro = 0;
        Boolean carroLigado = true;

        while (carroLigado) {

            System.out.println("[1] Andar");
            System.out.println("[2] Correr");
            System.out.println("[3] Freiar");
            System.out.println("[4] Parar o Carro");
            System.out.println("[5] Desligar o carro");

            opcaoCarro = sc.nextInt();

            switch (opcaoCarro) {
                case 1: {
                    carro.andar();
                    break;
                }

                case 2: {
                    carro.correr();
                }
                break;

                case 3: {

                    carro.frear();
                }
                break;

                case 4: {
                    carro.parar();
                }
                break;

                case 5: {
                        boolean desligou = carro.desligar();

                        if (desligou) {
                            carroLigado = false;
                        }

                        break;
                    }


                default:
                    System.out.println("Opcao invalida");
            }



        }
    }
}