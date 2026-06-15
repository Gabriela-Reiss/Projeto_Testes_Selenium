# Casos de Testes - Login

## CT-001 Realizar login com email e senha válidos

### Objetivo
Validar acesso ao sistema com o preenchimento dos campos de email e senha
válidos

### Pré-condições
Usuário cadastrado na aplicação

### Dados de Teste
Email: admin@admin.com
Senha: admin@123

### Passos

### Resultado Esperado
Encaminhar o usuário para página de Cadastro de Produtos

-----------

## CT-002 Tentar realizar login com os campos em branco

### Objetivo
Validar acesso ao sistema sem preencher os campos de email e senha

### Pré-condições
Sem pré-condições

### Dados de Teste
Email: -
Senha: -

### Passos
1. Abrir a aplicação
2. Informar email
3. Informar senha
4. Clicar em Entrar


### Resultado Esperado
Apresentar mensagem de erro: "Informe usuário e senha, os campos não podem ser brancos."

---------

## CT-003 Tentar realizar login com campo de senha em branco

### Objetivo
Validar acesso sem o preenchimento do campo senha

### Pré-condições
Sem pré-condições

### Dados de Teste
Email: admin@email.com
Senha: - 

### Passos
1. Abrir a aplicação
2. Informar senha
4. Clicar em Entrar

### Resultado Esperado
Apresentar mensagem de erro: "Informe usuário e senha, os campos não podem ser brancos."

--------

## CT-004 Tentar realizar login com campo de email em branco

### Objetivo
Validar acesso sem o preenchimento do campo email


### Pré-condições
Sem pré-condições


### Dados de Teste
Email: - 
Senha: admin123

### Passos
1. Abrir a aplicação
2. Informar email
3. Clicar em Entrar

### Resultado Esperado
Apresentar mensagem de erro: "Informe usuário e senha, os campos não podem ser brancos."

---------

## CT-005 Tentar realizar login com dados inválidos

### Objetivo
Validar acesso com preenchimento de dados inválidos (dados não cadastrados)

### Pré-condições
Sem pré-condições

### Dados de Teste
Email: admin@gmail.com
Senha: 123456

### Passos
1. Abrir a aplicação
2. Informar email inválido
3. Informar senha inválido
4. Clicar em Entrar

### Resultado Esperado
Apresentar mensagem de erro: "E-mail ou senha inválidos"

---------

## CT-006 Tentar realizar login com senha inválida

### Objetivo
Validar acesso com preenchimento de senha inválida

### Pré-condições
Usuário cadastrado

### Dados de Teste
Email: admin@admin.com
Senha: admin123

### Passos
1. Abrir a aplicação
2. Informar email válido
3. Informar senha inválida
4. Clicar em Entrar

### Resultado Esperado
Apresentar mensagem de erro: "E-mail ou senha inválidos"

-----------

## CT-007 Tentar realizar login com email inválido

### Objetivo
Validar acesso com preenchimento de email inválido

### Pré-condições
Usuário cadastrado

### Dados de Teste
Email: admin@email.com
Senha: admin@123

### Passos
1. Abrir a aplicação
2. Informar email inválido
3. Informar senha válida
4. Clicar em Entrar

### Resultado Esperado
Apresentar mensagem de erro: "E-mail ou senha inválidos"

----------

# Casos de Testes - Cadastro de Produtos


## CT-008 Deve manter na mesma página de Controle de Produtos ao clicar na logo

### Objetivo
Validar se ao clicar na logo mantém na mesma página

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Sem dados

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar na logo no canto superior esquerdo, indicada pelo nome da página: "Cadastro de Produtos"

### Resultado Esperado
Manter na página Controle de Produtos


---------


## CT-009 Deve voltar para tela de Login ao clicar na opção de Voltar 

### Objetivo
Validar se ao clicar no botão Voltar, volta para a página de Login (anterior)

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Sem dados

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Voltar" no cabeçalho da página

