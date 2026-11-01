import exceptions.InvalidBookRegistred;
import exceptions.InvalidData;
import exceptions.InvalidName;
import model.Livro;
import repository.Conexao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Conexao c = new Conexao();

    try
    {

        List <Livro> livros = c.mostrarLivros();
        for (Livro livro : livros){
            System.out.println(livro);
            System.out.println(" ");
        }
    } catch (SQLException e){
        System.out.println(e.getMessage());
    }

}
}
