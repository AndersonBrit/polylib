import data.Catalogo;
import models.LivroBiblioteca;
import ui.Interacao;

public class Main {

    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        catalogo.adicionarLivro(new LivroBiblioteca(
            "Harry Potter",
            "J.K. Rowling",
            1997,
            "Fantasia"
        ));

        catalogo.adicionarLivro(new LivroBiblioteca(
            "1984",
            "George Orwell",
            1949,
            "Distopia"
        ));

        Interacao.iniciar(catalogo);
    }
}
