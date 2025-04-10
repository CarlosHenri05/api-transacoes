# 📊 API de Transações

API REST que registra transações monetárias e calcula estatísticas em tempo real com base nos últimos 60 segundos.

## 🔧 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Swagger (Springdoc OpenAPI)  
- Maven

## 🚀 Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/CarlosHenri05/transacoes.git
   ```

2. Navegue até a pasta do projeto:

   ```bash
   cd transacoes
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

| Método | Caminho                    | Descrição                          |
|--------|----------------------------|------------------------------------|
| POST   | `/transacoes`              | Registra nova transação            |
| DELETE | `/transacoes`              | Remove todas as transações         |
| GET    | `/transacoes/estatisticas` | Retorna estatísticas dos últimos 60s |

## ✅ Funcionalidades

- Adiciona transações com data e valor
- Ignora transações com mais de 60 segundos
- Impede transações com data futura
- Calcula `sum`, `avg`, `min`, `max` e `count`

## 📁 Estrutura do Projeto

```
br.com.testeitau.transacoes
├── controller
├── dto
├── exception
├── model
├── service
└── TransacoesApplication.java
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
GET /transacoes/estatisticas
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

---
