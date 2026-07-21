package entidade;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Oficina oficina = new Oficina();

    Veiculos veiculoSelecionado = null;
    boolean whileMenu = true;

    public void rodarMenu() {

        while (whileMenu) {

            System.out.println("\n=======================================");
            System.out.println("         OFICINA MINATEL AUTO");
            System.out.println("=======================================");
            System.out.println("[1] - Mostrar Veículos");
            System.out.println("[2] - Colocar Veículo em Manutenção");
            System.out.println("[3] - Finalizar Manutenção");
            System.out.println("[4] - Realizar Serviços");
            System.out.println("[5] - Valor Total dos Serviços");
            System.out.println("[6] - Finalizar Atendimento");
            System.out.println("[7] - Sair");
            System.out.println("=======================================");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n=======================================");
                    System.out.println("        ESCOLHA O VEÍCULO");
                    System.out.println("=======================================");
                    System.out.println("[1] - Honda Civic");
                    System.out.println("[2] - Honda HR-V");
                    System.out.println("[3] - Ferrari Enzo");
                    System.out.println("[4] - Yamaha XT 660R");
                    System.out.println("[5] - Yamaha Fazer");
                    System.out.println("[6] - Suzuki Suzukinha");
                    System.out.println("[7] - Voltar");
                    System.out.println("=======================================");
                    System.out.print("Escolha um veículo: ");

                    int mostrarVeiculo = sc.nextInt();

                    switch (mostrarVeiculo) {

                        case 1:
                            System.out.println("Honda Civic");
                            System.out.println(oficina.carro1.getMarca());
                            System.out.println(oficina.carro1.getModelo());
                            System.out.println(oficina.carro1.getAnoFabricacao());
                            System.out.println(oficina.carro1.getPlaca());
                            System.out.println(oficina.carro1.getNumeroDePortas());
                            System.out.println(oficina.carro1.isEmManutencao());
                            break;

                        case 2:
                            System.out.println("Honda HR-V");
                            System.out.println(oficina.carro2.getMarca());
                            System.out.println(oficina.carro2.getModelo());
                            System.out.println(oficina.carro2.getAnoFabricacao());
                            System.out.println(oficina.carro2.getPlaca());
                            System.out.println(oficina.carro2.getNumeroDePortas());
                            System.out.println(oficina.carro2.isEmManutencao());
                            break;

                        case 3:
                            System.out.println("Ferrari Enzo");
                            System.out.println(oficina.carro3.getMarca());
                            System.out.println(oficina.carro3.getModelo());
                            System.out.println(oficina.carro3.getAnoFabricacao());
                            System.out.println(oficina.carro3.getPlaca());
                            System.out.println(oficina.carro3.getNumeroDePortas());
                            System.out.println(oficina.carro3.isEmManutencao());
                            break;

                        case 4:
                            System.out.println("Yamaha XT 660R");
                            System.out.println(oficina.moto1.getMarca());
                            System.out.println(oficina.moto1.getModelo());
                            System.out.println(oficina.moto1.getAnoFabricacao());
                            System.out.println(oficina.moto1.getPlaca());
                            System.out.println(oficina.moto1.getCilindradas());
                            break;


                        case 5:
                            System.out.println("Yamaha Fazer");
                            System.out.println(oficina.moto2.getMarca());
                            System.out.println(oficina.moto2.getModelo());
                            System.out.println(oficina.moto2.getAnoFabricacao());
                            System.out.println(oficina.moto2.getPlaca());
                            System.out.println(oficina.moto2.getCilindradas());
                            break;

                        case 6:
                            System.out.println("Suzuki Suzukinha");
                            System.out.println(oficina.moto3.getMarca());
                            System.out.println(oficina.moto3.getModelo());
                            System.out.println(oficina.moto3.getAnoFabricacao());
                            System.out.println(oficina.moto3.getPlaca());
                            System.out.println(oficina.moto3.getCilindradas());
                            break;

                        case 7:
                            break;

                        default:
                            System.out.println("Opcao Invalida!");
                            break;
                    }

                case 2:
                    System.out.println("\n=======================================");
                    System.out.println("          MENU DE MANUTENÇÃO");
                    System.out.println("=======================================");
                    System.out.println("[1] - Honda Civic");
                    System.out.println("[2] - Honda HR-V");
                    System.out.println("[3] - Ferrari Enzo");
                    System.out.println("[4] - Yamaha XT 660R");
                    System.out.println("[5] - Yamaha Fazer");
                    System.out.println("[6] - Suzuki Suzukinha");
                    System.out.println("[7] - Voltar");
                    System.out.println("=======================================");
                    System.out.print("Escolha um veículo: ");

                    int escolhaManutencao = sc.nextInt();

                    switch (escolhaManutencao) {

                        case 1:
                            System.out.println("MANUTENCAO");
                            System.out.printf("Gostaria de mandar o %s %s para a Manutencao? %n", oficina.carro1.getMarca(), oficina.carro1.getModelo());
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");
                            int confirmarManutencao = sc.nextInt();
                            if (confirmarManutencao == 1) {
                                oficina.carro1.emManutencao();
                            } else if (confirmarManutencao == 2) {
                                System.out.println("Manutenção cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }

                            break;


                        case 2:
                            System.out.println("MANUTENCAO");
                            System.out.printf("Gostaria de mandar o %s %s para a Manutencao? %n", oficina.carro2.getMarca(), oficina.carro2.getModelo());
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");
                            confirmarManutencao = sc.nextInt();
                            if (confirmarManutencao == 1) {
                                oficina.carro2.emManutencao();
                            } else if (confirmarManutencao == 2) {
                                System.out.println("Manutenção cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;

                        case 3:
                            System.out.println("MANUTENCAO");
                            System.out.printf("Gostaria de mandar o %s %s para a Manutencao? %n", oficina.carro3.getMarca(), oficina.carro3.getModelo());
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");
                            confirmarManutencao = sc.nextInt();
                            if (confirmarManutencao == 1) {
                                oficina.carro3.emManutencao();
                            } else if (confirmarManutencao == 2) {
                                System.out.println("Manutenção cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;

                        case 4:
                            System.out.println("MANUTENCAO");
                            System.out.printf("Gostaria de mandar a %s %s para a Manutencao ? %n", oficina.moto1.getMarca(), oficina.moto1.getModelo());
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");
                            confirmarManutencao = sc.nextInt();
                            if (confirmarManutencao == 1) {
                                oficina.moto1.emManutencao();
                            } else if (confirmarManutencao == 2) {
                                System.out.println("Manutenção cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;

                        case 5:
                            System.out.println("MANUTENCAO");
                            System.out.printf("Gostaria de mandar a %s %s para a Manutencao ? %n", oficina.moto2.getMarca(), oficina.moto2.getModelo());
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");
                            confirmarManutencao = sc.nextInt();
                            if (confirmarManutencao == 1) {
                                oficina.moto2.emManutencao();
                            } else if (confirmarManutencao == 2) {
                                System.out.println("Manutenção cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;

                        case 6:

                            System.out.println("MANUTENCAO");
                            System.out.printf("Gostaria de mandar a %s %s para a Manutencao ? %n", oficina.moto3.getMarca(), oficina.moto3.getModelo());
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");
                            confirmarManutencao = sc.nextInt();
                            if (confirmarManutencao == 1) {
                                oficina.moto3.emManutencao();
                            } else if (confirmarManutencao == 2) {
                                System.out.println("Manutenção cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;

                        case 7:
                            System.out.println("RETORNANDO");
                            break;
                    }
                    break;


                case 3:
                    System.out.println("\n=======================================");
                    System.out.println("      FINALIZAR MANUTENÇÃO");
                    System.out.println("=======================================");
                    System.out.println("[1] - Honda Civic");
                    System.out.println("[2] - Honda HR-V");
                    System.out.println("[3] - Ferrari Enzo");
                    System.out.println("[4] - Yamaha XT 660R");
                    System.out.println("[5] - Yamaha Fazer");
                    System.out.println("[6] - Suzuki Suzukinha");
                    System.out.println("[7] - Voltar");
                    System.out.println("=======================================");
                    System.out.print("Escolha um veículo: ");

                    int finalizarManutencao = sc.nextInt();

                    switch (finalizarManutencao) {

                        case 1:
                            System.out.printf(
                                    "Gostaria de finalizar a manutenção do %s %s?%n",
                                    oficina.carro1.getMarca(),
                                    oficina.carro1.getModelo()
                            );
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");

                            int confirmarFinalizacao = sc.nextInt();
                            if (confirmarFinalizacao == 1) {
                                oficina.carro1.veiculoFinalizado();
                            } else if (confirmarFinalizacao == 2) {
                                System.out.println("Finalizacao cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }

                            break;


                        case 2:

                            System.out.printf(
                                    "Gostaria de finalizar a manutenção do %s %s?%n",
                                    oficina.carro1.getMarca(),
                                    oficina.carro1.getModelo()
                            );
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");

                            confirmarFinalizacao = sc.nextInt();
                            if (confirmarFinalizacao == 1) {
                                oficina.carro2.veiculoFinalizado();
                            } else if (confirmarFinalizacao == 2) {
                                System.out.println("Finalizacao cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }

                        case 3:

                            System.out.printf(
                                    "Gostaria de finalizar a manutenção do %s %s?%n",
                                    oficina.carro3.getMarca(),
                                    oficina.carro3.getModelo()
                            );
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");

                            confirmarFinalizacao = sc.nextInt();
                            if (confirmarFinalizacao == 1) {
                                oficina.carro3.veiculoFinalizado();
                            } else if (confirmarFinalizacao == 2) {
                                System.out.println("Finalizacao cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }

                        case 4:

                            System.out.printf(
                                    "Gostaria de finalizar a manutenção do %s %s?%n",
                                    oficina.moto1.getMarca(),
                                    oficina.moto1.getModelo()
                            );
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");

                            confirmarFinalizacao = sc.nextInt();
                            if (confirmarFinalizacao == 1) {
                                oficina.moto1.veiculoFinalizado();
                            } else if (confirmarFinalizacao == 2) {
                                System.out.println("Finalizacao cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }

                        case 5:

                            System.out.printf(
                                    "Gostaria de finalizar a manutenção do %s %s?%n",
                                    oficina.moto2.getMarca(),
                                    oficina.moto2.getModelo()
                            );
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");

                            confirmarFinalizacao = sc.nextInt();
                            if (confirmarFinalizacao == 1) {
                                oficina.moto2.veiculoFinalizado();
                            } else if (confirmarFinalizacao == 2) {
                                System.out.println("Finalizacao cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }

                        case 6:
                            System.out.printf(
                                    "Gostaria de finalizar a manutenção do %s %s?%n",
                                    oficina.moto3.getMarca(),
                                    oficina.moto3.getModelo()
                            );
                            System.out.println("[1]: SIM ");
                            System.out.println("[2]: NAO ");

                            confirmarFinalizacao = sc.nextInt();
                            if (confirmarFinalizacao == 1) {
                                oficina.moto3.veiculoFinalizado();
                            } else if (confirmarFinalizacao == 2) {
                                System.out.println("Finalizacao cancelada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }

                        case 7:
                            System.out.println("Retornando!");
                            break;
                        default:
                            System.out.println("Opcao Invalida");
                            break;
                    }


                case 4:
                    System.out.println("\n=======================================");
                    System.out.println("         REALIZAR SERVIÇOS");
                    System.out.println("=======================================");
                    System.out.println("[1] - Honda Civic");
                    System.out.println("[2] - Honda HR-V");
                    System.out.println("[3] - Ferrari Enzo");
                    System.out.println("[4] - Yamaha XT 660R");
                    System.out.println("[5] - Yamaha Fazer");
                    System.out.println("[6] - Suzuki Suzukinha");
                    System.out.println("[7] - Voltar");
                    System.out.println("=======================================");
                    System.out.print("Escolha um veículo: ");

                    int veiculoSelecionad = sc.nextInt();

                    switch (veiculoSelecionad) {

                        case 1:
                            veiculoSelecionado = oficina.carro1;
                            break;

                        case 2:
                            veiculoSelecionado = oficina.carro2;
                            break;

                        case 3:
                            veiculoSelecionado = oficina.carro3;
                            break;

                        case 4:
                            veiculoSelecionado = oficina.moto1;
                            break;

                        case 5:
                            veiculoSelecionado = oficina.moto2;
                            break;

                        case 6:
                            veiculoSelecionado = oficina.moto3;
                            break;

                        case 7:
                            System.out.println("Voltando");
                            break;

                        default:
                            System.out.println("Opcao Invalida!");
                            break;
                    }


                    System.out.println("\n=======================================");
                    System.out.println("          SERVIÇOS DISPONÍVEIS");
                    System.out.println("=======================================");
                    System.out.println("[1] - Trocar óleo");
                    System.out.println("[2] - Trocar pneus");
                    System.out.println("[3] - Fazer revisão completa");
                    System.out.println("[4] - Mostrar valor acumulado");
                    System.out.println("[5] - Voltar");
                    System.out.println("=======================================");
                    System.out.print("Escolha um serviço: ");

                    int servicoDisponivel = sc.nextInt();

                    switch (servicoDisponivel) {
                        case 1:
                            if (!veiculoSelecionado.isEmManutencao()) {
                                System.out.println("O veículo precisa estar em manutenção.");
                                break;
                            }

                            oficina.trocarOleo();
                            break;

                        case 2:

                            if (!veiculoSelecionado.isEmManutencao()) {
                                System.out.println("O veículo precisa estar em manutenção.");
                                break;
                            }

                            System.out.println("Quantos pneus deseja trocar?");
                            int trocarPneus = sc.nextInt();

                            if (veiculoSelecionado instanceof Carros) {

                                if (trocarPneus >= 1 && trocarPneus <= 4) {
                                    oficina.trocarPneus(trocarPneus);
                                    System.out.println("Troca de pneus feita com sucesso!");

                                } else {
                                    System.out.println("Um carro só pode trocar entre 1 e 4 pneus.");
                                }

                            } else if (veiculoSelecionado instanceof Motos) {

                                if (trocarPneus >= 1 && trocarPneus <= 2) {
                                    oficina.trocarPneus(trocarPneus);
                                    System.out.println("Troca de pneus feita com sucesso!");
                                } else {
                                    System.out.println("Uma moto só pode trocar entre 1 e 2 pneus.");
                                }
                            }

                            break;


                        case 3:

                            if (!veiculoSelecionado.isEmManutencao()) {
                                System.out.println("O veículo precisa estar em manutenção.");
                                break;
                            }

                            oficina.fazerRevisao();
                            break;

                        case 4:
                            System.out.println("TOTAL DOS SERVICOS");
                            oficina.valorTotalServicos();
                            break;

                        case 5:
                            System.out.println("Voltando");
                            break;

                        default:
                            System.out.println("Opcao invalida");
                    }
                    break;

                case 5:
                    System.out.println("====VALOR TOTAL====");
                    oficina.valorTotalServicos();
                    break;

                case 6:
                    System.out.println("=====FINALIZAR MANUTENCAO=====");
                    if (veiculoSelecionado.emManutencao()) {
                        veiculoSelecionado.veiculoFinalizado();
                        break;
                    } else {

                    }
                    break;


                case 7:
                    System.out.println("SAINDO");
                    whileMenu = false;
                    break;

            }


        }
    }
}



