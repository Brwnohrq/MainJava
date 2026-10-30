package repository;

import model.Livro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class Conexao {

    private String url = "jdbc:mysql://localhost:3306/LIBRARY_JAVA";
    private String usuario = "root";
    private String senha = "senha";

    public List <Livro> mostrarLivros() throws SQLException {
        List<Livro> livros = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

            var comando = connection.prepareStatement("SELECT * FROM LIVRO");
            var resultado = comando.executeQuery();

            while (resultado.next()){
                Livro livro = buscarSql(resultado);
                livros.add(livro);
            }


            return livros;
        }
    }























    public Livro buscarSql (ResultSet resultado)throws SQLException {


        int idd = resultado.getInt("ID");
        String nomee = resultado.getString("NOME");
        String autorr = resultado.getString("AUTOR");
        int lancamentoo = resultado.getInt("LANCAMENTO");
        boolean status = resultado.getBoolean("DISPONIVEL");
        Livro lista = new Livro(idd,nomee,autorr,lancamentoo,status);
        return lista;
    }

}



