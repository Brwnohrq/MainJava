package entidade;

import entidade.Biblioteca;

public class Livros {

    String tituloLivro;
    String escritor;
    int anoLancamento;
    int numeroPaginas;
    boolean disponivel = true;


    public void mostrarLivro() {
        System.out.println("Título: " + tituloLivro);
        System.out.println("Escritor: " + escritor);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Disponível: " + disponivel);
        System.out.println();
    }

    public boolean emprestar() {
        if (disponivel) {
            System.out.println("Voce emprestou o Livro " + tituloLivro);
            disponivel = false;
            return true;

        } else {
            System.out.println("Nao pode emprestar, ela nao esta aqui ainda");
            return false;
        }
    }

    public boolean devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Voce devolveu o Livro " + tituloLivro);
            return true;

        } else {
            System.out.println("O Livro nao estava emprestado");
            return false;
        }

    }


}

