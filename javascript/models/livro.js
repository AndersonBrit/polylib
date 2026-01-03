// models/livro.js

class LivroBiblioteca {
    constructor(titulo, autor, anoPublicacao, genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.emprestado = false;
        this.avaliacoes = [];
    }

    emprestar() {
        this.emprestado = true;
        console.log(`O livro "${this.titulo}" foi requisitado.`);
    }

    devolver() {
        this.emprestado = false;
        console.log(`O livro "${this.titulo}" foi devolvido.`);
    }

    adicionarAvaliacao(nota) {
        this.avaliacoes.push(nota);
    }

    mediaAvaliacoes() {
        if (this.avaliacoes.length === 0) return "Nenhuma avaliação realizada";
        const soma = this.avaliacoes.reduce((acc, val) => acc + val, 0);
        return (soma / this.avaliacoes.length).toFixed(1);
    }
}

module.exports = LivroBiblioteca;
