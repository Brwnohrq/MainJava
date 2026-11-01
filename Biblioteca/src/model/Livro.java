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

    @Override
    public String toString() {
        return String.format("ID: %d \nNOME: %s \nAUTOR: %s \nLANCAMENTO: %d \nDISPONIVEL %s",id,nome,autor,lancamento,disponivel);
    }

}
