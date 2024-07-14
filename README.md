# Projeto de Cadastro e Financiamento de Imóveis

Este projeto tem como objetivo criar um sistema para cadastrar diferentes tipos de imóveis e calcular o financiamento dos mesmos, além de permitir a serialização e desserialização dos dados para armazenamento e recuperação posterior.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- `Apartamento`: Representa um apartamento e contém informações específicas deste tipo de imóvel.
- `Casa`: Representa uma casa e contém informações específicas deste tipo de imóvel.
- `Terreno`: Representa um terreno e contém informações específicas deste tipo de imóvel.
- `Financiamento`: Classe base que contém as informações comuns de um financiamento.
- `InterfaceUsuario`: Classe para interação com o usuário, responsável por receber e validar dados.
- `FinanciamentoException`: Classe de exceção personalizada para tratar erros de financiamento.

## Funcionalidades

1. **Cadastro Manual de Imóveis**:
    - Cadastra imóveis manualmente através da interação com o usuário.
    - Exemplos de cadastro direto no código para demonstração.

2. **Armazenamento em Arquivo**:
    - Armazena os dados dos financiamentos cadastrados em um arquivo texto (`Array-Financiamentos.txt`).
    - Lê e exibe os dados armazenados no arquivo texto.

3. **Serialização e Desserialização**:
    - Serializa o array de financiamentos para um arquivo (`Array-Financiamentos.test`).
    - Desserializa o array de financiamentos do arquivo e exibe os dados.

## Como Executar

1. **Requisitos**:
    - Java Development Kit (JDK) 8 ou superior.

2. **Compilação**:
    - Compile todas as classes do projeto:
      ```sh
      javac -d bin src/main/java/*.java src/main/java/modelo/*.java src/main/java/util/*.java
      ```

3. **Execução**:
    - Execute a classe principal:
      ```sh
      java -cp bin main.Main
      ```

## Exemplo de Uso

Ao executar o programa, ele realiza as seguintes operações:

1. Instancia uma nova interface de usuário para não tornar os métodos estáticos.
2. Cria um array para guardar os financiamentos cadastrados.
3. Adiciona financiamentos manualmente através da interação com o usuário e diretamente no código.
4. Armazena os dados dos financiamentos em um arquivo texto e exibe os dados armazenados.
5. Serializa o array de financiamentos para um arquivo e desserializa, exibindo os dados.

## Notas Adicionais

- Certifique-se de que os arquivos `Array-Financiamentos.txt` e `Array-Financiamentos.test` sejam criados no mesmo diretório em que o programa é executado.
- A classe `InterfaceUsuario` deve conter métodos para interação com o usuário, como `cadastrarValorImovelValido()`, `cadastrarPrazodeFinanciamentoValido()`, `cadastrarTaxadeJurosValida()`, entre outros.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias e correções.

## Licença

Este projeto é licenciado sob os termos da [MIT License](LICENSE).

Este é um projeto da disciplina de POO do curso de Análise e desenvolvimento de sistemas da PUCPR 2024

---

Desenvolvido por [Clarice Almeida](https://github.com/ClariceAlmeida).
