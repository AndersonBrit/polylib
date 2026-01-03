// interface/menus.js


function menuPrincipal() {
    console.clear();
    console.log("╔════════════════════════════════════════════╗");
    console.log("║          Bem-vindo à Biblioteca!           ║");
    console.log("╠════════════════════════════════════════════╣");
    console.log("║              1. Ver catálogo               ║");
    console.log("║              0. Sair                       ║");
    console.log("╚════════════════════════════════════════════╝");
}

function menuEscolhaLivro(total) {
    console.log(`1 - ${total}. Escolher livro`);
    console.log("0. Voltar");
}

function menuLivroDisponivel() {
    console.log("1. Requisitar");
    console.log("2. Adicionar avaliação");
    console.log("0. Voltar");
}

function menuLivroEmprestado() {
    console.log("1. Devolver");
    console.log("2. Adicionar avaliação");
    console.log("0. Voltar");
}

module.exports = {
    menuPrincipal,
    menuEscolhaLivro,
    menuLivroDisponivel,
    menuLivroEmprestado
};
