import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main (String []args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de faltas que teve esse ano");
        int numeroFaltas = scanner.nextInt();
        if (numeroFaltas >= 100) {
            System.out.println("voce foi reprovado por exceder o numero de faltas permitidas");
            return;
        } else {
            System.out.println(
                    "Voce nao excedeu o numero de faltas, voce teve apenas " + numeroFaltas + " faltas"
            );
        }

        System.out.println("Digite sua nota de Matematica");
        double notaMatematica = scanner.nextDouble();
        System.out.println("Digite sua nota de Portugues");
        double notaPortugues = scanner.nextDouble();
        System.out.println("Digite sua nota de Historia");
        double notaHistoria = scanner.nextDouble();
        System.out.println("Digite sua nota de Geografia");
        double notaGeografia = scanner.nextDouble();
        double media = (notaGeografia + notaHistoria + notaMatematica + notaPortugues) / 4;
        String resultado = (media >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("-----BOLETIM-----");
        System.out.println("Matematica " +notaMatematica);
        System.out.println("Portugues " +notaPortugues);
        System.out.println("Historia " +notaHistoria);
        System.out.println("Geogradia " +notaGeografia);
        System.out.println("--------------");
        System.out.println("Media Final Gral das Notas " +media);
        System.out.println("Resultado Final " + resultado);
        scanner.close();
    }}








