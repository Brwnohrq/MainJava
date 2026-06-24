import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero aleatorio");
        int numero = scanner.nextInt();

        if (numero %2 !=0){
            System.out.println("Ele é um numero impar");
        }
        else {
            System.out.println("Ele é um numero par");
        }
        scanner.close();
    }
}