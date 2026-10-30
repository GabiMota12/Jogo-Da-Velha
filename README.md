# Jogo da Velha

Projeto de Jogo da Velha desenvolvido em **Java**, executado pelo terminal e estruturado em classes com responsabilidades separadas.

## Sobre o projeto

O jogo permite que uma pessoa jogue contra um jogador automático (computador) em um tabuleiro 3×3. A cada partida, a ordem de início é definida aleatoriamente. O jogador humano escolhe sua marca (`X` ou `O`) quando começa; caso o computador comece, as marcas também são definidas automaticamente.

Durante a partida, o jogador humano informa a linha e a coluna desejadas (índices de `0` a `2`). O sistema valida a jogada, alterna os jogadores e verifica se houve vitória ou empate. Ao final, é possível iniciar uma nova partida.

## Tecnologias

- Java
- Terminal/console para entrada e saída de dados
- API padrão do Java (`java.io`)

## Estrutura de pastas

```text
Jogo_Da_Velha/
├── Jogador/
│   ├── Jogador.java
│   ├── JogadorHumano.java
│   └── JogadorAutomatico.java
├── Jogo/
│   ├── AnalistaSituacional.java
│   ├── Marca.java
│   └── Tabuleiro.java
└── Velha.java
```

### Pacote `Jogo_Da_Velha`

Contém a classe `Velha`, responsável pelo fluxo principal da aplicação: criação das partidas, definição de quem começa, alternância dos jogadores e encerramento da partida.

### Pasta `Jogador`

Contém as classes e a interface relacionadas aos participantes:

- `Jogador`: interface que define as operações comuns aos jogadores.
- `JogadorHumano`: recebe as jogadas digitadas pelo usuário e apresenta as mensagens de resultado.
- `JogadorAutomatico`: realiza as jogadas do computador por meio de regras implementadas na classe.

### Pasta `Jogo`

Contém as classes que representam e controlam o jogo:

- `Marca`: representa uma marca do tabuleiro, aceitando somente `X` ou `O`.
- `Tabuleiro`: armazena as marcas em uma matriz 3×3, valida posições e fornece representação textual do tabuleiro.
- `AnalistaSituacional`: verifica as condições de vitória e identifica o fim da partida por vitória ou empate.

## Como executar

É necessário ter o **JDK** instalado e o comando `java`/`javac` disponível no terminal.

Abra o terminal na pasta que contém a pasta `Jogo_Da_Velha` e execute:

```bash
javac -d out Jogo_Da_Velha/Velha.java Jogo_Da_Velha/Jogador/*.java Jogo_Da_Velha/Jogo/*.java
java -cp out Jogo_Da_Velha.Velha
```

No Windows, os comandos acima podem ser executados no PowerShell ou no terminal integrado do VS Code, desde que o JDK esteja configurado.

## Como jogar

1. Execute o programa.
2. Quando solicitado, escolha `X` ou `O` caso seja sua vez de definir a marca.
3. Digite a linha e a coluna da posição desejada, usando valores de `0` a `2`.
4. Aguarde a jogada do computador.
5. A partida termina quando um jogador completa uma linha, coluna ou diagonal, ou quando todas as posições ficam ocupadas.
6. Responda `s` para jogar novamente ou `n` para encerrar.

Exemplo de referência das posições:

```text
 0 | 1 | 2
---+---+---
 3 | 4 | 5
---+---+---
 6 | 7 | 8
```

A entrada solicitada pelo programa é feita separadamente: primeiro a linha e depois a coluna, ambas de `0` a `2`.

## Observações

- O tabuleiro é reiniciado a cada nova partida.
- Jogadas em posições ocupadas ou fora dos limites são rejeitadas.
- O computador utiliza regras condicionais para escolher suas jogadas.
- O projeto não utiliza banco de dados nem dependências externas.

---
Projeto acadêmico feito na aula de Programação Orientada a Objeto na PUC Campinas — Jogo da Velha em Java.
