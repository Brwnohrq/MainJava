import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada de Variaveis A,B,C");



        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);

         if (delta < 0){
            System.out.println("Impossivel calcular");

        } else {

            double r1 = ( -b + Math.sqrt(delta)) / (2*a);
            double r2 = ( -b - Math.sqrt(delta)) / (2*a);

            System.out.printf("r1 =  %.5f \n" , r1);
            System.out.printf("r2 =  %.5f \n" , r2);


        }
            sc.close();

    }
}
