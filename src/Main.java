import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema de login Banco Chat sv1");
        System.out.println("===========================");
        System.out.println("Opcao 1 = Acessar a Conta");
//        System.out.println("Opcao 2 = Cadastras a Conta");
        Scanner scanner = new Scanner(System.in);
        int opcaologin = scanner.nextInt();
        String loginCorreto = "admin";
        String passwordCorreto = "1234a";
        double saldoFinal;
        double saldoInicial = 1500;
        double saldoPosSaque;
        switch (opcaologin) {

            case 1:
                System.out.println("Digite seu email ou usario de login");
                String login = scanner.next();
                if (!login .equals(loginCorreto)) {
                    System.out.println("Usuario invalido");
                    break;
                } else {
                      System.out.println("Digite sua senha");
                }
                String password = scanner.next();
                if (!password .equals(passwordCorreto)) {
                    System.out.println("Senha invalida");
                    break;
                }
                else {
                    System.out.println("Seja bem vindo " + loginCorreto);
                }
                System.out.println( "==================");
                System.out.println("Menu Do Banco SVB1:");
                System.out.println("===================");
                System.out.println("Opcao 1 = Fazer um Deposito ");
                System.out.println("Opcao 2 = Fazer um Saque ");
                System.out.println("Opcao 3 = Fazer um Pix ");
                System.out.println("Opcao 4 = Consultar Saldo");

                int opcaoLogin = scanner.nextInt();
        switch (opcaoLogin) {

            case 1:
                System.out.println("Voce escolheu fazer um Deposito");
                System.out.println("================================");
                System.out.println("           DEPOSITO");
                System.out.println("                                  ");
                System.out.println(" => Qual o valor do seu Deposito? <= ");
                System.out.println("                                   ");
                double valorDeposito = scanner.nextDouble();
                if (valorDeposito <=0){
                    System.out.println("$ERROO voce nao pode depositar esse tipo de valor");
                    break;
                }
                System.out.println("=> Voce esta depositando " + valorDeposito);
                System.out.println("                                        ");
                System.out.println("=> Seu saldo era de " + saldoInicial);
                System.out.println("                                        ");
                saldoFinal = (saldoInicial += valorDeposito);
                System.out.println("                                         ");
                System.out.println(" *** Agora seu saldo atual é " + saldoFinal + " ***");
                System.out.println("                                          ");


                break;

            case 2:
                System.out.println("Voce escolheu fazer um Saque");
                System.out.println("                            ");
                System.out.println("                   SAQUE           ");
                System.out.println("=> Qual o valor do Saque que quer fazer? <=");
                double valorSaque = scanner.nextDouble();
                if (valorSaque <=0){
                    System.out.println("voce nao pode sacar esse tipo de valor");
                    break;
                }
                else if (valorSaque >saldoInicial){
                    System.out.println("voce nao tem esse saldo, tem apenas " + saldoInicial);
                }

                else {

                System.out.println("Voce esta sacando o valor de " + valorSaque);
                    System.out.println("                         ");
                System.out.println("Seu saldo antes do saque era " + saldoInicial);
                saldoPosSaque = (saldoInicial -= valorSaque);
                System.out.println("*** Seu saque apos o saldo é de " + saldoPosSaque + " ***");
            }
                break;


            case 3:
                System.out.println(" ===== Area PIX ===== ");
                System.out.println("                       ");
                System.out.println("Opcao 1 = Enviar um PIX");
                System.out.println("Opcao 2 = Receber um PIX");

                int opcaoPix = scanner.nextInt();
                switch (opcaoPix){
                    case 1:
                        System.out.println("Informe a chave pix");
                        double chavePix = scanner.nextDouble();
                        System.out.println("a chave pix é " + chavePix);
                        System.out.println("informe o valor que deseja enviar");
                        double valorPix = scanner.nextDouble();
                        if (valorPix <=0){
                            System.out.println("voce nao pode enviar um pix nesse valor");
                        }
                        else if (valorPix > saldoInicial){
                            System.out.println("Seu limite de Pix é de " + saldoInicial);
                        }
                        else {
                            System.out.println("Aguardando Pagamento");
                            System.out.println("Pix enviado com sucesso");
                            double saldoPosPix = (saldoInicial -= valorPix);
                            System.out.println("Seu Saldo atual é de " + saldoPosPix);
                        }
                        break;
                    case 2:
                        System.out.println("Informe o Valor que deseja receber");
                        double valorPixReceber = scanner.nextDouble();
                        System.out.println("o valor que vai receber é " +valorPixReceber);
                        System.out.println("Gerando Chave Pix para cobrança");
                        System.out.println("Chave pix para cobranca é PAGAADIVIDACALOTEIRO");
                        break;
                }

                    case 4:
                        System.out.println("CONSULTAR SALDO");
                        System.out.println("==================");
                        System.out.println("SALDO NA CONTA");
                        System.out.println(" ");
                        System.out.println("Valor do Saldo na Conta atual é de R$" +saldoInicial + "reais");
                        System.out.println("====================");
                        break;
            default:
                System.out.println("Opcao invalida");



        }


//            case 2:
//
//                System.out.println("Digite um email para cadastrar");
//                String emailCadastro = scanner.next();
//                System.out.println("Digite uma senha para o Cadastro");
//                password = scanner.next();
//                System.out.println("Usuario Cadastrado com sucesso");
//                System.out.println("Seja bem vindo " + emailCadastro);
//
                scanner.close();
        }
    }}
