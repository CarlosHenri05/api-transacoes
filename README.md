# 📊 API de Transações

API REST que registra transações monetárias e calcula estatísticas em tempo real com base nos últimos 60 segundos, baseado no teste técnico do Itaú.

## 🔧 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Swagger (Springdoc OpenAPI)  
- Maven

## 🚀 Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/CarlosHenri05/api-transacoes.git
   ```

2. Navegue até a pasta do projeto:

   ```bash
   cd api-transacoes
   ```

3. Compile e execute:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse a documentação Swagger:

   ```
   http://localhost:8080/swagger-ui.html
   ```

## 📌 Endpoints

| Método | Caminho                    | Descrição                           |
|--------|----------------------------|-------------------------------------|
| POST   | `/transacao`               | Registra nova transação             |
| DELETE | `/transacoes`              | Remove todas as transações          |
| GET    | `/estatisticas`            | Retorna estatísticas dos últimos 60s|

## ✅ Funcionalidades

- Adiciona transações com data e valor.
- Impede transações com data futura.
- Impede transações com valor igual ou abaixo de 0.
- Calcula `sum`, `avg`, `min`, `max` e `count` baseado nas transações dos últimos 60 segundos. 

## 📁 Estrutura do Projeto

```
br.com.testeitau.transacoes
├── config 
├── controller
├── dto
├── exception
├── model
├── mapper
├── service
└── ApiTransacoesApplication.java
```

## 📄 Exemplos de Requisições

### Criar uma transação

```http
POST /transacoes
Content-Type: application/json

{
  "valor": 250.0,
  "dataHora": "2025-04-09T17:30:00Z"
}
```

### Estatísticas

```http
GET /estatisticas
```

```json
{
  "soma": 250.0,
  "media": 250.0,
  "min": 250.0,
  "max": 250.0,
  "quantidade": 1
}
```

## 🧪 Testes

Em breve será adicionado suporte a testes automatizados para garantir a robustez da aplicação.

## Futuras tecnologias 

- Testes unitários com JUnit e Mockito juntos.
- Ferramentas de container (Docker).
- Ferramentas para segurança e autenticação (Spring Security e JWT).
- Não é o objetivo do teste, mas poderiamos sim juntar a aplicação com bancos de dados relacionais. 


---
