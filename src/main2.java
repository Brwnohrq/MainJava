import java.sql.SQLOutput;

//import java.util.Scanner;
//public class main2{
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Digite um valor aleatorio");
//        int scannerr = scanner.nextInt();
//        boolean y = false;
//        float z = 13f;
//        short f = 134;
//        long r = 529;
//
//        System.out.println (" | " + y + " | " + z + " | " + f + " | " + scannerr + " | " + r + " | ");
//
//
//
//    }
//}*
/* int qtdProduto1 = 21;
int qtdProduto2 = 40;
int qntProdutoTotal = qtdProduto2 % qtdProduto1;
    System.out.println("O total dos produtos é " + (qntProdutoTotal));
*/

 /*Scanner scanner = new Scanner(System.in);
    /System.out.println("Qual o valor da compra?");
    /double valor = scanner.nextDouble();
    /System.out.println("Qual a sua idade?");
    /byte idade = scanner.nextByte();

    /if (idade >=50 || valor >=300.){
    /    System.out.println("Voce tem desconto");
    /}
    /else{
     /   System.out.println("Voce nao tem desconto");
    /}}

     */





import java.util.Scanner;
public class main2{
public static void main (String []args ) {


    /*Scanner scanner = new Scanner(System.in);
    /System.out.println("Qual o valor da compra?");
    /double valor = scanner.nextDouble();
    /System.out.println("Qual a sua idade?");
    /byte idade = scanner.nextByte();

    /if (idade >=50 || valor >=300.){
    /    System.out.println("Voce tem desconto");
    /}
    /else{
     /   System.out.println("Voce nao tem desconto");
    /}}

     */

    System.out.println("Teste");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor total da compra:");
    double valor = scanner.nextDouble();

    System.out.println("Digite sua idade:");
            byte idade = scanner.nextByte();

                if (idade >= 50 && valor >= 250) {
                    System.out.println("Você tem desconto de 25%");
                } else if (idade < 50 && valor >= 250) {
                    System.out.println("Você não tem a idade mínima para o desconto");
                } else if (idade >= 50 && valor < 250) {
                    System.out.println("Você não tem o valor mínimo de compra para o desconto");
                } else {
                    System.out.println("Você não tem a idade mínima nem o valor mínimo para o desconto");
                }

                scanner.close();
            }
            }





