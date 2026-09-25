import java.util.Scanner;

public class Caixa {

    Scanner sc = new Scanner(System.in);

    public boolean compraCartao(){
        System.out.println("Deseja Parcelar a compra?");
        System.out.println("[1]- SIM");
        System.out.println("[2]- NAO");
        int parcelado = sc.nextInt();
        if (parcelado != 1 && parcelado != 2){
            return false;
        }
        if (parcelado == 2){
            System.out.println("Compra avista");
            return false;
        }
        if (parcelado == 1){
        System.out.println("Em quantas vezes quer fazer?");
        int numeroParcelas = sc.nextInt();
    }
        return false;
    }

}
