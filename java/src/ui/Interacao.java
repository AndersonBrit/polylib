// src/interface/interacao.java


package ui;

import java.util.Scanner;
import data.Catalogo;
import models.LivroBiblioteca;

public class Interacao {

    private static Scanner scanner = new Scanner(System.in);

    // Menu principal
    public static void iniciar(Catalogo catalogo) {

        while (true) {
            Menus.menuPrincipal();
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                menuCatalogo(catalogo);
            } 
            else if (opcao.equals("0")) {
                System.out.println("Biblioteca encerrada.");
                break;
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    // Menu do catálogo
    private static void menuCatalogo(Catalogo catalogo) {

        while (true) {
            System.out.println("\n----- Catálogo -----");

            int i = 1;
            for (LivroBiblioteca livro : catalogo.getLivros()) {
                System.out.println(i + ". " + livro.getTitulo());
                i++;
            }

            Menus.menuEscolhaLivro(catalogo.totalLivros());
            System.out.print("Escolha: ");
            String escolha = scanner.nextLine();

            try {
                int opcao = Integer.parseInt(escolha);

                if (opcao >= 1 && opcao <= catalogo.totalLivros()) {
                    menuLivro(catalogo.getLivro(opcao - 1));
                } 
                else if (opcao == 0) {
                    break;
                } 
                else {
                    System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite um número!");
            }
        }
    }

    // Menu de um livro específico
    private static void menuLivro(LivroBiblioteca livro) {

        while (true) {
            System.out.println("\nLivro: " + livro.getTitulo());
            System.out.println("Média: " + livro.mediaAvaliacoes());

            if (!livro.isEmprestado()) {
                Menus.menuLivroDisponivel();
            } else {
                Menus.menuLivroEmprestado();
            }

            System.out.print("Escolha: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                if (livro.isEmprestado()) {
                    livro.devolver();
                    System.out.println("Livro devolvido!");
                } else {
                    livro.emprestar();
                    System.out.println("Livro requisitado!");
                }
            } 
            else if (opcao.equals("2")) {
                adicionarAvaliacao(livro);
            } 
            else if (opcao.equals("0")) {
                break;
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    // Adicionar avaliação
    private static void adicionarAvaliacao(LivroBiblioteca livro) {

        while (true) {
            System.out.print("Avaliação (1 a 10): ");
            String input = scanner.nextLine();

            try {
                int nota = Integer.parseInt(input);

                if (nota >= 1 && nota <= 10) {
                    livro.adicionarAvaliacao(nota);
                    System.out.println("Avaliação registada!");
                    break;
                } else {
                    System.out.println("Nota inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite um número!");
            }
        }
    }
}
