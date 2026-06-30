import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //variaveis
        double valorDeposito =0;
        double saldo = 50;
        String historico = "";







            System.out.println("BANCO SCVB1 2.0 WHILE");
            System.out.println("");
            while (true) {
            System.out.println("MENU INICIAL");
            System.out.println("1 = DEPOSITO");
            System.out.println("2 = SAQUE");
            System.out.println("3 = PIX");
            System.out.println("4 = EXTRATO");
            System.out.println("5 = SAIR DO APLICATIVO");

            int iniciar = scanner.nextInt();

            switch (iniciar){

                case 1:
                    System.out.println("AREA DE DEPOSITO");
                    System.out.println("");
                    System.out.println("Qual o valor que quer Depositar na conta?");
                    valorDeposito = scanner.nextDouble();
                    if (valorDeposito <0) {
                        System.out.println("Voce nao pode depositar esse tipo de valor");
                        break;
                    }


                    else {
                        System.out.println("Voce depositou " +valorDeposito);
                        saldo += valorDeposito;
                        System.out.println("DEPOSITO: + R$ "  + saldo);
                        historico += ("DEPOSITO: + R$ " + valorDeposito + "\n");
                        System.out.println("Voltando ao Menu inicial");
                        System.out.println("");

                    }
                    break;


                case 2:



                case 3:


                case 4:



                case 5:

                default:
                    System.out.println("Opcao invalida");
                    break;
            }




        }
    }
}