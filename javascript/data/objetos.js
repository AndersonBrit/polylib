// data/objetos.js


const LivroBiblioteca = require('../models/livro');

const catalogoLivros = [];

const livro1 = new LivroBiblioteca("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, "Fantasia");
livro1.adicionarAvaliacao(9);
livro1.adicionarAvaliacao(10);
catalogoLivros.push(livro1);

const livro2 = new LivroBiblioteca("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");
livro2.adicionarAvaliacao(8);
livro2.adicionarAvaliacao(9);
livro2.adicionarAvaliacao(7);
catalogoLivros.push(livro2);

const livro3 = new LivroBiblioteca("1984", "George Orwell", 1949, "Distopia");
livro3.adicionarAvaliacao(10);
livro3.adicionarAvaliacao(8);
catalogoLivros.push(livro3);

module.exports = catalogoLivros;
