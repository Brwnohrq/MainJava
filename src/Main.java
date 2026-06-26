import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("                     ");
        System.out.println("====================");
        System.out.println("  BANCO CHAT GPT ");
        System.out.println("====================");
        System.out.println("                     ");
        System.out.println("Opcao 1 = Fazer um saque");
        System.out.println("Opcao 2 = Fazer um deposito");
        System.out.println("Opcao 3 = Extrato financeiro");
        System.out.println("Opcao 4 = Area Pix");
        System.out.println("Opcao 5 = Suporte tecnico");


        int opcao = scanner.nextInt();
        double SaldoBanco = 1500;
        double ValorSaque = 0;
        double ValorDeposito =0;
        switch (opcao) {
            case 1:
                System.out.println("Fazer um saque");
                Scanner saque = new Scanner(System.in);
                System.out.println("Digite o valor do saque");
                ValorSaque = scanner.nextDouble();
                if (ValorSaque > SaldoBanco){
                    System.out.println("Voce tem apenas " + SaldoBanco + " disponivel para saque");
                }
                else {
                    System.out.println("voce sacou " + ValorSaque + " reais");
                    System.out.println("Saldo Restante Atual é de " + (SaldoBanco - ValorSaque));
                }
                break;


            case 2:
                System.out.println("Fazer um deposito");
                System.out.println("Qual o valor do deposito?");
                ValorDeposito = scanner.nextDouble();
                System.out.println("Voce acabou de depositar "+ +ValorDeposito + " reais");
                System.out.println("Saldo Atual  " + (ValorDeposito + SaldoBanco));

                break;


            case 3:

                System.out.println("Extrato Financeiro");
                System.out.println("-------------------");
                System.out.println("Escolha uma opcao abaixo");
                System.out.println("Opcao 1 = Movimentacoes Bancarias");
                System.out.println("Opcao 2 = Entradas");
                System.out.println("Opcao 3 = Saidas");
                System.out.println("Opcao 4 = Informe de Rendimentos");

                int Opcao = scanner.nextInt();
                switch (Opcao) {
                    case 1:
                    System.out.println("Movimentacao Bancarias");
                        System.out.println("Voce Fez um Saque " + ValorSaque + "Reais");
                        System.out.println("Voce Fez um Deposito De " +ValorDeposito + "Reais");
                        break;
                    case 2:
                    System.out.println("Opcao 2 = Entradas");
                        System.out.println("Em manutencao, tente novamente mais tarde" );
                        break;
                    case 3:
                    System.out.println("Opcao 3 = Saidas");
                        System.out.println("Em manutencao, tente novamente mais tarde" );
                        break;
                    case 4:
                    System.out.println("Opcao 4 = Informe de rendimentos");
                        System.out.println("Em manutencao, tente novamente mais tarde" );
                        break;
                    default:
                }

                break;
            case 4:
                System.out.println("Area PIX");
                System.out.println("Escolha uma das opcoes abaixo");
                System.out.println("Opcao 1 = Enviar um PIX");
                System.out.println("Opcao 2 = Cobrar um PIX");
                System.out.println("Opcao 3 = Gerar Chave Aleatoria");

                int opcaoo = scanner.nextInt();
                switch (opcaoo) {
                    case 1:
                    System.out.println("Enviar um PIX");
                        System.out.println("Digite a chave PIX");
                    double ChavePix = scanner.nextDouble();
                        System.out.println("Digite o Valor do PIX");
                        double ValorPix = scanner.nextDouble();
                        if (ValorPix > SaldoBanco){
                            System.out.println("Voce tem apenas o limite de " + SaldoBanco);
                        }
                        else{
                        System.out.println("Voce enviou um Pix de " + ValorPix + " Para a chave " + ChavePix);
                        System.out.println("Seu Saldo Bancario é " + (SaldoBanco - ValorPix));}
                        break;
                    case 2:
                    System.out.println("Cobrar um PIX");
                        System.out.println("Digite o Valor que quer Cobrar");
                        double ValorCobrar = scanner.nextDouble();
                        System.out.println("Digite o numero da pessoa que quer cobrar(Somente os numeros)");
                        int NumeroCobranca = scanner.nextInt();
                        System.out.println("Voce esta cobrando o numero " + NumeroCobranca);
                        System.out.println("No Valor total de " + ValorCobrar);
                        break;
                    case 3:
                    System.out.println("Gerar chave aleatoria");
                        System.out.println("ashuafhugalsj123hfafsuasfijas");
                        System.out.println("Chave aleatoria gerada com sucesso");
                    break;
                    default:
                        break;
                }
        break;
            case 5:
                System.out.println("Suporte tecnico");
                System.out.println("Digite o seu CPF");
                long Cpf = scanner.nextLong();
                System.out.println("Seu CPF é " + Cpf + "Aguarda um momento..");
                break;

            default:
                System.out.println("Escolha uma das alternativas acima");



        }
    }}