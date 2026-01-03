# tests/test_livro.py


import pytest
from src.models.livro import LivroBibloteca


def test_emprestar_e_devolver():
    livro = LivroBibloteca("Teste", "Autor", 2025, "Ficção")
    assert livro.emprestado == False

    livro.emprestar()
    assert livro.emprestado == True

    livro.devolver()
    assert livro.emprestado == False


def test_avaliacoes():
    livro = LivroBibloteca("Teste", "Autor", 2025, "Ficção")
    livro.adicionarAvaliacao(8)
    livro.adicionarAvaliacao(10)
    assert livro.mediaAvaliacoes() == 9
