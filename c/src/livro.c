// src/livro.c


#include <stdio.h>
#include "livro.h"

void mostrarLivro(Livro l) {
    printf("Titulo: %s\n", l.titulo);
    printf("Autor: %s\n", l.autor);
    printf("Ano: %d\n", l.ano);
    printf("Genero: %s\n", l.genero);
}

void emprestarLivro(Livro *l) {
    l->emprestado = 1;
    printf("Livro emprestado com sucesso!\n");
}

void devolverLivro(Livro *l) {
    l->emprestado = 0;
    printf("Livro devolvido com sucesso!\n");
}
