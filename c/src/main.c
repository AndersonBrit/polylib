// src/main.c


#include <stdio.h>
#include "livro.h"
#include "catalogo.h"
#include "menus.h"

int main() {

    Catalogo catalogo;
    inicializarCatalogo(&catalogo);

    Livro l1 = {"1984", "George Orwell", 1949, "Distopia", 0};
    Livro l2 = {"Harry Potter", "J.K. Rowling", 1997, "Fantasia", 0};

    adicionarLivro(&catalogo, l1);
    adicionarLivro(&catalogo, l2);

    int opcao;

    do {
        menuPrincipal();
        opcao = lerOpcao();

        if (opcao == 1) {
            listarCatalogo(catalogo);
        }

    } while (opcao != 0);

    printf("\nPrograma terminado.\n");
    return 0;
}
