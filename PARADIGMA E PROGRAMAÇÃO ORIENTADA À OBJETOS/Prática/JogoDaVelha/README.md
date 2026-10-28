# Jogo da Velha em Java

Jogo da Velha no terminal, em que você joga contra o computador. Foi feito na aula prática de **Paradigma e Programação Orientada a Objetos** (4º semestre de Engenharia de Software, PUC-Campinas).

O objetivo da atividade era modelar o jogo com classes bem separadas e aplicar os conceitos de POO vistos em aula: encapsulamento, interfaces, polimorfismo, tratamento de exceções e os métodos obrigatórios (`toString`, `equals`, `hashCode`, construtor de cópia e `clone`).

```
     0   1   2
  0  O | O | X
    ---+---+---
  1    | X | O
    ---+---+---
  2  X |   | X

Parabens, voce ganhou!
```

## Como jogar

Você precisa do JDK 8 ou mais recente. Na pasta do projeto:

```bash
javac -d out Velha.java jogo/*.java jogador/*.java
java -cp out Velha
```

O jogo sorteia quem começa. Quem começa escolhe a marca (`X` ou `O`), e o outro fica com a que sobrou. Para jogar, informe a linha e a coluna (de 0 a 2). Ao fim de cada partida, você escolhe se quer jogar de novo, e a vez de começar alterna entre você e o computador.

## Estrutura

```
Velha.java                    ponto de entrada: controla as partidas e a troca de turnos
jogo/
  Marca.java                  marca X ou O, com validação no construtor
  Tabuleiro.java              matriz 3x3 de marcas, com acesso validado por posição
  AnalistaSituacional.java    descobre o vencedor e detecta o fim de jogo (vitória ou velha)
jogador/
  Jogador.java                interface comum: getMarca() e facaSuaJogada()
  JogadorHumano.java          lê as jogadas pelo teclado e trata entradas inválidas
  JogadorAutomatico.java      o computador, que escolhe a jogada por prioridade
```

## Como o computador joga

A cada turno, o `JogadorAutomatico` percorre as 8 linhas possíveis (3 linhas, 3 colunas e 2 diagonais) e escolhe a primeira jogada que se encaixar nesta ordem de prioridade:

1. **Ganhar:** se já tem duas marcas numa linha e a terceira casa está livre, completa a linha.
2. **Bloquear:** se o adversário tem duas marcas numa linha, ocupa a casa que faltava para ele.
3. **Preparar:** se tem uma marca sozinha numa linha vazia, coloca a segunda para criar uma ameaça.
4. **Qualquer casa livre:** se nada acima se aplica, joga na primeira posição vazia.

## Conceitos de POO aplicados

- **Interface e polimorfismo:** `Velha` trata os dois jogadores pelo tipo `Jogador` e só chama `facaSuaJogada()`, sem saber se a jogada vem do teclado ou do computador.
- **Encapsulamento:** todos os atributos são privados. O tabuleiro só pode ser alterado por `setMarcaNaPosicao`, que valida a posição e a marca.
- **Exceções:** posições fora de 0 a 2, marcas diferentes de `X`/`O` e marcas nulas lançam exceção, em vez de deixar o objeto num estado inválido.
- **Métodos obrigatórios:** `Marca`, `Tabuleiro` e `AnalistaSituacional` implementam `toString`, `equals` e `hashCode`. `Tabuleiro` também tem construtor de cópia e `clone`.
- **Pacotes:** as classes do domínio do jogo (`jogo`) ficam separadas das classes de jogador (`jogador`).

## Autores

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/mateusor">
        <img src="https://avatars.githubusercontent.com/mateusor" width="90" alt="Mateus Oliveira"/><br/>
        <b>Mateus Oliveira</b>
      </a><br/>
      <sub>@mateusor</sub>
    </td>
    <td align="center">
      <a href="https://github.com/gcoutiinho">
        <img src="https://avatars.githubusercontent.com/gcoutiinho" width="90" alt="Gabriel Coutinho"/><br/>
        <b>Gabriel Coutinho</b>
      </a><br/>
      <sub>@gcoutiinho</sub>
    </td>
  </tr>
</table>