### Resultado Esperado
Voltar para página de Login

-----------

## CT-010 Deve abrir o modal para cadastro de produtos ao clicar no botão "Criar"

### Objetivo
Validar se ao clicar no botão "Criar" é aberto um modal para o cadastro de produtos 

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Sem dados

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Criar"

### Resultado Esperado
Abrir um modal formulário com campos para preenchimento, visando o cadastro de produtos 

---------

## CT-011 Deve fechar o modal de cadastrado de produtos ao clicar no botão "X"


### Objetivo
Validar se ao clicar no botão "X" o modal de cadastro é fechado

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Sem dados

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Criar"
4. Dentro do modal, clicar no "X"

### Resultado Esperado
Fechar o modal de cadastro de produto

-----------

## CT-012 Deve fechar o modal de cadastrado de produtos ao clicar no botão "Sair"

### Objetivo
Validar se ao clicar no botão "Sair" o modal de cadastro é fechado

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Sem dados

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Criar"
4. Dentro do modal, clicar no botão "Sair"

### Resultado Esperado
Fechar o modal de cadastro de produto

----------

## CT-013 Tentar cadastrar um produto com os campos em branco

### Objetivo
Validar se é possível cadastrar um produto com os campos de preenchimento em branco

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Código: -
Nome: -
Quantidade: -
Valor: -
Data Cadastro: -

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Criar"
4. Dentro do modal, não preencher os dados e clicar em "Salvar"

### Resultado Esperado
Apresentar mensagem de erro: "Todos os campos são obrigatórios para o cadastro!"


----------

## CT-014 Tentar cadastrar um produto com um dos campos em branco

### Objetivo
Validar se é possível cadastrar um produto com um dos campos em branco

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Código: 12356
Nome: "Mel de Abelha"
Quantidade: 8
Valor: 50
Data Cadastro: -

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Criar"
4. Dentro do modal, preencher os campos, exceto data de cadastro e clicar no botão "Salvar"

### Resultado Esperado
Apresentar mensagem de erro: "Todos os campos são obrigatórios para o cadastro!"

----------

## CT-015 Deve cadastrar um produto com todos os campos preenchidos

### Objetivo
Validar cadastro de um produto com todos os campos preenchidos

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Código: 12356
Nome: "Mel de Abelha"
Quantidade: 8
Valor: 50
Data Cadastro: "12/06/2026"

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Criar"
4. Dentro do modal, preencher todos os campos clicar no botão "Salvar"

### Resultado Esperado
Cadastrar produto e adicionar na tabela da página de controle de produtos

----------

## CT-016 Deve excluir um produto da tabela ao clicar no link "Excluir"

### Objetivo
Validar se um produto é excluído ao clicar no botão "Excluir"

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Sem

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Criar"
4. Dentro do modal, preencher todos os campos clicar no botão "Salvar"
5. Escolher um dos produtos cadastrados na tabela, e clicar em "Excluir"

### Resultado Esperado
Excluir registro de produto cadastrado


----------

## CT-017 Deve permitir edição de dados um produto da tabela ao clicar no link "Editar"

### Objetivo
Validar se permite edição de dados de um produto cadastrado ao clicar em "Editar"

### Pré-condições
Usuário cadastrado e logado com sucesso 

### Dados de Teste
Código: 12
Nome: "Mel de Abelha"
Quantidade: 8
Valor: 50
Data Cadastro: "12/06/2026"

(alteração do valor do código do produto)

### Passos
1. Logar-se no sistema
2. Acessar página de cadastro de produtos
3. Clicar no botão "Criar"
4. Dentro do modal, preencher todos os campos clicar no botão "Salvar"
5. Escolher um dos produtos cadastrados na tabela, e clicar em "Editar"
6. Alterar o valor do código e clicar novamente em "Salvar"

### Resultado Esperado
Editar valor de código do produto cadastrado





