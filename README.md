<h1 align = center> Polylib </h1>

<p align="center">
  <a href="#">
    <img src="https://img.shields.io/badge/status-complete-brightgreen" alt="Status">
  </a>
  <a href="#">
    <img src="https://img.shields.io/badge/language-C-blue" alt="C">
  </a>
  <a href="#">
    <img src="https://img.shields.io/badge/language-C%2B%2B-blue" alt="C++">
  </a>
  <a href="#">
    <img src="https://img.shields.io/badge/language-Python-yellow" alt="Python">
  </a>
  <a href="#">
    <img src="https://img.shields.io/badge/language-C%23-purple" alt="C#">
  </a>
  <a href="#">
    <img src="https://img.shields.io/badge/type-multi--language--library-informational" alt="Multi-language Library">
  </a>
  <a href="#">
    <img src="https://img.shields.io/badge/context-academic-orange" alt="Academic Project">
  </a>
</p>

Biblioteca em Python para manipulação de polígonos e objetos relacionados, utilizando programação orientada a objetos (POO). Este projeto serve como exemplo de estudo e exercício prático de POO em Python.

## 🔹 Funcionalidades

- Definição de classes para diferentes tipos de polígonos.
- Criação de objetos/instâncias a partir das classes.
- Métodos para calcular propriedades geométricas, como área, perímetro e perímetro aproximado.
- Estrutura modular para fácil expansão com novos tipos de polígonos.

## 📁 Estrutura do Projeto

```

polylib/
│
├── C/          → Código-fonte C (src/), headers (include/) e executáveis (bin/)
├── Java/       → Código Java (src/), classes compiladas (bin/)
├── JavaScript/ → Código JS (src/modules, interface, data) e Node.js
├── Python/     → Código Python com POO (models, interface, utils, instances)
│
├── .gitignore
├── LICENSE
└── README.md


````

## 🚀 Como usar

1. Clona o repositório:

```bash
git clone https://github.com/AndersonBrit/Polylib.git
cd Polylib
````

2. Executa o `main.py`:

```bash
python src/main.py
```

3. Exemplo de uso das classes no `obj.py`:

```python
from models.poligono import Poligono

triangulo = Poligono(3, [3, 4, 5])
print(triangulo.area())
print(triangulo.perimetro())
```

## 🧩 Estrutura das Classes

* **Poligono**: Classe base para polígonos genéricos.
* **Quadrado**: Herda de `Poligono` e implementa métodos específicos para quadrados.
* Futuras classes podem ser adicionadas em `models/`.

## ⚙️ Requisitos

* Python 3.10 ou superior
* Nenhuma biblioteca externa necessária (apenas código puro Python).

## 📝 Observações

* Este projeto é principalmente educativo, focado em **organização de código e POO**.
* Para expandir, basta adicionar novas classes de polígonos em `models/` e instanciá-las em `instances/` ou `main.py`.

## 👤 Author

Project developed as part of the professional course  
**Management and Computer Systems Programming (GPSI)**  

**School:** Escola Profissional Bento Jesus Caraça (EPBJC)  
**Subject:** PSI  
**Author:** Andérson Brito

---

## 📄License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.