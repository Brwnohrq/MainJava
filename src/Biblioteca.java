public class Biblioteca {


    Livro [] biblioteca = new Livro [10];

    public Biblioteca(){
        biblioteca[0] = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997, false);
        biblioteca[1] = new Livro("O Senhor dos Aneis", "J. R. R. Tolkien", 1954, true);
        biblioteca[2] = new Livro("O Hobbit", "J. R. R. Tolkien", 1937, false);
        biblioteca[3] = new Livro("1984", "George Orwell", 1949, false);
        biblioteca[4] = new Livro("Dom Casmurro", "Machado de Assis", 1899, true);
        biblioteca[5] = new Livro("O Pequeno Principe", "Antoine de Saint-Exupery", 1943, false);
        biblioteca[6] = new Livro("It", "Stephen King", 1986, true);
        biblioteca[7] = new Livro("Duna", "Frank Herbert", 1965, true);
        biblioteca[8] = new Livro("Dracula", "Bram Stoker", 1897, true);
        biblioteca[9] = new Livro("Frankenstein", "Mary Shelley", 1818, true);


    }

   public boolean emprestarBook (String titulo) {
       for (int i = 0; i < biblioteca.length; i++) {
           if (biblioteca[i].isDisponivel()) {
               if(biblioteca[i].getTitulo().contains(titulo)){
                   biblioteca[i].setDisponivel(false);
                   return true;
               }
           }
       }
       return false;
   }

   public boolean devolverBook(String titulo) {
       for (int i = 0; i < biblioteca.length; i++) {
           if (biblioteca[i].isDisponivel()) {
               continue;

           } else {
               if (biblioteca[i].getTitulo().contains(titulo)) {
                   biblioteca[i].setDisponivel(true);
                   return true;
               }
           }
       }
       return false;
   }

       public void mostrarLivro () {
           for (int i = 0; i < biblioteca.length; i++) {
               biblioteca[i].mostrarDados();
           }
       }


    public Livro buscarLivro(String titulo){
        for (int i = 0 ; i < biblioteca.length ; i ++){
            if (biblioteca[i] ==null){
                continue;
            }
            if (biblioteca[i].getTitulo().equals(titulo)){
                return biblioteca[i];
            }
        }
        return null;
    }

   }
