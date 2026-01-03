# interface/menus.py


from utils import limpar_tela


def menu_principal():
    limpar_tela()
    print("╔════════════════════════════════════════════╗")
    print("║          Bem-vindo à Biblioteca!           ║")
    print("╠════════════════════════════════════════════╣")
    print("║              1. Ver catálogo               ║")
    print("║              0. Sair                       ║")
    print("╚════════════════════════════════════════════╝")


def menu_escolha_livro(total):
    print(f"1 - {total}. Escolher livro")
    print("0. Voltar")


def menu_livro_disponivel():
    print("1. Requisitar")
    print("2. Adicionar avaliação")
    print("0. Voltar")


def menu_livro_emprestado():
    print("1. Devolver")
    print("2. Adicionar avaliação")
    print("0. Voltar")
