package entidade;

public class Biblioteca {

    Livros HarryPotter = new Livros();
    Livros SenhorAneis = new Livros();
    Livros OHobbit = new Livros();




    public Biblioteca(){
        HarryPotter.tituloLivro = "Harry Potter e a Pedra Filosofal";
        HarryPotter.escritor = "J.K Rolling";
        HarryPotter.anoLancamento = 2014;
        HarryPotter.numeroPaginas = 598;
        HarryPotter.disponivel = true;

        SenhorAneis.tituloLivro = "Senhor dos Aneis, a sociedade do anel";
        SenhorAneis.escritor = "J.R.R Tolkien";
        SenhorAneis.anoLancamento = 2013;
        SenhorAneis.numeroPaginas = 555;
        SenhorAneis.disponivel = true;

        OHobbit.tituloLivro = "O Hobbit";
        OHobbit.escritor = "J.R.R Tolkien";
        OHobbit.anoLancamento = 2015;
        OHobbit.numeroPaginas = 566;
        OHobbit.disponivel = true;

    }

    public void mostrarLivros(){
        HarryPotter.mostrarLivro();
        SenhorAneis.mostrarLivro();
        OHobbit.mostrarLivro();
    }



}
