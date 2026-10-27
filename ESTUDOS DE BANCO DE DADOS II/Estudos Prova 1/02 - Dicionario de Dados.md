# Dicionário de Dados

## O que é

É o documento que descreve os dados importantes de um sistema:

- Quais entidades existem.
- Quais atributos as descrevem.
- O significado de cada atributo.
- O tipo de cada atributo.
- Se é obrigatório.
- Se é simples, composto ou multivalorado.
- Quais regras se aplicam.
- Como os dados podem ser estruturados.

### Pergunta central

> Que dados o sistema precisa guardar, o que eles significam e como podem ser estruturados?

## Visão tradicional vs. visão moderna

### Tradicional

Descreve diretamente a estrutura física:

```text
Tabela
Campo
Tipo
Obrigatório
```

Funciona quando já foi decidido que o banco será relacional.

### Moderna

Começa pelo nível **conceitual**, descrevendo entidades e atributos sem assumir uma tecnologia.

Depois, esse modelo é desdobrado para a implementação física.

A ideia é não misturar:

```text
Entender o dado
      ↓
Decidir a implementação
```

## Tipos de atributos

| Tipo | Definição | Exemplo |
|---|---|---|
| Simples | Não precisa ser dividido | nome, CPF, email |
| Composto | Formado por outros atributos | endereço |
| Multivalorado | Pode aparecer várias vezes | telefones, endereços |

Um atributo pode ser **composto e multivalorado ao mesmo tempo**.

Exemplo:

```text
enderecos
 ├── logradouro
 ├── bairro
 ├── cidade
 ├── numero
 └── cep
```

O cliente pode possuir vários desses endereços.

## Os 3 níveis

### Nível 1 — Entidades e atributos conceituais

Descreve o domínio sem assumir tecnologia.

Exemplo:

```text
Cliente
- id
- nome
- enderecos
```

### Nível 2 — Estruturas internas

Detalha atributos compostos ou reutilizáveis.

Exemplo:

```text
Endereco
- logradouro
- bairro
- cidade
- numero
- cep
```

### Nível 3 — Desdobramento físico/tecnológico

Mostra como os dados serão implementados.

Pode incluir:

- Documento JSON/NoSQL.
- Tabelas relacionais.
- PK/FK.
- Índices.
- Queries.

## Exemplo: Cliente + Endereço

### Documento

No MongoDB, os endereços podem ficar embutidos no documento do cliente:

```json
{
  "_id": "cli_001",
  "nome": "Ana Ribeiro",
  "enderecos": [
    {
      "logradouro": "Rua das Flores",
      "cidade": "Campinas",
      "tipo": "RESIDENCIAL"
    }
  ]
}
```

Faz sentido quando:

- Os endereços são consultados junto com o cliente.
- Pertencem claramente ao cliente.
- Não precisam ser buscados sozinhos.
- A quantidade é pequena.

### Relacional

O endereço pode virar uma tabela separada ligada ao cliente por `id_cliente`.

Faz sentido quando:

- Endereços precisam ser consultados independentemente.
- Existe muito volume.
- É necessária integridade referencial.
- Há muitos relatórios SQL.

## Documento vs. Relacional

| Aspecto | Documento | Relacional |
|---|---|---|
| Endereços | Embutidos no Cliente | Tabela separada |
| Cliente + endereços | Direto | Join |
| Atualização isolada | Menos conveniente | Natural |
| Normalização | Menor | Maior |
| Melhor quando | Dados acessados juntos | Dados têm vida própria |

## Papel arquitetural

O dicionário não serve apenas para listar campos.

Ele ajuda a decidir:

- O que embutir.
- O que referenciar.
- O que normalizar.
- O que duplicar por desempenho.

No NoSQL, é importante pensar em:

- Como a aplicação consulta os dados.
- Quais dados aparecem juntos.
- Qual o tamanho esperado dos documentos.
- Quais campos mudam com frequência.
