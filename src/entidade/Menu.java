package entidade;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Locadora locadora = new Locadora();


    boolean locadoraRodar = true;

    public void menuRodar(){
        while (locadoraRodar){
        System.out.println("Painel de Aluguel Locadora GPT");
        System.out.println("[1]: Mostrar Veiculos");
        System.out.println("[2]: Alugar Veiculo");
        System.out.println("[3]: Devolver Veiculo");
        System.out.println("[4]: Sair da Locadora");
        System.out.println("");
        System.out.println("Digite a Opcao desejada");

        int opcao = sc.nextInt();
            switch (opcao){

                case 1:
                    System.out.println("Conheça nossos veiculos");
                        locadora.mostrarCarros();


                    break;

                case 2:
                    System.out.println("Qual carro te interessou pra Alugar?");
                    System.out.println("[1]: Chevrolet Onix ");
                    System.out.println("[2]: BMW x1 ");
                    System.out.println("[3]: Mercedes-Benz c180 ");
                        int alugarCarro = sc.nextInt();

                            switch (alugarCarro){
                                case 1:
                                    System.out.println("Chevrolet Onix ");
                                    if (locadora.veiculo1.alugarCarro()){

                                        System.out.println("Por quantos dias vai localo?");
                                        int diasLocado = sc.nextInt();
                                        System.out.println("Voce vai localo por " + diasLocado + " dias");
                                        double valorLocacaoOnix = (diasLocado * locadora.veiculo1.valorDiaria);
                                        System.out.println("Valor total da Locação fica em" +valorLocacaoOnix);
                                        System.out.println("");
                                        break;

                                    } else {
                                    } break;

                                case 2:
                                    System.out.println("BMW - X1");
                                    if (locadora.veiculo2.alugarCarro()) {

                                        System.out.println("Por quantos dias vai localo?");
                                        int diasLocado = sc.nextInt();
                                        System.out.println("Voce vai localo por " + diasLocado + " dias");
                                        double valorLocacaoBmw = (diasLocado * locadora.veiculo2.valorDiaria);
                                        System.out.println("Valor total da Locação fica em " +valorLocacaoBmw);
                                        System.out.println("");
                                        break;

                                    } else {
                                        System.out.println("Veiculo indisponivel pra Locação");
                                    } break;

                                case 3:
                                        System.out.println("Mercedes Benz - c180");
                                    if (locadora.veiculo3.alugarCarro()) {

                                        System.out.println("Por quantos dias vai localo?");
                                        int diasLocado = sc.nextInt();
                                        System.out.println("Voce vai localo por " + diasLocado + " dias");
                                        double valorLocacaoMercedez = (diasLocado * locadora.veiculo3.valorDiaria);
                                        System.out.println("Valor total da Locação fica em " +valorLocacaoMercedez);
                                        System.out.println("");

                                     } else {
                                        System.out.println("Veiculo indisponivel pra Locação");
                                    } break;
                                default:
                                    System.out.println("Opcao Invalida!");
                            } break;

                case 3:
                    System.out.println("Devolver Veiculo");
                    System.out.println("");
                    System.out.println("Qual Veiculo vai devolver?");
                    System.out.println("[1] - Chevrolet Onix");
                    System.out.println("[2] - BMW X1");
                    System.out.println("[3] - Mercedes Benz c180");
                    int devolver = sc.nextInt();
                        switch (devolver){

                            case 1:
                                locadora.veiculo1.devolverCarro();
                                break;
                            case 2:
                                locadora.veiculo2.devolverCarro();
                                break;
                            case 3:
                                locadora.veiculo3.devolverCarro();
                                break;
                        } break;

                case 4:
                    System.out.println("Saindo da Locadora");
                    locadoraRodar =false;
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
    }

}}
