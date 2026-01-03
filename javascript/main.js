// main.js


const { menuPrincipal, menuEscolhaLivro } = require('./interface/menus');
const { mostrarCatalogo, interagirComLivro } = require('./interface/catalogo');
const catalogoLivros = require('./data/objetos');
const prompt = require('prompt-sync')({sigint: true}); // npm install prompt-sync

function main() {
    while (true) {
        menuPrincipal();
        const opcao = prompt("\nEscolha uma opção: ");

        if (opcao === "1") {
            while (true) {
                mostrarCatalogo(catalogoLivros);
                menuEscolhaLivro(catalogoLivros.length);

                try {
                    const escolha = parseInt(prompt("\nEscolha: "));
                    if (escolha >= 1 && escolha <= catalogoLivros.length) {
                        interagirComLivro(catalogoLivros, escolha);
                    } else if (escolha === 0) {
                        break;
                    } else {
                        console.log("Opção inválida!");
                        prompt("Pressione ENTER para continuar...");
                    }
                } catch {
                    console.log("Opção inválida!");
                    prompt("Pressione ENTER para continuar...");
                }
            }
        } else if (opcao === "0") {
            console.clear();
            console.log("Obrigado por usar a Biblioteca!");
            break;
        } else {
            console.log("Opção inválida!");
            prompt("Pressione ENTER para continuar...");
        }
    }
}

main();
