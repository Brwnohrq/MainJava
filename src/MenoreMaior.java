
    import java.util.Scanner;

    public class MenoreMaior {
        public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o Primeiro Numero");
            long numero1 = scanner.nextLong();

            System.out.println("Digite o Segundo Numero");
            long numero2 = scanner.nextLong();

            System.out.println("Digite o Terceiro Numero");
            long numero3 = scanner.nextLong();

            System.out.println("Digite o Quarto Numero");
            long numero4 = scanner.nextLong();

            long maior = numero1;
            long menor = numero1;

            if (numero2 < menor) {
                menor = numero2;
            }
            if (numero2 > maior) {
                maior = numero2;
            }

            if (numero3 < menor) {
                menor = numero3;
            }
            if (numero3 > maior) {
                maior = numero3;
            }

            if (numero4 < menor) {
                menor = numero4;
            }
            if (numero4 > maior) {
                maior = numero4;
            }

            System.out.println("Maior numero é " + maior);
            System.out.println("Menor numero é " + menor);

            scanner.close();
        }
    }



