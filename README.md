# Escola API

API RESTful para cadastro e gerenciamento de alunos, desenvolvida com Spring Boot, JPA, PostgreSQL e validação de dados.

---

## Índice

- [Descrição](#descrição)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades](#funcionalidades)
- [Como Rodar a Aplicação](#como-rodar-a-aplicação)
- [Endpoints](#endpoints)
- [Validação dos Dados](#validação-dos-dados)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Configuração do Banco de Dados](#configuração-do-banco-de-dados)
- [Swagger / Documentação](#swagger--documentação)
- [Contribuição](#contribuição)
- [Contato](#contato)

---

## Descrição

Esta API oferece funcionalidades básicas para cadastro, atualização, consulta e exclusão de alunos em uma escola, garantindo que os dados sejam validados corretamente.

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.5.3
- Spring Data JPA
- Hibernate Validator
- PostgreSQL
- Maven
- Lombok
- Swagger (OpenAPI) para documentação

---

## Funcionalidades

- Listar todos os alunos
- Buscar aluno por ID
- Criar novo aluno
- Atualizar dados do aluno
- Excluir aluno
- Validação automática dos campos obrigatórios

---

## Como Rodar a Aplicação

### Passo 1: Clone o repositório

```bash
git clone https://github.com/Jacksonnr/Desafio-Bahiana.git
```

### Passo 2: Compile e execute a aplicação

```bash
mvn clean install
mvn spring-boot:run
```

### Passo 3: Acesse a API

A API estará disponível em:

```
http://localhost:8080/alunos
```

---

## Endpoints

| Método | Endpoint       | Descrição                 |
|--------|----------------|---------------------------|
| GET    | /alunos        | Lista todos os alunos      |
| GET    | /alunos/{id}   | Busca aluno pelo ID        |
| POST   | /alunos        | Cria um novo aluno         |
| PUT    | /alunos/{id}   | Atualiza aluno existente   |
| DELETE | /alunos/{id}   | Deleta aluno pelo ID       |

---

## Validação dos Dados

| Campo           | Regras de Validação               |
|-----------------|----------------------------------|
| nomeAluno       | Obrigatório, não pode ser vazio  |
| idadeAluno      | Obrigatório                      |
| nomeResponsavel | Obrigatório, não pode ser vazio  |
| turmaAluno      | Obrigatório, não pode ser vazio  |

---

## Estrutura do Projeto

```
src/
 ├── main/
 │    ├── java/com/bahiana/escola/
 │    │    ├── controller/       # Controladores REST
 │    │    ├── model/            # Entidades JPA
 │    │    ├── repository/       # Interfaces JPA Repository
 │    │    ├── service/          # Serviços e lógica de negócio
 │    │    └── EscolaApplication.java # Classe principal Spring Boot
 │    └── resources/
 │         ├── application.properties # Configurações do projeto
 │         └── ...
```

---

## Configuração do Banco de Dados

Configure o arquivo `src/main/resources/application.properties` com as informações do seu banco PostgreSQL:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/escola_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Swagger / Documentação

Para documentar e testar a API visualmente, você pode usar o Swagger UI.

### Dependência no `pom.xml`

Adicione a dependência:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.1.0</version>
</dependency>
```

### Acessando o Swagger UI

Após iniciar a aplicação, acesse:

```
http://localhost:8080/swagger-ui.html
```

Ou:

```
http://localhost:8080/swagger-ui/index.html
```

---

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie sua branch (`git checkout -b feature/nova-funcionalidade`)
3. Faça commit das suas alterações (`git commit -m 'feat: nova funcionalidade'`)
4. Faça push para a branch (`git push origin feature/nova-funcionalidade`)
5. Abra um Pull Request

---

## Contato

Para dúvidas ou sugestões, entre em contato: jreis3607@gmail.com

