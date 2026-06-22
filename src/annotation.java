 import java.util.Scanner;
public class annotation{
    public static void main(String[] args) {
        System.out.println("Ola");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo numero");
        double doublee = scanner.nextDouble();
        float q = 123f;
        long w = 1234567;
        short e = 12;
        int r = -529;
        boolean y = false;
        byte u = -124;

        System.out.println("Seu numero digitado foi " + doublee + "| q " + q + " | w " + w + " | r " + r + " | y " + y + " | u " + u + " |");

    }
}


