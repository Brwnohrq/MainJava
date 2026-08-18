
import java.util.Scanner;

public class Tabuleiro {

    String [][] tabuleiro = new String[3][3];

    Scanner scanner = new Scanner(System.in);

    private boolean jogadorDoX = true;
    private boolean whileTabuleiro = true;
    private int numeroJogadas = 0;


    public void iniciarTabuleiro(){
        for (int i = 0 ; i < tabuleiro.length ; i++){


            for (int j = 0 ; j < tabuleiro.length ; j++){
                if (tabuleiro [i][j] ==null){
                    tabuleiro [i][j] = "-";
                }

                System.out.print(tabuleiro[i][j]);
            }

            System.out.println(" ");
        }

    }

    public void rodarTabuleiro(){

        iniciarTabuleiro();

        while (whileTabuleiro){


        System.out.println("Qual Linha quer Jogar?");
        int linha = scanner.nextInt();
        if (linha >=3 || linha < 0){
            continue;
        }
        System.out.println("de Qual Coluna?");
        int coluna = scanner.nextInt();
            if (coluna >=3 || coluna <0){
                continue;
            }



       if (tabuleiro [linha][coluna].equals("X") || tabuleiro [linha][coluna].equals("O")){
           System.out.println("Ja tem um Jogo na Linha " + linha + " Coluna " + coluna);
           continue;
       }

            if (jogadorDoX) {

                tabuleiro[linha][coluna] = "X";
                numeroJogadas++;

                if (vitoriaX()) {
                    iniciarTabuleiro();
                    break;
                }

                empatar();

                if (whileTabuleiro) {
                    System.out.println("Vez do Jogador O");
                    jogadorDoX = false;
                }

            } else {

                tabuleiro[linha][coluna] = "O";
                numeroJogadas++;

                if (ganharO()) {
                    iniciarTabuleiro();
                    break;
                }

                empatar();

                if (whileTabuleiro) {
                    System.out.println("Vez do Jogador X");
                    jogadorDoX = true;
                }
            }



        for (int i = 0 ; i < tabuleiro.length ; i++){


            for (int j = 0 ; j < tabuleiro.length ; j++){

                System.out.print(tabuleiro[i][j]);
            }

            System.out.println(" ");
        }




    }
    }


    public boolean vitoriaX(){
        for (int i = 0; i < tabuleiro.length ; i++){

            if (tabuleiro [i][0].equals("X")
                &&tabuleiro[i][1].equals("X")
                    &&tabuleiro[i][2].equals("X")){

                System.out.println("X Ganhou");
                whileTabuleiro = false;
                return true;
            }
            if (tabuleiro [0][i].equals("X")
                    &&tabuleiro[1][i].equals("X")
                    &&tabuleiro[2][i].equals("X")){
                System.out.println("X Ganhou");
                whileTabuleiro = false;
                return true;
            }
        }
            if (tabuleiro [0][0].equals("X")
                    &&tabuleiro[1][1].equals("X")
                    &&tabuleiro[2][2].equals("X")){
                System.out.println("X Ganhou");
                whileTabuleiro = false;
                return true;
            }
            if (tabuleiro [0][2].equals("X")
                    &&tabuleiro[1][1].equals("X")
                    &&tabuleiro[2][0].equals("X")){
                System.out.println("X Ganhou");
                whileTabuleiro = false;
                return true;
            }
            return false;

        }

        public boolean ganharO(){

        for (int i = 0 ; i < tabuleiro.length ; i++) {
            if (tabuleiro[i][0].equals("O")
                    && tabuleiro[i][1].equals("O")
                    && tabuleiro[i][2].equals("O")) {
                System.out.println("O Ganhou");
                whileTabuleiro = false;
                return true;
            }
            if (tabuleiro[0][i].equals("O")
                    && tabuleiro[1][i].equals("O")
                    && tabuleiro[2][i].equals("O")) {
                System.out.println("O Ganhou");
                whileTabuleiro = false;
                return true;
            }
            }
            if (tabuleiro[0][0].equals("O")
                    && tabuleiro [1][1].equals("O")
                    && tabuleiro [2][2].equals("O")){
                System.out.println("O Ganhou");
                whileTabuleiro = false;
                return true;
            }
            if (tabuleiro[0][2].equals("O")
                    && tabuleiro[1][1].equals("O")
                    && tabuleiro[2][0].equals("O")){
                System.out.println("O Ganhou");
                whileTabuleiro = false;
                return true;
            }
            return false;

        }
        public void empatar (){
        if (numeroJogadas ==9){
            System.out.println("Jogo Empatado");
            whileTabuleiro = false;
        }
        }


    }





