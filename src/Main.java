import java.util.Scanner;
public class Main{
    public static void main(String [] args){
       Scanner scanner = new Scanner (System.in);
        System.out.println("How much do you earn by month?");
       double salary = scanner.nextDouble();
       if (salary <=1999.){
           System.out.println("You earn less then 2.000,00 per month");
       }
       else if (salary >= 2000. && salary <= 3000.){
           System.out.println("You earn between 2000 to 3000 Dol per month");
       }
       else
       {
           System.out.println("You earn more then 3000,00 Dolars per month");
       }
       scanner.close();


    }
}