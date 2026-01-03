# main.py


from interface.menus import menu_principal, menu_escolha_livro
from interface.catalogo import mostrar_catalogo, interagir_com_livro
from instances.objetos import catalogo_livros
from utils import limpar_tela, opcao_errada, continuar


def main():
    while True:
        menu_principal()
        opcao = input("\nEscolha uma opção: ")

        if opcao == "1":
            while True:
                mostrar_catalogo(catalogo_livros)
                menu_escolha_livro(len(catalogo_livros))

                try:
                    escolha = int(input("\nEscolha: "))
                    if 1 <= escolha <= len(catalogo_livros):
                        interagir_com_livro(catalogo_livros, escolha)
                    elif escolha == 0:
                        break
                    else:
                        opcao_errada()
                except ValueError:
                    opcao_errada()

        elif opcao == "0":
            limpar_tela()
            print("Obrigado por usar a Biblioteca!")
            break
        else:
            opcao_errada()

main()
