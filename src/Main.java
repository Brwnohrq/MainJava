import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main (String []args){





    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota de Matematica");
        double notaMatematica = scanner.nextDouble();
        System.out.println("Digite sua nota de Portugues");
        double notaPortugues = scanner.nextDouble();
        System.out.println("Digite sua nota de Historia");
        double notaHistoria = scanner.nextDouble();
        System.out.println("Digite sua nota de Geografia");
        double notaGeografia = scanner.nextDouble();
        System.out.println("Digite o numero de faltas que teve esse ano");
        double numeroFaltas = scanner.nextDouble();

        double media = (notaGeografia + notaHistoria + notaMatematica + notaPortugues) /4;
        if (numeroFaltas >=100){
            System.out.println("Reprovado por falta");
        }
        else if (media >=7.0){
            System.out.println("Voce foi Aprovado " + "sua media foi " + media);
        }
        else if (media >=5 && media <7) {
            System.out.println("Voce esta em Recuperacao " + "sua media foi " + media);
        }
        else {
            System.out.println("Voce foi Reprovado " + "Sua media foi " + media);
        }

       scanner.close();




    }
}