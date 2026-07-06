import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        boolean rodando = true;

        while (rodando) {

            String nome = JOptionPane.showInputDialog("Digite seu nome:");

            double peso = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite seu peso:")
            );

            if (peso <= 0) {
                JOptionPane.showMessageDialog(null, "Peso inválido");
                continue;
            }

            double altura = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite sua altura:")
            );

            if (altura <= 0) {
                JOptionPane.showMessageDialog(null, "Altura inválida");
                continue;
            }

            double imc = peso / (altura * altura);

            String classificacao;

            if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc <= 24.9) {
                classificacao = "Peso normal";
            } else if (imc <= 29.9) {
                classificacao = "Sobrepeso";
            } else {
                classificacao = "Obesidade";
            }

            JOptionPane.showMessageDialog(null,
                    "Olá, " + nome +
                            "\nSeu IMC é: " + imc +
                            "\nClassificação: " + classificacao
            );

            int opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Deseja calcular novamente?\n1 - Sim\n2 - Não"
                    )
            );

            if (opcao == 2) {
                rodando = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Programa finalizado!");
    }
}