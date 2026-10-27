# Quiz — Banco de Dados II

## 1. Atlas vs. Compass

**Qual a principal diferença?**

A) Atlas é o serviço de nuvem que hospeda o cluster; Compass é a GUI local para visualizar e administrar os dados.

B) Compass é o serviço de nuvem; Atlas é a GUI local.

C) São a mesma coisa.

D) Atlas só funciona offline.

**Resposta:** A

---

## 2. Cluster

**O que é um Cluster no MongoDB Atlas?**

A) Um tipo de índice.

B) O conjunto de servidores que armazenam e gerenciam o banco dentro do Atlas.

C) Um plugin do Compass.

D) Uma linguagem de consulta.

**Resposta:** B

---

## 3. Dicionário moderno

**Um dicionário de dados moderno deve começar por:**

A) Definir as tabelas físicas.

B) Descrever entidades e atributos no nível conceitual antes da implementação.

C) Escrever o código.

D) Definir índices.

**Resposta:** B

---

## 4. Atributo composto

**Um atributo `endereco` com logradouro, cidade, CEP etc. é:**

A) Simples.

B) Multivalorado apenas.

C) Composto.

D) Um índice.

**Resposta:** C

---

## 5. Composto + multivalorado

**Se um cliente pode ter vários endereços, `enderecos` é:**

A) Simples.

B) Composto e multivalorado.

C) Apenas obrigatório.

D) Um índice.

**Resposta:** B

---

## 6. Documento agregado

**Quando o aninhamento é adequado?**

A) Quando o filho tem vida própria e cresce sem limite.

B) Quando o filho é sempre lido com o pai e é pequeno/limitado.

C) Quando muitos usuários atualizam o filho simultaneamente.

D) Nunca é adequado.

**Resposta:** B

---

## 7. Muitos sem limite

**Postagem e comentários, quando os comentários podem crescer sem limite, geralmente devem ser:**

A) Sempre aninhados.

B) Separados em coleções, com referência.

C) Duplicados em vários lugares.

D) Não podem ser modelados.

**Resposta:** B

---

## 8. Snapshot

**O que é um snapshot histórico?**

A) Um backup automático do Atlas.

B) Preservar o valor de um dado no momento de um evento, mesmo que o original mude depois.

C) Um índice.

D) Um comando do Compass.

**Resposta:** B

---

## 9. `controle-frequencia`

**O que a coleção `chamadas` faz com os dados de disciplina, turma e docente?**

A) Ignora os dados.

B) Guarda apenas uma referência.

C) Faz um snapshot desses dados no momento da aula dentro do documento da chamada.

D) Cria uma coleção para cada chamada.

**Resposta:** C

---

## 10. Duplicação no NoSQL

**Duplicar dados em bancos NoSQL orientados a documentos é:**

A) Sempre um erro.

B) Pode ser uma decisão arquitetural consciente, desde que documentada.

C) Permitido apenas em bancos relacionais.

D) Uma limitação do Atlas.

**Resposta:** B
