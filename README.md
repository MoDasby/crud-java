# Descrição da API:

### Corpo padrão paras as rotas:

| Body   | Tipo      | Descrição                           |
| :---------- |:----------| :---------------------------------- |
| `name` | string    | **Obrigatório**|
| `age` | string    | **Obrigatório**|

### Rotas:

| Rotas                | Tipo      | Descrição                           |
|:---------------------|:----------| :---------------------------------- |
| `/person`            | GET       | Retorna todos os usuários             |
| `/person/:id`        | GET       | Retorna um usuário pelo id           |
| `/person/save`       | POST      | Cria um usuário                      |
| `/person/update/:id` | PUT       | Atualiza um usuário                 |
| `/person/delete/:id` | DELETE    | Deleta um usuário                   |