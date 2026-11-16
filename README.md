# Sistema de Gerenciamento de Corridas

> Projeto acadêmico de Programação Orientada a Objetos (POO) desenvolvido em Java, com foco na simulação de um sistema de transporte por aplicativo, inspirado no funcionamento de plataformas como a Uber.

## Sobre o projeto

O projeto consiste no desenvolvimento de um sistema de gerenciamento de corridas que permite representar as principais entidades e operações envolvidas em um serviço de transporte por aplicativo.

A proposta é aplicar conceitos fundamentais da Programação Orientada a Objetos na construção de uma aplicação organizada, modular e de fácil manutenção.

O desenvolvimento é realizado colaborativamente, utilizando Git e GitHub para versionamento, organização das tarefas e integração do código produzido pelos integrantes da equipe.

## 🎯 Objetivos

- Aplicar os princípios da Programação Orientada a Objetos.
- Desenvolver classes que representem as entidades do sistema.
- Implementar funcionalidades relacionadas ao gerenciamento de corridas.
- Trabalhar com encapsulamento, herança, construtores, getters e setters.
- Desenvolver habilidades de trabalho em equipe utilizando Git e GitHub.
- Praticar organização, documentação e manutenção de código.

## 🛠️ Tecnologias utilizadas

| Tecnologia | Finalidade |
|---|---|
| Java | Linguagem de programação |
| Git | Controle de versão |
| GitHub | Hospedagem e colaboração |
| IntelliJ IDEA | Ambiente de desenvolvimento |

## 🏗️ Estrutura do projeto

```text
PROJETO-UBER-POO/
│
├── src/
│   ├── Pessoa.java
│   ├── Passageiro.java
│   ├── Motorista.java
│   ├── Veiculo.java
│   ├── Corrida.java
│   ├── solicitarCorrida.java
│   ├── Pagamento.java
│   ├── Avaliacao.java
│   ├── Localizacao.java
│   ├── Trajeto.java
│   ├── NotaFiscal.java
│   └── Main.java
│
├── .gitignore
└── README.md
```

## 🧩 Organização das classes

| Classe | Responsabilidade |
|---|---|
| `Pessoa` | Representa os dados básicos de uma pessoa. |
| `Passageiro` | Representa o usuário que solicita uma corrida. |
| `Motorista` | Representa o motorista e sua disponibilidade. |
| `Veiculo` | Armazena as informações do veículo. |
| `Corrida` | Representa uma corrida e seus atributos. |
| `Pagamento` | Representa as informações de pagamento. |
| `Avaliacao` | Armazena avaliações e comentários. |
| `Localizacao` | Representa informações geográficas. |
| `Trajeto` | Representa a origem, o destino e o valor estimado. |
| `NotaFiscal` | Representa os dados de uma nota fiscal. |
| `Main` | Executa exemplos e demonstra o funcionamento das classes. |
| `solicitarCorrida` | Demonstra o processo de solicitação de uma corrida. |

## ⚙️ Funcionalidades

### Implementadas parcialmente
- Cadastro e representação de passageiros.
- Cadastro e representação de motoristas.
- Gerenciamento de informações de veículos.
- Verificação de disponibilidade de motoristas.
- Representação de corridas.
- Solicitação demonstrativa de uma corrida.
- Consulta e atualização de informações por getters e setters.

### Em desenvolvimento / evolução
- Integração entre as entidades do sistema.
- Gerenciamento do ciclo de vida das corridas.
- Associação entre motoristas, passageiros e veículos.
- Implementação do fluxo de pagamentos.
- Registro e consulta de avaliações.
- Aprimoramento das regras de negócio e validações.

*O escopo e o status das funcionalidades serão atualizados conforme a evolução do projeto.*

## ▶️ Como executar

### Pré-requisitos

- JDK instalado.
- IDE de sua preferência (IntelliJ IDEA, Eclipse ou VS Code).
- Git instalado (opcional para execução local, necessário para colaboração).

### Executando o projeto

1. Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

2. Entre na pasta do projeto:

```bash
cd PROJETO-UBER-POO
```

3. Compile os arquivos Java:

```bash
javac -d out src/*.java
```

4. Execute a classe principal:

```bash
java -cp out Main
```


## 👨‍💻 Equipe de desenvolvimento

**Integrantes:**

- Carlos Daniel
- 
- 
- 
- 

## 📚 Contexto acadêmico

Projeto desenvolvido como atividade acadêmica da disciplina de Programação I, com o objetivo de aplicar conceitos de desenvolvimento de software e POO utilizando Java.

---

**Status:** Em desenvolvimento 🚧

**Repositório:** Projeto acadêmico colaborativo.
