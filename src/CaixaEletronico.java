import java.util.Scanner;

public class CaixaEletronico {
    Banco bancoCaixa = new Banco();
    Scanner sc = new Scanner(System.in);

    boolean rodarMenu = true;

    public void rodarCaixa (){
        while (rodarMenu){


            System.out.println("\n========================================");
            System.out.println("           🏦 CAIXA ELETRÔNICO");
            System.out.println("========================================");
            System.out.println(" [1] 💰 Consultar Saldo");
            System.out.println(" [2] ➕ Realizar Depósito");
            System.out.println(" [3] ➖ Realizar Saque");
            System.out.println(" [4] 🚪 Sair");
            System.out.println("========================================");
            System.out.print(" Escolha uma opção: ");

            int opcaoMenu = sc.nextInt();
            switch (opcaoMenu){
                case 1:
                    System.out.println(" [1] 💰 Consultar Saldo");
                    System.out.println("Digite o ID da sua Conta Bancaria?");
                    int iD = sc.nextInt();
                    double saldoB = bancoCaixa.buscarSaldo(iD);
                    System.out.println(saldoB);
                    break;

                case 2:
                    System.out.println(" [2] ➕ Realizar Depósito");
                    System.out.println("Digite o ID da conta que vai receber o Deposito");
                    int idDeposito = sc.nextInt();
                    System.out.println("Digite o Valor a ser Depositado");
                    double depositoB = sc.nextDouble();
                    boolean depositoFeito = bancoCaixa.depositar(idDeposito,depositoB);

                    if (!depositoFeito){
                        break;
                    }

                    System.out.println("Deposito Concluido, no valor de R$: " + depositoB + " Saldo R$:" + bancoCaixa.buscarSaldo(idDeposito));

                    break;

                case 3:
                    System.out.println(" [3] ➖ Realizar Saque");
                    System.out.println("Digite o ID da conta que vai sacar o Dinheiro");
                    int idSaque = sc.nextInt();
                    System.out.println("Digite o valor a ser Sacado");
                    double saqueB = sc.nextDouble();
                    boolean saqueFeito = bancoCaixa.saque(idSaque,saqueB);
                if (!saqueFeito){
                    break;
                }
                    System.out.println("Saque efetuado com Sucesso");
                    System.out.println("Saldo Atual RS:" +bancoCaixa.buscarSaldo(idSaque));
                    break;



                case 4:
                    System.out.println(" [4] 🚪 Sair");
                    rodarMenu = false;
                    return;

                default:
                    System.out.println("Opcao Invalida");
                    break;
            }
        }
    }
}
