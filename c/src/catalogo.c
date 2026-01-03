// src/catalogo.c


#include <stdio.h>
#include "catalogo.h"

void inicializarCatalogo(Catalogo *c) {
    c->total = 0;
}

void adicionarLivro(Catalogo *c, Livro livro) {
    if (c->total < MAX_LIVROS) {
        c->livros[c->total] = livro;
        c->total++;
    } else {
        printf("Catálogo cheio!\n");
    }
}

void listarCatalogo(Catalogo c) {
    printf("\n=== CATÁLOGO DE LIVROS ===\n\n");

    for (int i = 0; i < c.total; i++) {
        printf("Livro %d\n", i + 1);
        mostrarLivro(c.livros[i]);
        printf("\n");
    }
}
