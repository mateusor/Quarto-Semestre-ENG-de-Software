# Atlas, Compass e Cluster

## MongoDB Atlas

Serviço de banco de dados na nuvem, totalmente gerenciado pela MongoDB.

- Infraestrutura, backup, monitoramento e segurança são gerenciados pelo Atlas.
- Pode rodar sobre AWS, Azure ou Google Cloud.
- Permite escalar a capacidade do banco.
- Possui camada gratuita para estudos e testes.
- Inclui recursos como Atlas Charts, busca full-text, alertas e sugestão de índices.

> **Resumo:** Atlas = MongoDB como serviço na nuvem.

## MongoDB Cluster

É o conjunto de servidores que efetivamente guarda e gerencia o banco de dados dentro do Atlas.

- É a unidade de deploy.
- Dentro dele ficam bancos, coleções e documentos.
- Pode ser gratuito ou pago.
- Pode utilizar replicação para alta disponibilidade.

> Standalone — um único servidor, sem redundância (não usado em produção)
> Replica Set — vários nós com cópias idênticas dos dados; se um cair, outro assume. É o padrão até no plano gratuito do Atlas
> Sharded Cluster — dados particionados entre vários servidores, para volumes muito grandes

> **Resumo:** Cluster = onde os dados moram de fato dentro do Atlas.

## MongoDB Compass

É a interface gráfica oficial do MongoDB, executada no computador.

Permite:

- Navegar por bancos e coleções.
- Criar, editar e excluir documentos.
- Montar queries visualmente.
- Analisar o schema.
- Importar e exportar JSON e CSV.
- Criar pipelines de agregação.
- Consultar planos de execução.

O Compass pode se conectar a um cluster do Atlas por meio de uma **connection string**.

> **Resumo:** Compass = ferramenta gráfica para visualizar e administrar os dados.

## Como eles se encaixam

```text
Atlas
  ↓
Cluster
  ↓
Compass
```

Fluxo:

1. Criar uma conta no Atlas.
2. Criar um Cluster dentro do Atlas.
3. Obter a connection string.
4. Conectar o Compass ao cluster.
5. Utilizar o Compass para criar bancos, coleções e documentos e executar queries.

## Diferença principal

| Aspecto | Atlas | Compass |
|---|---|---|
| O que é | Serviço de nuvem | Aplicativo/GUI local |
| Onde roda | AWS/Azure/GCP | Computador |
| Função | Hospedar e escalar o banco | Visualizar, consultar e administrar |
| Cluster | É criado dentro do Atlas | Compass se conecta ao cluster |
