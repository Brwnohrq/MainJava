import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //variaveis
        double valorDeposito =0;
        double valorSaque =0;
        double valorPix =0;
        double saldo = 1000.;
        int confirmacao =0;
        boolean repetirDeposito = true;

        String historico = "";
        String chavePix = "";




            System.out.println("BANCO SCVB1 2.0 WHILE");
            System.out.println("");
            while (true) {
                System.out.println("=====================");
                System.out.println("TELA INICIAL BANCO V1");
                System.out.println("=====================");
                System.out.println("");
                System.out.println("💰Digite 1 = DEPOSITO");
                System.out.println("💸Digite 2 = SAQUE");
                System.out.println("📱Digite 3 = PIX");
                System.out.println("🗓️Digite 4 = EXTRATO");
                System.out.println("📤Digite 5 = SAIR DO APLICATIVO");

                int iniciar = scanner.nextInt();

                switch (iniciar) {
                    case 1:
                        repetirDeposito = true;

                        while (repetirDeposito) {
                            System.out.println("==================");
                            System.out.println("💰AREA DE DEPOSITO");
                            System.out.println("==================");
                            System.out.println("");

                            System.out.println("Qual valor o senhor deseja depositar?");
                            double valorDepositar = scanner.nextDouble();

                            if (valorDepositar <= 0) {
                                System.out.println("ERRO! VALOR INVALIDO 🛑");
                                continue;
                            }

                            System.out.printf("Voce gostaria de depositar R$ = %.2f ? %n", valorDepositar);
                            System.out.println("Digite 1 = SIM");
                            System.out.println("Digite 2 = NAO");

                            confirmacao = scanner.nextInt();

                            switch (confirmacao) {
                                case 1:
                                    System.out.println("Aguardando Deposito.");
                                    saldo += valorDepositar;
                                    historico += "DEPOSITO R$= " + valorDepositar + "\n";

                                    System.out.printf("DEPOSITO FEITO COM SUCESSO: R$ %.2f %n", valorDepositar);
                                    System.out.printf("Saldo atual: R$ %.2f %n", saldo);

                                    repetirDeposito = false;
                                    break;

                                case 2:
                                    System.out.println("OK, vamos tentar novamente...");
                                    break;

                                default:
                                    System.out.println("Opcao invalida");
                            }
                        }
                        break;

                    case 2:
                        System.out.println("AREA DE SAQUE");
                        System.out.println("");
                        System.out.println("Qual o valor deseja Sacar da conta");
                        valorSaque = scanner.nextDouble();
                        if (valorSaque > saldo) {
                            System.out.println("Voce nao tem dinheiro suficiente pra sacar, seu saldo é apenas " + saldo + " RS");
                            break;

                        } else {
                            System.out.println("Voce quer sacar " + valorSaque + " correto?");
                            System.out.println("Processando saque, aguarde.");
                            saldo -= valorSaque;
                            System.out.println("SAQUE R$ = " + valorSaque);
                            System.out.println("Saldo na Conta apos valor do saque R$ = " + saldo);
                            historico += ("SAQUE: - R$ " + valorSaque + "\n");
                            System.out.println("");
                            System.out.println("Voltando ao Menu inicial");
                            System.out.println("");
                        }
                        break;


                    case 3:
                        System.out.println("AREA PIX");
                        System.out.println("");
                        System.out.println("Digite a chave pix (CPF)");
                        chavePix = scanner.next();
                        System.out.println("Digite o valor que vai enviar");
                        valorPix = scanner.nextDouble();
                        if (valorPix > saldo) {
                            System.out.println("Voce nao pode enviar um pix maior do que seu saldo, saldo atual R$=" + saldo);
                            break;
                        } else {
                            System.out.printf("Voce enviou um PIX de %.2f para a chave pix %s %n", valorPix, chavePix);
                            saldo -= valorPix;
                            historico += ("PIX - R$" + valorPix + "\n");
                            System.out.printf("Saldo apos enviar o pix é de R$= %.2f %n", saldo);
                            System.out.println("");
                            System.out.println("Voltando a tela de menu, aguarde.");
                        }
                        break;

                    case 4:
                        System.out.println("AREA EXTRATO FINANCEIRO");
                        System.out.println("");
                        System.out.println("===== HISTORICO =====");
                        System.out.println(historico);
                        System.out.printf("Saldo Atual: R$ %.2f%n", saldo);

                        break;

                    case 5:
                        System.out.println("Obrigado por usar nosso aplicativo");
                        return;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }


            }
    }}





//import java.util.Scanner;
//public class BancoSV3 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        double saldo = 100;
//        double saque = 0;
//        double enviarPix = 0;
//
//        boolean whileMenu = true;
//        String historico = "";
//
//
//        System.out.println("==================");
//        System.out.println("MENU INICIAL BANCO");
//        System.out.println("==================");
//        System.out.println("");
//        while (whileMenu) {
//            System.out.println("Opcao 1 = SAQUE");
//            System.out.println("Opcao 2 = DEPOSITO");
//            System.out.println("Opcao 3 = AREA PIX");
//            System.out.println("Opcao 4 = EXTRATO FINANCEIRO");
//            System.out.println("Opcao 5 = DESLOGAR");
//            System.out.println("");
//            System.out.println("Digite a Opcao Desejada");
//            int menu = scanner.nextInt();
//
//
//            switch (menu) {
//
//                case 1:
//                    System.out.println("=============");
//                    System.out.println("AREA DE SAQUE");
//                    System.out.println("=============");
//                    System.out.println("");
//                    boolean rodarMenu = true;
//                    while (rodarMenu) {
//                        System.out.println("Digite o valor que deseja ser sacado");
//                        int valorSaque = scanner.nextInt();
//                        System.out.println("Voce deseja sacar " + valorSaque);
//                        System.out.println("Opcao 1 = SIM, confirmar saque");
//                        System.out.println("Opcao 2 = NAO, digitar outro valor de saque");
//                        int confirmarSaque = scanner.nextInt();
//                        switch (confirmarSaque) {
//
//                            case 1:
//                                System.out.println("voce sacou");
//                                rodarMenu = false;
//                                break;
//
//                            case 2:
//                                System.out.println("Retornar");
//                                break;
//                        }
//
//                    }
//            }
//        }
//    }
//}

