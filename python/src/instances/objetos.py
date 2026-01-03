# data/objetos.py

from models.livro import LivroBibloteca


catalogo_livros = []  #Variavel principal, onde contera todos os livros


livro1 = LivroBibloteca("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, "Fantasia")
livro1.adicionarAvaliacao(9)
livro1.adicionarAvaliacao(10)
catalogo_livros.append(livro1)

livro2 = LivroBibloteca("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia")
livro2.adicionarAvaliacao(8)
livro2.adicionarAvaliacao(9)
livro2.adicionarAvaliacao(7)
catalogo_livros.append(livro2)

livro3 = LivroBibloteca("1984", "George Orwell", 1949, "Distopia")
livro3.adicionarAvaliacao(10)
livro3.adicionarAvaliacao(8)
catalogo_livros.append(livro3)