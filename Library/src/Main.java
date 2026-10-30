import model.Livro;
import repository.Conexao;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {


        Conexao c = new Conexao();

        try{
        for (Livro livro : c.mostrarLivros()){
            System.out.println(livro.getId());
            System.out.println(livro.getNome());
            System.out.println(livro.getAutor());
            System.out.println(livro.getLancamento());
            System.out.println(livro.isDisponivel());

        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}