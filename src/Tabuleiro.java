import java.util.Scanner;

public class Tabuleiro {

    String[][] tabuleiro = new String[3][3];

    Scanner sc = new Scanner(System.in);

    private boolean rodarTabuleiroW = true;
    private boolean jogadorX = true;
    private int contadorJogos = 0;

    public void mostrarTabuleiro() {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {

                if (tabuleiro[i][j] == null) {
                    tabuleiro[i][j] = "-";
                }
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
    }


    public void iniciarJogo() {
        System.out.println("O Jogador X COMEÇA");
        while (rodarTabuleiroW) {
            mostrarTabuleiro();
            System.out.println("Digite a Linha que quer Jogar");
            int linha = sc.nextInt();
            System.out.println("Digite a Coluna que quer Jogar");
            int coluna = sc.nextInt();

            if (linha >= 3 || linha < 0) {
                continue;
            }
            if (coluna >= 3 || coluna < 0) {
                continue;
            }

            if (jogadorX) {
                if (tabuleiro[linha][coluna].equals("X") || tabuleiro[linha][coluna].equals("O")) {
                    continue;
                }

                tabuleiro[linha][coluna] = "X";
                contadorJogos++;
                if (xGanhou()){
                    break;
                }
                empate();
                jogadorX = false;
                if (rodarTabuleiroW){
                    System.out.println("Vez do Jogador O");
                }


            } else if (jogadorX == false) {
                if (tabuleiro[linha][coluna].equals("X") || tabuleiro[linha][coluna].equals("O")) {
                    System.out.println("Linha " + linha + " e Coluna " + coluna + " Nao estao disponiveis");
                    continue;
                }

                tabuleiro[linha][coluna] = "O";
                contadorJogos++;
                oGanhou();
                empate();
                jogadorX = true;
                if (rodarTabuleiroW){
                    System.out.println("Vez do Jogador X");
                }

            }


        }

    }

    public void empate() {
        if (contadorJogos == 9) {
            System.out.println("JOGO EMPATADO");
            mostrarTabuleiro();
            rodarTabuleiroW = false;
        }
    }


    public boolean xGanhou() {
        for (int i = 0; i < tabuleiro.length; i++) {

            if (tabuleiro[i][0].equals("X")
                    && tabuleiro[i][1].equals("X")
                    && tabuleiro[i][2].equals("X")) {
                System.out.println("X Ganhou");
                rodarTabuleiroW = false;
                mostrarTabuleiro();
                return true;
            }

            if (tabuleiro[0][i].equals("X")
                    && tabuleiro[1][i].equals("X")
                    && tabuleiro[2][i].equals("X")) {
                System.out.println("X Ganhou");
                rodarTabuleiroW = false;
                mostrarTabuleiro();
                return true;
            }

        }
            if (tabuleiro[0][0].equals("X")
                    && tabuleiro[1][1].equals("X")
                    && tabuleiro[2][2].equals("X")) {
                System.out.println("X Ganhou");
                rodarTabuleiroW = false;
                mostrarTabuleiro();
                return true;
            }

            if (tabuleiro[0][2].equals("X")
                    && tabuleiro[1][1].equals("X")
                    && tabuleiro[2][0].equals("X")) {
                System.out.println("X Ganhou");
                rodarTabuleiroW = false;
                mostrarTabuleiro();
                return true;
            }



        return false;

    }


    public boolean oGanhou() {
        for (int i = 0; i < tabuleiro.length; i++) {

            if (tabuleiro[i][0].equals("O")
                    && tabuleiro[i][1].equals("O")
                    && tabuleiro[i][2].equals("O")) {
                System.out.println("O Ganhou");
                rodarTabuleiroW = false;
                mostrarTabuleiro();
                return true;
            }

            if (tabuleiro[0][i].equals("O")
                    && tabuleiro[1][i].equals("O")
                    && tabuleiro[2][i].equals("O")) {
                System.out.println("O Ganhou");
                rodarTabuleiroW = false;
                mostrarTabuleiro();
                return true;
            }

        }
        if (tabuleiro[0][0].equals("O")
                && tabuleiro[1][1].equals("O")
                && tabuleiro[2][2].equals("O")) {
            System.out.println("O Ganhou");
            mostrarTabuleiro();
            rodarTabuleiroW = false;
            return true;
        }

        if (tabuleiro[0][2].equals("O")
                && tabuleiro[1][1].equals("O")
                && tabuleiro[2][0].equals("O")) {
            System.out.println("O Ganhou");
            mostrarTabuleiro();
            rodarTabuleiroW = false;
            return true;
        }



        return false;

    }
}




