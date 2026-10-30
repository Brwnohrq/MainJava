package model;

public class Livro {


    private int id;
    private String nome;
    private String autor;
    private int lancamento;
    private boolean disponivel = true;

    public Livro(int id, String nome, String autor, int lancamento, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.lancamento = lancamento;
        this.disponivel = disponivel;
    }


    public int getId() {
        return id;
    }

    public int getLancamento() {
        return lancamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }


}
