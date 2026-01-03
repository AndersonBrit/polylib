// src/data/Catalogo.java


package data;

import java.util.ArrayList;
import models.LivroBiblioteca;

public class Catalogo {

    private ArrayList<LivroBiblioteca> livros;

    // Construtor
    public Catalogo() {
        livros = new ArrayList<>();
    }

    // Adicionar livro ao catálogo
    public void adicionarLivro(LivroBiblioteca livro) {
        livros.add(livro);
    }

    // Obter todos os livros
    public ArrayList<LivroBiblioteca> getLivros() {
        return livros;
    }

    // Obter um livro pelo índice (posição)
    public LivroBiblioteca getLivro(int indice) {
        return livros.get(indice);
    }

    // Número total de livros
    public int totalLivros() {
        return livros.size();
    }
}
