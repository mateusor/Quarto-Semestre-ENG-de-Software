# Tech Academy — Estilização com CSS Puro

Atividade prática de estilização de uma página HTML fornecida (`atv.html`), utilizando **apenas HTML e CSS puro** (sem Bootstrap, CSS Grid ou frameworks).

## 📋 Objetivo

Criar o arquivo `style.css` para reproduzir o layout de referência da página Tech Academy, aplicando conceitos de Flexbox, espaçamento e responsividade simples (quebra de linha automática).

## ✅ Requisitos atendidos

1. **Cabeçalho**: nome "TECH ACADEMY" posicionado à esquerda e menu de navegação à direita.
2. **Menu**: links organizados na mesma linha (horizontal).
3. **Seção `.apresentacao`**: construída com Flexbox, mantendo o texto de apresentação de um lado e o destaque "+500 alunos" do outro.
4. **Alinhamento vertical**: elementos internos da apresentação centralizados verticalmente.
5. **Seção de cursos**: cards organizados lado a lado.
6. **Espaçamento**: distância uniforme entre os cards (via `gap` ou `margin`).
7. **Responsividade simples**: quando não há espaço suficiente na linha, os cards quebram automaticamente para a linha seguinte (`flex-wrap: wrap`).
8. **Cards**: com largura definida, borda, padding e espaçamento adequados.
9. **Card — carga horária e botão**: texto da carga horária e botão "Saiba mais" exibidos em linhas separadas.

## 🗂️ Estrutura de arquivos

```
├── atv.html      # Arquivo HTML fornecido (conteúdo da página)
├── style.css     # Estilização desenvolvida (entrega principal)
└── README.md     # Este arquivo
```

## 🛠️ Tecnologias

- HTML5
- CSS3 (Flexbox, seletores, box model)

## 🚀 Como visualizar

1. Baixe `atv.html` e `style.css` na mesma pasta.
2. Garanta que o `atv.html` referencia o `style.css` (tag `<link rel="stylesheet" href="style.css">` no `<head>`).
3. Abra o `atv.html` no navegador.

## 📦 Entrega

- [ ] Arquivo `style.css`
- [ ] Print do resultado final
