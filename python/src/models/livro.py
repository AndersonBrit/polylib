# model/livro.py


class LivroBibloteca:

    def __init__(self, titulo, autor, ano_publicacao, genero):
        #adicionar numeração cada livro adicionado aumenta um numero
        self.titulo = titulo
        self.autor = autor
        self.ano_publicacao = ano_publicacao
        self.genero = genero
        self.emprestado = False   #colocar true quando for emprestado, false - nao emprestado (esta na bibloteca)
        self.avaliacao = []


    def emprestar(self):
        self.emprestado = True
        #print(f"O livro {livro.titulo}, foi emprestado.")  
        print(f"O livro {self.titulo}, foi emprestado.")    #self ja esta a indicar o objeto


    def devolver(self):
        self.emprestado = False
        print(f"O livro {self.titulo}, foi devolvido.")


    def mediaAvaliacoes(self):  
        if len(self.avaliacao) > 0: #verificar se tem avaliações
            media = sum(self.avaliacao) / len(self.avaliacao)  #sum - somar / len - tamanho da lista
            return media
        else:
            return "Nenhuma avaliação realizada"


    def adicionarAvaliacao(self, nota):
        self.avaliacao.append(nota)