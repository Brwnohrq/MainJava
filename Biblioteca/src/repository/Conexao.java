package repository;

import exceptions.InvalidData;
import exceptions.InvalidName;
import model.Livro;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Conexao {

    private String url = "jdbc:mysql://localhost:3306/LIBRARY_JAVA";
    private String usuario = "root";
    private String senha = System.getenv("DB_SENHA");


    public List <Livro> mostrarLivros ()throws SQLException {
        List <Livro> livros = new ArrayList<>();



        try (Connection connection = DriverManager.getConnection(url,usuario,senha);
        var comando = connection.prepareStatement("SELECT * FROM LIVRO");
        var resultado = comando.executeQuery()){
        while (resultado.next()){


            int id = resultado.getInt("ID");
            String nome = resultado.getString("NOME");
            String autor = resultado.getString("AUTOR");
            int lancamento = resultado.getInt("LANCAMENTO");
            boolean disponivel = resultado.getBoolean("DISPONIVEL");

            Livro livro = new Livro(id,nome,autor,lancamento,disponivel);
            livros.add(livro);


        }
        return livros;
        }
    }

    public void addLivro (String nome, String autor, int lancamento, boolean disponivel)
            throws SQLException, InvalidName, InvalidData {

       validarNome(nome);
       validarAutor(autor);
       validarLancamento(lancamento);

        try (Connection connection = DriverManager.getConnection(url, usuario, senha);
            var comando = connection.prepareStatement("INSERT INTO LIVRO (nome,autor,lancamento,disponivel) VALUES (?,?,?,?)");
        ){
            comando.setString(1, nome);
            comando.setString(2, autor);
            comando.setInt(3, lancamento);
            comando.setBoolean(4, disponivel);
            comando.executeUpdate();

        }
    }

    public boolean alterarNomePorID (String nome, int id)
            throws SQLException, InvalidName, InvalidData {

       validarNome(nome);

        validarID(id);

        try (Connection connection = DriverManager.getConnection(url, usuario, senha);
             var comando = connection.prepareStatement("UPDATE LIVRO SET NOME = ? WHERE ID = ?");
        ) {
            comando.setString(1, nome);
            comando.setInt(2, id);
            int linhasAfetadas = comando.executeUpdate();
            return linhasAfetadas >=1;
        }
    }

    public boolean alterarAutorPorID (String autor, int id)
            throws  SQLException, InvalidName, InvalidData
    {
      validarAutor(autor);
      validarID(id);

      try (Connection connection = DriverManager.getConnection(url,usuario,senha);
          var comando = connection.prepareStatement("UPDATE LIVRO SET AUTOR = ? WHERE ID = ?");
      )
      {
          comando.setString(1,autor);
          comando.setInt(2,id);

          int linhasAfetadas = comando.executeUpdate();
          return linhasAfetadas >=1;
      }
    }

  public boolean emprestarLivroPorID (int id)
          throws SQLException, InvalidData
  {
      validarID(id);

      try (Connection connection = DriverManager.getConnection(url,usuario,senha);
          var comando = connection.prepareStatement("UPDATE LIVRO SET DISPONIVEL = FALSE WHERE ID = ? AND DISPONIVEL = TRUE");
      ){
          comando.setInt(1,id);
          int linhasAfetadas = comando.executeUpdate();
         return linhasAfetadas >=1;
      }
  }

  public boolean devolverLivroPorID (int id)
          throws SQLException, InvalidData
  {
      validarID(id);

      try (Connection connection = DriverManager.getConnection(url,usuario,senha);
          var comando = connection.prepareStatement("UPDATE LIVRO SET DISPONIVEL = TRUE WHERE DISPONIVEL = FALSE AND ID = ?");
      ){
          comando.setInt(1,id);
          int linhasAfetadas = comando.executeUpdate();
        return linhasAfetadas >=1;
      }

      }


  public boolean deletarLivroPorId (int id)
      throws SQLException, InvalidData {
      validarID(id);

      try (Connection connection = DriverManager.getConnection(url, usuario, senha);
           var comando = connection.prepareStatement("DELETE FROM LIVRO WHERE ID = ?");
      ) {
          comando.setInt(1, id);
          int linhasAfetadas = comando.executeUpdate();
              return linhasAfetadas >= 1;
          }
    }

    public boolean alterarLancamentoPorID (int lancamento, int id)
            throws SQLException, InvalidData
    {
        validarLancamento(lancamento);
        validarID(id);

        try (Connection connection = DriverManager.getConnection(url,usuario,senha);
            var comando = connection.prepareStatement("UPDATE LIVRO SET LANCAMENTO = ? WHERE ID = ?");
        ){
            comando.setInt(1,lancamento);
            comando.setInt(2,id);

            int linhasAfetadas = comando.executeUpdate();
            return linhasAfetadas >=1;

    }
    }









    private void validarNome (String nome)
            throws InvalidName
    {
        if (nome == null || nome.isBlank()){
            throw new InvalidName("Digite um nome valido");
        }
        if (!nome.matches("^[a-zA-Z0-9\\s]+$")){
            throw new InvalidName("Digite um nome valido");
        }
    }

    private void validarAutor (String autor)
            throws InvalidName
    {
        if (autor == null || autor.isBlank()){
            throw new InvalidName("Digite um autor valido");
        }
    }
    private void validarID (int id)
            throws InvalidData
    {
        if (id <=0){
            throw new InvalidData("Digite uma id valida");
        }
    }

    private void validarLancamento (int lancamento)
            throws InvalidData
    {
        if (lancamento <=0 || lancamento >=2027){
            throw new InvalidData("Digite uma data de lancamento valida");
        }
    }

}