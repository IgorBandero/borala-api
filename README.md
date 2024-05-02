# Projeto Bora Lá API (Back-end) em Java

Projeto de API de um sistema para divulgação de eventos e atividades em grupo
Link do deploy: https://borala-api.onrender.com

### Rotas

- POST /user/signup (Cria o registro de um novo usuário)
- GET /user/:id (Busca no sistema um usuário pelo código do id)

## Como rodar o projeto 

1. Clone esse repositório
2. Crie um banco de dados com o Postgresql
4. Na raíz do projeto, crie um arquivo ".env" com as variáveis de ambiente "DB_URL" (link do banco de dados), "DB_USERNAME" (nome do usuário) e "DB_PASSWORD" (senha), conforme o arquivo ".env.example"
5. Agora é só rodar o programa