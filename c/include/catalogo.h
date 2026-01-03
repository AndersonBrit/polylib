// include/catalogo.h


#ifndef CATALOGO_H
#define CATALOGO_H

#include "livro.h"

#define MAX_LIVROS 100

typedef struct {
    Livro livros[MAX_LIVROS];
    int total;
} Catalogo;

/* Funções */
void inicializarCatalogo(Catalogo *c);
void adicionarLivro(Catalogo *c, Livro livro);
void listarCatalogo(Catalogo c);

#endif
