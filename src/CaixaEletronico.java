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
                    bancoCaixa.buscarSaldo(iD);
                    break;

                case 2:
                    System.out.println(" [2] ➕ Realizar Depósito");
                    System.out.println("Digite o ID da conta que vai receber o Deposito");
                    int idDeposito = sc.nextInt();
                    System.out.println("Digite o Valor a ser Depositado");
                    double depositoB = sc.nextDouble();
                    bancoCaixa.depositar(idDeposito,depositoB);
                    break;

                case 3:
                    System.out.println(" [3] ➖ Realizar Saque");
                    System.out.println("Digite o ID da conta que vai sacar o Dinheiro");
                    int idSaque = sc.nextInt();
                    System.out.println("Digite o valor a ser Sacado");
                    double saqueB = sc.nextDouble();
                    bancoCaixa.saque(idSaque,saqueB);
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
