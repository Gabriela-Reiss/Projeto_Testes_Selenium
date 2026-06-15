# Bugs encontrados

## BUG-001

### Titulo
Bug encontrado no teste "CT-009 Deve voltar para tela de Login ao clicar na opção de Voltar"

### Severidade
Grave

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Voltar" no cabeçalho da página

### Resultado Atual
Permanece na tela de Controle de Produtos

### Resultado Esperado
Encaminhar para página anterior, de Login

### Status
Corrigindo

-------

## BUG-002

### Titulo
Bug encontrado no teste "CT-010 Deve abrir o modal para cadastro de produtos ao clicar no botão "Criar""

### Severidade
Gravíssima

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar uma vez no botão "Criar" para abertura do modal

### Resultado Atual
Apenas clicando duas vezes no botão "Criar" há a abertura do modal

### Resultado Esperado
Abertura do modal ao clicar no botão uma vez

### Status
- Precisa ser corrigido

-------

## BUG-003

### Titulo
Bug encontrado no teste "CT-016 Deve excluir um produto da tabela ao clicar no link "Excluir""

### Severidade
Gravíssima

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar uma vez no botão "Criar" para abertura do modal
4. Preencher os dados, e clicar em "Salvar"
5. Escolher o produto cadastrado e clicar em "Excluir"

### Resultado Atual
Ao clicar em "Excluir", o produto não é removido da tabela

### Resultado Esperado
Exclusão do produto cadastrado ao clicar em "Excluir"

### Status
- Precisa ser corrigido

-------

## BUG-005

### Titulo
Bug encontrado no teste "CT-017 Deve permitir edição de dados um produto da tabela ao clicar no link "Editar""

### Severidade
Gravíssima

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar uma vez no botão "Criar" para abertura do modal
4. Preencher os dados, e clicar em "Salvar"
5. Escolher o produto cadastrado e clicar em "Editar"

### Resultado Atual
Ao clicar em "Editar" não aparece a opção de editar algum dado do produto cadastrado

### Resultado Esperado
Ao clicar em "Editar" abrir um modal que permita edição de dados do produto cadastrado

### Status
- Precisa ser corrigido



