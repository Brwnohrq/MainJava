
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
        long cpf =0;

        while (menuIniciar) {
            System.out.println("══════════════════════════════════════");
            System.out.println("🏦        BANCO SV v3.0");
            System.out.println("══════════════════════════════════════");
            System.out.println("");
            System.out.printf("💰 Saldo disponível: R$ %.2f%n", saldo);
            System.out.println("[1] 💵 Depósito");
            System.out.println("[2] \uD83D\uDCB8 Saque");
            System.out.println("[3] \uD83D\uDCF2 Área PIX");
            System.out.println("[4] \uD83D\uDCC4 Extrato");
            System.out.println("[5] \uD83D\uDEAA Sair");
            System.out.println("");
            System.out.println("\uD83D\uDC49 Escolha uma opção:");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("════════════ \uD83D\uDCB5 DEPÓSITO ════════════");
                    System.out.println("");
                    boolean depositoW = (true);
                    while (depositoW) {

                        System.out.println("Informe o valor que deseja depositar:");
                        deposito = scanner.nextDouble();
                        if (deposito <= 0) {
                            System.out.println("❌ Valor inválido.");
                            continue;
                        } else {
                            System.out.println("");
                        }
                        System.out.println("\uD83D\uDCB0 Valor: R$ " + deposito);
                        System.out.println("[1] ✅ Confirmar " + deposito);
                        System.out.println("[2] ❌ Alterar valor");
                        escolhaDeposito = scanner.nextInt();
                        switch (escolhaDeposito) {
                            case 1:
                                System.out.println("");
                                System.out.println("✅ Depósito realizado com sucesso!");
                                System.out.println("Valor depositado: R$ " + deposito);
                                saldo += deposito;
                                System.out.println("Novo saldo: R$ " +saldo);
                                historico += "✔ Depósito .......... R$" + deposito + "\n";
                                depositoW = false;
                                break;

                            case 2:
                                System.out.println("Repita o processo");
                                continue;
                        }

                    }
                    break;

                case 2:
                    System.out.println("════════════ \uD83D\uDCB8 SAQUE ════════════");
                    System.out.println("Saldo disponível:");
                    System.out.println(saldo);
                    System.out.println("");
                    boolean saqueW = (true);
                    while (saqueW) {

                        System.out.println("Informe o valor do saque:");
                        saque = scanner.nextDouble();
                        if (saque > saldo) {
                            System.out.println("❌ Saldo insuficiente.");
                            System.out.println("Seu saldo atual é:" + saldo);
                            break;

                        } else {
                            System.out.println("");
                        }
                        System.out.println("Confirma este saque?");
                        System.out.println("\uD83D\uDCB8 Valor: R$ " + saque);
                        System.out.println("[1] Confirmar");
                        System.out.println("[2] Alterar valor");
                        int saqueS = 0;
                        saqueS = scanner.nextInt();
                        switch (saqueS) {
                            case 1:
                                System.out.println("✅ Saque realizado com sucesso!");
                                System.out.println("Valor sacado:");
                                System.out.println("R$:"+saque);
                                saldo -= saque;
                                historico += ("✔ Saque ............. R$" + saque + "\n");
                                System.out.println("Saldo restante R$:" +saldo);
                                saqueW = false;
                                break;

                            case 2:
                                System.out.println("Refaca a operacao de saque");
                                continue;

                        }
                    }
                    break;


                case 3:
                    System.out.println("════════════ \uD83D\uDCF2 PIX ════════════");

                    System.out.println("Escolha a chave:");
                    System.out.println("[1] CPF");
                    System.out.println("[2] Telefone");
                    System.out.println("\uD83D\uDC49 Opção:");
                    int escolhaChave = scanner.nextInt();
                    if (escolhaChave <1 || escolhaChave >=3) {
                        System.out.println("Opcao invalida");
                        break;
                    } else {
                        System.out.println("Voce escolheu a Opcao " + escolhaChave);
                    }
                    switch (escolhaChave) {
                        case 1:
                            System.out.println("CPF informado:");
                            boolean cpfW = true;
                            while (cpfW) {
                                System.out.println("Digite o CPF de quem vai receber o pix");
                                cpf = scanner.nextLong();
                                System.out.println("o cpf que vai receber o pix é o (CPF) " + cpf + " confirma?");
                                System.out.println("[1] Sim");
                                System.out.println("[2] Digitar novamente");
                                int cpfC = scanner.nextInt();
                                switch (cpfC) {
                                    case 1:
                                        System.out.println("Chave PIX confirmada com sucesso");
                                        cpfW = false;
                                        boolean pixW = true;
                                        while (pixW) {
                                            System.out.println("Digite o valor da transferência:");
                                            valorPix = scanner.nextInt();
                                            System.out.println("══════════════════════════════════════════════");
                                            System.out.println("Destinatário:");
                                            System.out.println("CPF");
                                            System.out.println(cpf);
                                            System.out.println("Valor:");
                                            System.out.println("R$: " + valorPix);
                                            System.out.println("Confirmar?");
                                            System.out.println("[1] Sim");
                                            System.out.println("[2] Alterar valor");
                                            int confirmarPix = scanner.nextInt();
                                            switch (confirmarPix) {

                                                case 1:
                                                    if (valorPix <= 0) {
                                                        System.out.println("❌ Saldo insuficiente.");
                                                        break;
                                                    } else if (valorPix > saldo) {
                                                        System.out.println("Saldo insuficiente para essa acao, use seu saldo limite " + saldo);
                                                        break;
                                                    } else {
                                                        System.out.println("✅ PIX enviado com sucesso!");
                                                        System.out.println("");
                                                        System.out.println("Valor:");
                                                        System.out.println(valorPix);
                                                        System.out.println("Saldo Restante:");
                                                        saldo -= valorPix;
                                                        System.out.println(saldo);
                                                        historico += "✔ PIX enviado ....... R$ " + valorPix + "\n";
                                                    }

                                                System.out.println("✅ PIX enviado com sucesso");
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
                                    System.out.println(" 📲 Digite o Telefone de quem vai receber o pix");
                                    long telefone = scanner.nextLong();
                                    System.out.println("📲 Telefone informado " +telefone);
                                    System.out.println("Confirmar?");
                                    System.out.println("[1] Sim");
                                    System.out.println("[2] Digitar novamente");
                                    int telefoneC = scanner.nextInt();
                                    switch (telefoneC) {
                                        case 1:
                                            System.out.println("Voce confirmou o PIX (Telefone) " + telefone);
                                            telefoneW = false;
                                            boolean telefoneWV = true;
                                            while (telefoneWV) {
                                                System.out.println("Digite o valor da transferência:");
                                                int valorTelefone = scanner.nextInt();
                                                System.out.println("Destinatario: \n" +
                                                "");
                                                System.out.println("Telefone: \n" +
                                                        telefone);
                                                System.out.println("");
                                                System.out.println("Valor:");
                                                System.out.println(valorTelefone);
                                                System.out.println("Confirmar? \n");
                                                System.out.println("[1] Sim");
                                                System.out.println("[2] Alterar valor");
                                                int telefoneCV = scanner.nextInt();
                                                switch (telefoneCV) {
                                                    case 1:
                                                        System.out.println("Voce confirmou o valor da transferencia de " + valorTelefone);
                                                        historico += "✔ PIX enviado ....... R$" + valorTelefone + "\n";
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
                                                    System.out.println("❌ Saldo insuficiente.");
                                                } else if (valorTelefone > saldo) {
                                                    System.out.println("❌ Saldo insuficiente." +
                                                    "saldo atual" +saldo);
                                                } else {
                                                    System.out.println("✅ PIX enviado com sucesso!");
                                                    System.out.println("");
                                                    saldo -= valorTelefone;
                                                    System.out.println("Valor:" +
                                                            "R$:" + valorTelefone);
                                                    System.out.println("Saldo restante: " +
                                                            saldo);
                                                    historico += "Enviou PIX R$ = " + valorTelefone + "\n";
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
                            System.out.println("════════════ 📄 EXTRATO ════════════");
                            System.out.println("Movimentações:\n");
                            System.out.println(historico + "\n");
                            System.out.println("──────────────────────────────");
                            System.out.println("Saldo atual:");
                            System.out.println(saldo);
                            break;




                        case 5:
                            System.out.println("══════════════════════════════");
                            System.out.println("Obrigado por usar o Banco SV3!");
                            System.out.println("Até a próxima! \uD83D\uDC4B");
                            System.out.println("══════════════════════════════");
                            return;

                        default:
                            System.out.println("Opcao Invalida");


            }
        }
    }
}




