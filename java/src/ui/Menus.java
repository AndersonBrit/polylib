// src/interface/Menus.java


package ui;

public class Menus {

    public static void menuPrincipal() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║        Biblioteca (Java)           ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. Ver catálogo                    ║");
        System.out.println("║ 0. Sair                            ║");
        System.out.println("╚════════════════════════════════════╝");
    }

    public static void menuEscolhaLivro(int total) {
        System.out.println("1 - " + total + ". Escolher livro");
        System.out.println("0. Voltar");
    }

    public static void menuLivroDisponivel() {
        System.out.println("1. Requisitar");
        System.out.println("2. Adicionar avaliação");
        System.out.println("0. Voltar");
    }

    public static void menuLivroEmprestado() {
        System.out.println("1. Devolver");
        System.out.println("2. Adicionar avaliação");
        System.out.println("0. Voltar");
    }
}
