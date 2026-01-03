// src/models/LivroBiblioteca.java


package models;

import java.util.ArrayList;

public class LivroBiblioteca {

    // Atributos (dados do livro)
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean emprestado;
    private ArrayList<Integer> avaliacoes;

    // Construtor (executa quando criamos um livro)
    public LivroBiblioteca(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.emprestado = false;
        this.avaliacoes = new ArrayList<>();
    }

    // Emprestar livro
    public void emprestar() {
        emprestado = true;
    }

    // Devolver livro
    public void devolver() {
        emprestado = false;
    }

    // Adicionar avaliação
    public void adicionarAvaliacao(int nota) {
        avaliacoes.add(nota);
    }

    // Calcular média das avaliações
    public String mediaAvaliacoes() {
        if (avaliacoes.size() == 0) {
            return "Sem avaliações";
        }

        int soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }

        double media = (double) soma / avaliacoes.size();
        return String.format("%.1f", media);
    }

    // Getters (ler dados)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}
