// interface/catalogo.js


const { menuLivroDisponivel, menuLivroEmprestado } = require('./menus');

function mostrarCatalogo(catalogo) {
    console.clear();
    console.log("-------------- Catálogo --------------\n");
    catalogo.forEach((livro, index) => {
        console.log(`Livro - ${index + 1}`);
        console.log(`Título: ${livro.titulo}`);
        console.log(`Autor: ${livro.autor}`);
        console.log(`Ano: ${livro.anoPublicacao}`);
        console.log(`Gênero: ${livro.genero}`);
        console.log(`Avaliação Média: ${livro.mediaAvaliacoes()}\n`);
    });
}

const prompt = require('prompt-sync')({sigint: true}); // npm install prompt-sync

function interagirComLivro(catalogo, indice) {
    const livro = catalogo[indice - 1];

    while (true) {
        console.clear();
        console.log(`Título: ${livro.titulo}`);
        console.log(`Avaliação Média: ${livro.mediaAvaliacoes()}\n`);

        if (!livro.emprestado) {
            menuLivroDisponivel();
        } else {
            menuLivroEmprestado();
        }

        const opcao = prompt("\nEscolha uma opção: ");

        if (opcao === "1") {
            const nome = prompt("Digite o seu nome: ");
            if (livro.emprestado) {
                livro.devolver();
                console.log("Livro devolvido com sucesso!");
            } else {
                livro.emprestar();
                console.log("Livro requisitado com sucesso!");
            }
            prompt("Pressione ENTER para continuar...");
        } else if (opcao === "2") {
            while (true) {
                try {
                    const nota = parseInt(prompt("Avaliação (1 a 10): "));
                    if (nota >= 1 && nota <= 10) {
                        livro.adicionarAvaliacao(nota);
                        console.log("Avaliação registada!");
                        prompt("Pressione ENTER para continuar...");
                        break;
                    } else {
                        console.log("Opção inválida!");
                    }
                } catch {
                    console.log("Opção inválida!");
                }
            }
        } else if (opcao === "0") {
            break;
        } else {
            console.log("Opção inválida!");
        }
    }
}

module.exports = { mostrarCatalogo, interagirComLivro };
