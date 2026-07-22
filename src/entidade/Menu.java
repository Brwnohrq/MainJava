package entidade;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Oficina oficina = new Oficina();

    Veiculos veiculoSelecionado = null;
    boolean whileMenu = true;


    public Veiculos selecionarVeiculo(int opcao) {

        switch (opcao) {

            case 1:
                return oficina.carro1;

            case 2:
                return oficina.carro2;

            case 3:
                return oficina.carro3;

            case 4:
                return oficina.moto1;

            case 5:
                return oficina.moto2;

            case 6:
                return oficina.moto3;

            default:
                return null;
        }
    }

    public void mostrarMenuVeiculos() {

        System.out.println("\n=======================================");
        System.out.println("           ESCOLHA O VEÍCULO");
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
    }


    public void mostrarDadosVeiculo(Veiculos veiculo) {

        System.out.println("\n=======================================");
        System.out.println("          DADOS DO VEÍCULO");
        System.out.println("=======================================");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano de fabricação: " + veiculo.getAnoFabricacao());
        System.out.println("Placa: " + veiculo.getPlaca());

        if (veiculo instanceof Carros) {

            Carros carroSelecionado = (Carros) veiculo;

            System.out.println(
                    "Número de portas: "
                            + carroSelecionado.getNumeroDePortas()
            );

        } else if (veiculo instanceof Motos) {

            Motos motoSelecionada = (Motos) veiculo;

            System.out.println(
                    "Cilindradas: "
                            + motoSelecionada.getCilindradas()
            );
        }

        System.out.println(
                "Está em manutenção: "
                        + veiculo.isEmManutencao()
        );

        System.out.println("=======================================");
    }


    public void consultarVeiculo() {

        mostrarMenuVeiculos();

        int opcaoVeiculo = sc.nextInt();

        if (opcaoVeiculo == 7) {
            System.out.println("Retornando ao menu principal.");
            return;
        }

        veiculoSelecionado = selecionarVeiculo(opcaoVeiculo);

        if (veiculoSelecionado == null) {
            System.out.println("Opção inválida!");
            return;
        }

        mostrarDadosVeiculo(veiculoSelecionado);
    }

    public void colocarEmManutencao() {

        mostrarMenuVeiculos();

        int opcaoVeiculo = sc.nextInt();

        if (opcaoVeiculo == 7) {
            System.out.println("Retornando ao menu principal.");
            return;
        }

        veiculoSelecionado = selecionarVeiculo(opcaoVeiculo);

        if (veiculoSelecionado == null) {
            System.out.println("Opção inválida!");
            return;
        }

        if (veiculoSelecionado.isEmManutencao()) {
            System.out.println(
                    "Esse veículo já está em manutenção."
            );

            return;
        }

        System.out.println("\n=======================================");
        System.out.println("         CONFIRMAR MANUTENÇÃO");
        System.out.println("=======================================");
        System.out.println(
                "Veículo: "
                        + veiculoSelecionado.getMarca()
                        + " "
                        + veiculoSelecionado.getModelo()
        );
        System.out.println("[1] - Sim");
        System.out.println("[2] - Não");
        System.out.print("Escolha uma opção: ");

        int confirmarManutencao = sc.nextInt();

        if (confirmarManutencao == 1) {

            veiculoSelecionado.emManutencao();

            System.out.println(
                    "Veículo colocado em manutenção com sucesso!"
            );

        } else if (confirmarManutencao == 2) {

            System.out.println("Manutenção cancelada.");

        } else {

            System.out.println("Opção inválida.");
        }
    }


    public void finalizarManutencao() {

        mostrarMenuVeiculos();

        int opcaoVeiculo = sc.nextInt();

        if (opcaoVeiculo == 7) {
            System.out.println("Retornando ao menu principal.");
            return;
        }

        veiculoSelecionado = selecionarVeiculo(opcaoVeiculo);

        if (veiculoSelecionado == null) {
            System.out.println("Opção inválida!");
            return;
        }

        if (!veiculoSelecionado.isEmManutencao()) {

            System.out.println(
                    "Esse veículo não está em manutenção."
            );

            return;
        }

        System.out.println("\n=======================================");
        System.out.println("       FINALIZAR MANUTENÇÃO");
        System.out.println("=======================================");
        System.out.println(
                "Veículo: "
                        + veiculoSelecionado.getMarca()
                        + " "
                        + veiculoSelecionado.getModelo()
        );
        System.out.println("[1] - Sim");
        System.out.println("[2] - Não");
        System.out.print("Escolha uma opção: ");

        int confirmarFinalizacao = sc.nextInt();

        if (confirmarFinalizacao == 1) {

            veiculoSelecionado.veiculoFinalizado();

            System.out.println(
                    "Manutenção finalizada com sucesso!"
            );

        } else if (confirmarFinalizacao == 2) {

            System.out.println("Finalização cancelada.");

        } else {

            System.out.println("Opção inválida.");
        }
    }

    /*
     * Menu dos serviços realizados no veículo.
     */
    public void realizarServicos() {

        mostrarMenuVeiculos();

        int opcaoVeiculo = sc.nextInt();

        if (opcaoVeiculo == 7) {
            System.out.println("Retornando ao menu principal.");
            return;
        }

        veiculoSelecionado = selecionarVeiculo(opcaoVeiculo);

        if (veiculoSelecionado == null) {
            System.out.println("Opção inválida!");
            return;
        }

        if (!veiculoSelecionado.isEmManutencao()) {

            System.out.println(
                    "O veículo precisa estar em manutenção "
                            + "para realizar serviços."
            );

            return;
        }

        boolean rodarMenuServicos = true;

        while (rodarMenuServicos) {

            System.out.println("\n=======================================");
            System.out.println("          SERVIÇOS DISPONÍVEIS");
            System.out.println("=======================================");
            System.out.println(
                    "Veículo: "
                            + veiculoSelecionado.getModelo()
            );
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

                    oficina.trocarOleo();

                    System.out.println(
                            "Troca de óleo realizada com sucesso!"
                    );

                    break;

                case 2:

                    trocarPneus();

                    break;

                case 3:

                    oficina.fazerRevisao();

                    System.out.println(
                            "Revisão completa realizada com sucesso!"
                    );

                    break;

                case 4:

                    System.out.println("\n===== VALOR ACUMULADO =====");

                    oficina.valorTotalServicos();

                    break;

                case 5:

                    System.out.println(
                            "Retornando ao menu principal."
                    );

                    rodarMenuServicos = false;

                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;
            }
        }
    }

    /*
     * Faz a troca de pneus de acordo com o tipo do veículo.
     */
    public void trocarPneus() {

        System.out.print("Quantos pneus deseja trocar? ");

        int quantidadePneus = sc.nextInt();

        if (veiculoSelecionado instanceof Carros) {

            if (quantidadePneus >= 1 && quantidadePneus <= 4) {

                oficina.trocarPneus(quantidadePneus);

                System.out.println(
                        "Troca de pneus realizada com sucesso!"
                );

            } else {

                System.out.println(
                        "Um carro pode trocar entre 1 e 4 pneus."
                );
            }

        } else if (veiculoSelecionado instanceof Motos) {

            if (quantidadePneus >= 1 && quantidadePneus <= 2) {

                oficina.trocarPneus(quantidadePneus);

                System.out.println(
                        "Troca de pneus realizada com sucesso!"
                );

            } else {

                System.out.println(
                        "Uma moto pode trocar entre 1 e 2 pneus."
                );
            }
        }
    }

    /*
     * Mostra o valor total dos serviços.
     */
    public void mostrarValorTotal() {

        System.out.println("\n=======================================");
        System.out.println("       VALOR TOTAL DOS SERVIÇOS");
        System.out.println("=======================================");

        oficina.valorTotalServicos();

        System.out.println("=======================================");
    }

    /*
     * Finaliza o atendimento atual.
     */
    public void finalizarAtendimento() {

        System.out.println("\n=======================================");
        System.out.println("        FINALIZAR ATENDIMENTO");
        System.out.println("=======================================");

        mostrarValorTotal();

        System.out.println(
                "Atendimento finalizado com sucesso!"
        );

        veiculoSelecionado = null;
    }

    /*
     * Menu principal.
     */
    public void rodarMenu() {

        while (whileMenu) {

            System.out.println("\n=======================================");
            System.out.println("         OFICINA MINATEL AUTO");
            System.out.println("=======================================");
            System.out.println("[1] - Mostrar veículos");
            System.out.println("[2] - Colocar veículo em manutenção");
            System.out.println("[3] - Finalizar manutenção");
            System.out.println("[4] - Realizar serviços");
            System.out.println("[5] - Valor total dos serviços");
            System.out.println("[6] - Finalizar atendimento");
            System.out.println("[7] - Sair");
            System.out.println("=======================================");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    consultarVeiculo();

                    break;

                case 2:

                    colocarEmManutencao();

                    break;

                case 3:

                    finalizarManutencao();

                    break;

                case 4:

                    realizarServicos();

                    break;

                case 5:

                    mostrarValorTotal();

                    break;

                case 6:

                    finalizarAtendimento();

                    break;

                case 7:

                    System.out.println(
                            "Saindo da Oficina Minatel Auto."
                    );

                    whileMenu = false;

                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;
            }
        }

        sc.close();
    }
}