import java.util.Scanner;

public class MenoreMaior {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10");

        int numero = sc.nextInt();
        for (int i = 1; i <=numero; i++){
            System.out.println(numero + "  X  " + i + " = " + (i * numero));
        }

    }
}