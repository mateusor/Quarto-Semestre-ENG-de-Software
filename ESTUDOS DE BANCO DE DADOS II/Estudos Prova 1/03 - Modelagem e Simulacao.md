# Modelagem e Simulação

## Agregado

Um **agregado** é um conjunto de dados que deve ser tratado como uma unidade.

A pergunta principal é:

> Estes dados devem ser carregados, salvos e entendidos juntos?

Se sim, pode fazer sentido **aninhar**.

Se não, pode fazer sentido **separar em coleções com referência**.

## Três estilos de modelagem

| Estilo | Quando usar | Exemplo |
|---|---|---|
| Documento agregado | Filho não existe sozinho, é sempre lido com o pai e é pequeno/previsível | Pedido com itens embutidos |
| Referência | Entidades têm vida própria ou crescem muito | Clientes e pedidos |
| Híbrido | Referência + cópia resumida | `clienteId` + nome/email |

## Embedding

Os dados relacionados ficam dentro do próprio documento.

```json
{
  "_id": "...",
  "nome": "Tiago",
  "endereco": {
    "rua": "Rua das Flores, 123",
    "cidade": "Sumaré",
    "estado": "SP"
  }
}
```

É adequado quando:

- Existe forte pertencimento ao pai.
- Os dados são lidos juntos.
- O tamanho é pequeno.
- A quantidade é previsível.
- O filho não possui vida independente.

## Referencing

Os documentos ficam separados e existe uma referência entre eles.

```json
{
  "_id": "A1",
  "nome": "Tiago",
  "curso_id": "C1"
}
```

```json
{
  "_id": "C1",
  "nome": "Ciência da Computação"
}
```

É adequado quando:

- O dado possui vida própria.
- Pode crescer muito.
- Precisa ser consultado isoladamente.
- É atualizado independentemente.
- Existe uma relação muitos-para-muitos.

## Modelo híbrido

Combina referência com uma cópia resumida.

```json
{
  "clienteId": "C1",
  "nome": "Ana",
  "email": "ana@email.com"
}
```

## Cardinalidade

| Relação | Exemplo | Tendência |
|---|---|---|
| 1:1 | Cliente e perfil | Pode aninhar |
| 1:poucos | Cliente e telefones | Geralmente aninhar |
| 1:muitos | Cliente e pedidos | Geralmente separar |
| 1:muitos sem limite | Postagem e comentários | Separar |
| muitos:muitos | Alunos e disciplinas | Separar |

## Checklist de decisão

- O dado filho pertence fortemente ao pai? → **Aninhar**
- O filho é pequeno e limitado? → **Aninhar**
- Pai e filho são sempre consultados juntos? → **Aninhar**
- O filho tem vida própria? → **Separar**
- A lista pode crescer muito? → **Separar**
- Precisa paginar o filho? → **Separar**
- A tela precisa evitar consultas extras? → **Duplicar um resumo**
- É necessário preservar um valor histórico? → **Snapshot**

## Duplicação controlada

No NoSQL, duplicar dados **não é necessariamente um erro**.

Pode ser uma decisão consciente para melhorar a performance de leitura.

É importante documentar:

- Qual campo foi duplicado.
- De onde veio.
- Por que foi duplicado.
- Quando deve ser atualizado.
- Qual é a fonte oficial.

## Snapshot histórico

É preservar o valor de um dado no momento de determinado evento.

Exemplo:

```text
Produto
Preço atual → R$ 100

Pedido antigo
Preço da compra → R$ 80
```

Mesmo que o preço atual seja alterado, o pedido mantém o valor histórico de R$ 80.

## Banco de simulação — controle-frequencia

O laboratório utiliza quatro coleções:

```text
estudantes
professores
disciplinas
chamadas
```

### disciplinas

Guarda as turmas e, dentro de cada turma, o `docente` embutido com nome e RP.

Isso funciona como um resumo dos dados do professor.

### chamadas

É o exemplo mais completo.

Cada chamada é um documento independente que preserva um **snapshot** da disciplina, turma e docente no momento da aula.

Mesmo que o nome do professor seja alterado depois, a chamada antiga mantém o nome daquele momento.

Dentro da chamada, os alunos ficam aninhados:

```text
chamada
 ├── disciplina
 ├── turma
 ├── docente
 └── alunos
      ├── nome
      └── presença
```

Isso demonstra:

- Agregação.
- Aninhamento.
- Duplicação controlada.
- Snapshot.
- Referência simples pelo RA do estudante.

## Farm 3D

Outro laboratório de modelagem documental.

O estudo utiliza o cenário de uma impressora 3D e reforça decisões como:

- Separar ou não o histórico de compras de filamento do saldo atual.
- Definir se os itens utilizados em uma impressão devem ficar embutidos no planejamento.
- Utilizar o maior preço de referência conhecido para não subestimar o custo de reposição.
