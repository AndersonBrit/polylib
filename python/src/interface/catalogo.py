# interface/catalogo.py


from utils import limpar_tela, continuar, opcao_errada
from interface.menus import menu_livro_disponivel, menu_livro_emprestado


def mostrar_catalogo(catalogo):
    limpar_tela()
    print("-------------- Catálogo --------------\n")

    for idx, livro in enumerate(catalogo, start=1):
        print(f"Livro - {idx}")
        print(f"Título: {livro.titulo}")
        print(f"Autor: {livro.autor}")
        print(f"Ano: {livro.ano_publicacao}")
        print(f"Género: {livro.genero}")
        print(f"Avaliação Média: {livro.mediaAvaliacoes()}\n")


def interagir_com_livro(catalogo, indice):
    livro = catalogo[indice - 1]

    while True:
        limpar_tela()
        print(f"Título: {livro.titulo}")
        print(f"Avaliação Média: {livro.mediaAvaliacoes()}\n")

        if not livro.emprestado:
            menu_livro_disponivel()
        else:
            menu_livro_emprestado()

        opcao = input("\nEscolha uma opção: ")

        if opcao == "1":
            nome = input("Digite o seu nome: ")
            if livro.emprestado:
                livro.devolver()
                print("Livro devolvido com sucesso!")
            else:
                livro.emprestar()
                print("Livro requisitado com sucesso!")
            continuar()

        elif opcao == "2":
            while True:
                try:
                    nota = int(input("Avaliação (1 a 10): "))
                    if 1 <= nota <= 10:
                        livro.adicionarAvaliacao(nota)
                        print("Avaliação registada!")
                        continuar()
                        break
                    else:
                        opcao_errada()
                except ValueError:
                    opcao_errada()

        elif opcao == "0":
            break
        else:
            opcao_errada()
