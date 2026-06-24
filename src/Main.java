import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("How much do you earn by month?");
        double salary = scanner.nextDouble();
        if (salary <=599.){
            System.out.println("You earn less then 600,00 per month");
        }
        else if (salary >= 600. && salary <= 1000.){
            System.out.println("You earn between 600 to 1000 Dol per month");
        }
        else if(salary >=1000. && salary <=2000.){
            System.out.println("You earn between 1000 to 2000 Dol per month");
        }
        else if (salary >2000. && salary <=3500.){
            System.out.println("You earn Between 2000 to 3500 Dol per month");
        }
        else if (salary >3500. && salary <=5500.){
            System.out.println("You earn Between 3500 to 5500 Dol per month");
        }
        else
        {
            System.out.println("You earn more then 5500,00 Dolars per month");
        }
        scanner.close();


    }
}




