
import javax.crypto.spec.PSource;
import java.util.Scanner;

public class BancoSV3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String historico = "";

        boolean menuIniciar = true;

        double deposito =0;
        double saldo = 500;
        double saque =0;
        int escolhaDeposito =0;
        int valorPix = 0;
        boolean telefoneWV = true;

        while (menuIniciar) {
            System.out.println("==================");
            System.out.println("MENU INICIAL BANCO");
            System.out.println("==================");
            System.out.println("");
            System.out.println("Opcao 1 = DEPOSITO");
            System.out.println("Opcao 2 = SAQUE");
            System.out.println("Opcao 3 = AREA PIX");
            System.out.println("Opcao 4 = EXTRATO");
            System.out.println("Opcao 5 = SAIR");
            System.out.println("Digite a opcao desejada");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("=================");
                    System.out.println("DEPOSITO BANCARIO");
                    System.out.println("=================");
                    System.out.println("");
                    boolean depositoW = (true);
                    while (depositoW) {

                        System.out.println("Digite o valor que quer depositar");
                        deposito = scanner.nextDouble();
                        if (deposito <= 0) {
                            System.out.println("Voce nao pode depositar esse tipo de valor");
                            continue;
                        } else {
                            System.out.println("");
                        }
                        System.out.println("Confirme o valor do Deposito de " + deposito);
                        System.out.println("Opcao 1 = SIM, Depositar " + deposito);
                        System.out.println("Opcao 2 = Nao, Digitar outro valor a ser depositado");
                        escolhaDeposito = scanner.nextInt();
                        switch (escolhaDeposito) {
                            case 1:
                                System.out.println("DEPOSITO DE R$ " + deposito + " efetuado com sucesso \n");
                                System.out.println("Voltando ao menu inicial, aguarde.");
                                saldo += deposito;
                                historico += "DEPOSITO DE R$=" + deposito + "\n";
                                depositoW = false;
                                break;

                            case 2:
                                System.out.println("Repita o processo");
                                continue;
                        }

                    }
                    break;

                case 2:
                    System.out.println("==============");
                    System.out.println("SAQUE BANCARIO");
                    System.out.println("==============");
                    System.out.println("");
                    boolean saqueW = (true);
                    while (saqueW) {

                        System.out.println("Digite o valor que deseja sacar");
                        saque = scanner.nextDouble();
                        if (saque > saldo) {
                            System.out.println("Voce nao pode sacar mais do que tem, seu saldo é de " + saldo);
                            break;

                        } else {
                            System.out.println("");
                        }
                        System.out.println("Voce esta fazendo um saque de + " + saque + " confirma?");
                        System.out.println("Opcao 1 = SIM, confirmar");
                        System.out.println("Opcao 2 = Nao, Digitar outro saque");
                        int saqueS = 0;
                        saqueS = scanner.nextInt();
                        switch (saqueS) {
                            case 1:
                                System.out.println("SAQUE DE R$ = " + saque + "efetuado com sucesso");
                                System.out.println("Voltando ao menu inicial, aguarde.");
                                saldo -= saque;
                                historico += "SAQUE DE RS = " + saque + "\n";
                                saqueW = false;
                                break;

                            case 2:
                                System.out.println("Refaca a operacao de saque");
                                continue;

                        }
                    }
                    break;


                case 3:
                    System.out.println("=================");
                    System.out.println("ACESSO A AREA PIX");
                    System.out.println("=================");
                    System.out.println("Escolha qual a chave PIX");
                    System.out.println("Opcao 1 = Chave Pix (CPF)");
                    System.out.println("Opcao 2 = Chave Pix (Telefone)");
                    int escolhaChave = scanner.nextInt();
                    if (escolhaChave < 1 || escolhaChave > 3) {
                        System.out.println("Opcao invalida");
                        break;
                    } else {
                        System.out.println("Voce escolheu a Opcao " + escolhaChave);
                    }
                    switch (escolhaChave) {
                        case 1:
                            System.out.println("Chave Pix CPF");
                            System.out.println("=============");
                            boolean cpfW = true;
                            while (cpfW) {
                                System.out.println("Digite o CPF de quem vai receber o pix");
                                long cpf = scanner.nextLong();
                                System.out.println("o cpf que vai receber o pix é o (CPF) " + cpf + " confirma?");
                                System.out.println("Opcao 1 = Confirmar Chave PIX (CPF)");
                                System.out.println("Opcao 2 = Recusar chave PIX (CPF)");
                                int cpfC = scanner.nextInt();
                                switch (cpfC) {
                                    case 1:
                                        System.out.println("Chave PIX confirmada com sucesso");
                                        cpfW = false;
                                        boolean pixW = true;
                                        while (pixW) {
                                            System.out.println("Digite o valor que quer enviar");
                                            valorPix = scanner.nextInt();
                                            System.out.println("O valor que quer enviar é de " + valorPix + " ?");
                                            System.out.println("Opcao 1 = Sim, confirmar valor de " + valorPix);
                                            System.out.println("Opcao 2 = Nao, colocar outro valo para enviar");
                                            int confirmarPix = scanner.nextInt();
                                            switch (confirmarPix) {
                                                case 1:
                                                    System.out.println("Voce confirmou o valor da transferencia de " + valorPix);
                                                    pixW = false;
                                                    break;

                                                case 2:
                                                    System.out.println("Refazendo a Operacao novamente");
                                                    continue;

                                                default:
                                                    System.out.println("Opcao invalida");
                                                    break;
                                            }
                                            break;
                                        }
                                        if (valorPix <= 0) {
                                            System.out.println("VALOR INVALIDO");
                                        } else if (valorPix > saldo) {
                                            System.out.println("Saldo insuficiente para essa acao, use seu saldo limite " + saldo);
                                        } else {
                                            System.out.println("Voce enviou um PIX de " + valorPix + "Para o (CPF) " + cpf);
                                            saldo -= valorPix;
                                            historico += "Enviou PIX R$ = " + valorPix;
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Refaça novamente o processo novamente");
                                        break;

                                    default:
                                        System.out.println("Opcao invalida");
                                }
                            }
                    break;

                        case 2:
                            boolean telefoneW = true;
                                while (telefoneW) {
                                    System.out.println("Digite o Telefone de quem vai receber o pix");
                                    long telefone = scanner.nextLong();
                                    System.out.println("Voce deseja enviar um PIX para o Telefone " + telefone);
                                    System.out.println("Opcao 1 = Confirmar");
                                    System.out.println("Opcao 2 = Nao, Digitar outro Telefone");
                                    int telefoneC = scanner.nextInt();
                                    switch (telefoneC) {
                                        case 1:
                                            System.out.println("Voce confirmou o PIX (Telefone) " + telefone);
                                            telefoneW = false;
                                            while (telefoneWV) {
                                                System.out.println("Digite o valor que quer enviar");
                                                int valorTelefone = scanner.nextInt();
                                                System.out.println("O valor que quer enviar é de " + valorTelefone + " ?");
                                                System.out.println("Opcao 1 = Sim, confirmar valor de " + valorTelefone);
                                                System.out.println("Opcao 2 = Nao, colocar outro valo para enviar");
                                                int telefoneCV = scanner.nextInt();
                                                switch (telefoneCV) {
                                                    case 1:
                                                        System.out.println("Voce confirmou o valor da transferencia de " + valorTelefone);
                                                        historico += valorTelefone;
                                                        telefoneWV = false;
                                                        break;

                                                    case 2:
                                                        System.out.println("Refazendo a Operacao novamente");
                                                        continue;

                                                    default:
                                                        System.out.println("Opcao invalida");
                                                        break;
                                                }


                                                if (valorTelefone <= 0) {
                                                    System.out.println("VALOR INVALIDO");
                                                } else if (valorTelefone > saldo) {
                                                    System.out.println("Saldo insuficiente para essa acao, use seu saldo limite " + saldo);
                                                } else {
                                                    System.out.println("Voce enviou um PIX de " + valorTelefone + "Para o (Telefone) " + telefone);
                                                    System.out.println("");
                                                    saldo -= valorTelefone;
                                                    historico += "Enviou PIX R$ = " + valorTelefone;
                                                    System.out.println("Voltando ao Menu Principal, Aguarde.");

                                                }
                                            }
                                            telefoneWV = false;
                                            break;

                                        case 2:
                                            System.out.println("Refaça a operacao novamente");
                                            continue;

                                        default:
                                            System.out.println("Opcao invalida");

                                    }
                                }
                    }break;

                        case 4:
                            System.out.println("==================");
                            System.out.println("EXTRATO FINANCEIRO");
                            System.out.println("==================");
                            System.out.println(historico);
                            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                            break;




                        case 5:
                            System.out.println("Obrigado por usar o Banco SV3!");
                            return;

                        default:
                            System.out.println("Opcao Invalida");


            }
        }
    }
}




