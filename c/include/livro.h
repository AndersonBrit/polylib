// include.livro.h


#ifndef LIVRO_H
#define LIVRO_H

#define TAM_TEXTO 100

typedef struct {
    char titulo[TAM_TEXTO];
    char autor[TAM_TEXTO];
    int ano;
    char genero[TAM_TEXTO];
    int emprestado;
} Livro;

// Funções
void mostrarLivro(Livro l);
void emprestarLivro(Livro *l);
void devolverLivro(Livro *l);

#endif
