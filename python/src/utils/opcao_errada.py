# utils/opcao_errada.py


from .limpar_tela import limpar_tela


def opcao_errada():
    limpar_tela()
    print(f"\tOpção inválida!")
    input("Presione qualquer tecla para continuar ...")