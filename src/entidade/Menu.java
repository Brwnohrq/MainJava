package entidade;

import java.util.Scanner;

public class Menu {

    Locadora locadora = new Locadora();
    Carro carro = new Carro();

    Scanner sc = new Scanner(System.in);
    boolean rodarMenu = true;
    public void menuRodar(){
        while (rodarMenu){

            System.out.println("MENU LOCADORA GPT");
            System.out.println("[1]: Mostrar Todos os Veiculos");
            System.out.println("[2]: Alugar Veiculo");
            System.out.println("[3]: Devolver Veiculo");
            System.out.println("[4]: Sair da Locadora");
            int opcao = sc.nextInt();

                switch (opcao){

                    case 1:
                        System.out.println("Mostrar Veiculos");
                        locadora.mostrarCarros();
                        break;

                    case 2:

                        System.out.println("Alugar Carros");
                        System.out.println("=============");
                        System.out.println("Qual Carro quer alugar?");
                        System.out.println("[1]: Chevrolet - Onix");
                        System.out.println("[2]: Honda - Civi");
                        System.out.println("[3]: Mercedes-Benz GLA-2OO");
                        System.out.println("[4]: Volkswagem - Nivus");
                        opcao = sc.nextInt();

                            switch (opcao){
                                case 1:

                                    System.out.println("Gostaria de Alugar o Chevrolet Onix?");
                                    System.out.println("[1]: Confirmar");
                                    System.out.println("[2]: Retornar");
                                    int confirmar = sc.nextInt();

                                    if (confirmar ==1){
                                        if (locadora.veiculo1.alugarCarro()){
                                        System.out.println("Por quantos dias vai localo?");
                                        int diasLocado = sc.nextInt();
                                        if (diasLocado > 0){
                                        double valorLocacao1 = (diasLocado * locadora.veiculo1.valorDiaria);
                                        System.out.println("O Valor da locacao fica em " +valorLocacao1);
                                        break;

                                    } else {
                                        System.out.println("Voce nao pode alugar");
                                        break;
                                    }}}

                                case 2:

                                    System.out.println("Gostaria de Alugar o Honda Civic?");
                                    System.out.println("[1]: Confirmar");
                                    System.out.println("[2]: Retornar");
                                    confirmar = sc.nextInt();

                                    if (confirmar ==1){
                                        if (locadora.veiculo2.alugarCarro()){
                                        System.out.println("Por quantos dias vai localo?");
                                        int diasLocado = sc.nextInt();
                                            if (diasLocado > 0){
                                        double valorLocacao2 = (diasLocado * locadora.veiculo2.valorDiaria);
                                        System.out.println("O Valor da locacao fica em " +valorLocacao2);
                                        break;

                                    } else {
                                        System.out.println("Veiculo nao Disponivel pra Locaçao");
                                        break;
                                    }}}

                                case 3:

                                    System.out.println("Gostaria de Alugar o Mercedes-Benz GLA200?");
                                    System.out.println("[1]: Confirmar");
                                    System.out.println("[2]: Retornar");
                                    confirmar = sc.nextInt();

                                    if (confirmar ==1){
                                        if (locadora.veiculo3.alugarCarro()){
                                        System.out.println("Por quantos dias vai localo?");
                                        int diasLocado = sc.nextInt();
                                            if (diasLocado > 0){
                                        double valorLocacao3 = (diasLocado * locadora.veiculo3.valorDiaria);
                                        System.out.println("O Valor da locacao fica em " +valorLocacao3);
                                        break;

                                    } else {
                                        System.out.println("Veiculo nao Disponivel pra Locaçao");
                                        break;
                                    }}}

                                case 4:

                                    System.out.println("Gostaria de Alugar o Volkswagem Nivus?");
                                    System.out.println("[1]: Confirmar");
                                    System.out.println("[2]: Retornar");
                                    confirmar = sc.nextInt();

                                    if (confirmar ==1){
                                        if (locadora.veiculo4.alugarCarro()){
                                        System.out.println("Por quantos dias vai localo?");
                                        int diasLocado = sc.nextInt();

                                            if (diasLocado > 0){

                                        double valorLocacao4 = (diasLocado * locadora.veiculo4.valorDiaria);
                                        System.out.println("O Valor da locacao fica em " +valorLocacao4);
                                        break;

                                    } else {
                                        System.out.println("Retornando ao Menu");
                                        break;
                                    }}}
                                default:
                                    System.out.println("Opcao invalida!");

                            } break;

                    case 3:

                        System.out.println("Devolver veiculos");
                        System.out.println("Qual veiculo gostaria de devolver?");
                        System.out.println("[1]: Chevrolet - Onix");
                        System.out.println("[2]: Honda - Civi");
                        System.out.println("[3]: Mercedes-Benz GLA-2OO");
                        System.out.println("[4]: Volkswagem - Nivus");
                        opcao = sc.nextInt();

                            switch (opcao){
                                case 1:
                                    System.out.println("Devolver Chevrolet Onix");
                                    locadora.veiculo1.devolver();
                                    break;

                                case 2:
                                    System.out.println("Devolver Honda Civic");
                                    locadora.veiculo2.devolver();
                                    break;

                                case 3:
                                    System.out.println("Devolver Mercedes-Benz GLA200");
                                    locadora.veiculo3.devolver();
                                    break;

                                case 4:
                                    System.out.println("Devolver Volkswagem Nivus");
                                    locadora.veiculo4.devolver();
                                    break;
                                default:
                                    System.out.println("Opcao invalida!");

                            }  break;


                    case 4:
                        System.out.println("Saindo da Locadora");
                        rodarMenu =false;
                        break;
                    default:
                        System.out.println("Opcao invalida!");

                }

        }

    }
}
