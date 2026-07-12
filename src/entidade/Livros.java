package entidade;

import java.util.Scanner;

public class Livros {
    Scanner sc = new Scanner(System.in);

    public String autor;
    public String titulo;
    public int paginas;
    public boolean disponivel;


    public void mostrarLivro(){
        System.out.println("Descrição");
        System.out.println("");
        System.out.println("Nome : " + titulo);
        System.out.println("Numero de Paginas: " + paginas);
        System.out.println("Autora: " +autor);
        System.out.println("Disponivel: " + disponivel);
    }


    public boolean emprestar ()
    {

        if (disponivel) {
            System.out.println("Voce emprestou o Livro " + titulo);
            disponivel = false;
            return true;

        } else {
            System.out.println("O Livro nao esta disponivel pra ser emprestado");
            return false;
        }
    }






    public boolean devolver() {

        if (!disponivel) {
            System.out.println("Voce devolveu o Livro " + titulo);
            disponivel = true;
            return true;


        } else {
            System.out.println("Esse livro ja esta disponivel na biblioteca.");
            return false;
        }
    }
}