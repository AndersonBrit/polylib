// src/menus.c


#include <stdio.h>
#include "menus.h"

void menuPrincipal() {
    printf("\n===== BIBLIOTECA =====\n");
    printf("1. Ver catálogo\n");
    printf("0. Sair\n");
    printf("======================\n");
}

int lerOpcao() {
    int opcao;
    printf("Escolha uma opção: ");
    scanf("%d", &opcao);
    return opcao;
}
