import javax.swing.*;
import  java.util.Scanner;
public class MenoreMaior{
    public static void main(String[] args) {


            boolean rodarAp = true;
            double altura = 0;
            double peso = 0;
            double imC = 0;
            String classificacao = "";

        Scanner sc = new Scanner(System.in);
            while (rodarAp){

            String nome = JOptionPane.showInputDialog(null,"Digite seu nome");

            peso = Double.parseDouble(JOptionPane.showInputDialog(nome + " Digite seu peso"));
                    if (peso <0 ) {
                        JOptionPane.showMessageDialog(null, "Peso invalido, refaça a operação");
                        continue;
                    } else {
                        JOptionPane.showMessageDialog(null, "seu peso é " + peso + " kg");
                        }

                     altura = Double.parseDouble(JOptionPane.showInputDialog(null,nome + "Digite sua altura"));

                    if (altura <=0) {
                        JOptionPane.showMessageDialog(null, "Altura invalida, refaça a operação");
                        continue;
                    } else {
                        JOptionPane.showMessageDialog(null,"sua altura é de " +altura + " m");
                    }

                    imC = peso / (altura * altura);
                    JOptionPane.showMessageDialog(null,imC);

                        if (imC <=18.5){
                       classificacao = "Abaido do Peso";


                        } else if (imC <= 24.9){
                            classificacao = "Peso Ideal";


                        } else if (imC <= 29.9){
                            classificacao = "Sobrepeso";


                        } else {
                            classificacao = "Obessidade";
                        }

                        JOptionPane.showMessageDialog(null, "Nome:" + nome + "\n"
                        + "Peso:" + peso + "\n" + "Altura:" + altura + "\n" + imC + "\n" + "Classificaçao:" + classificacao);

                        int continuar = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja refazer a Opcao?" + "\n" + "Opcao 1: SIM \n" + "Opcao 2: NAO \n"));
                        if (continuar !=2){
                            ;continue;
                        } else {
                            return;
                        }
    }

}}

