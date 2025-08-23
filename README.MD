# 🛒 E-Commerce Microservices with Spring Boot & Spring Cloud

A production-style microservices architecture built with **Spring Boot 3**, **Java 17**, and **Spring Cloud**.  
Demonstrates service communication, discovery, API gateway, resilience, and observability.

---

## 🧱 Overview

This project simulates an e-commerce system split into independent microservices:

| Service | Port | Description |
|--------|------|-------------|
| `user-service` | 8081 | Manages user data |
| `order-service` | 8082 | Handles orders and integrates with `user-service` |
| `api-gateway` | 8080 | Routes requests to services |
| `discovery-server` | 8761 | Eureka Server for service discovery |
| `config-server` | 8888 | Centralized configuration (Git-backed) |

> 🔐 Future: Add Auth, Inventory, Payment, Kafka, Zipkin, Docker & Kubernetes.

---

## 🚀 Features

- ✅ REST APIs with Spring Web
- ✅ Inter-service communication via **Feign Client**
- ✅ **Eureka Service Discovery** (dynamic service lookup)
- ✅ **API Gateway** with routing & centralized entry
- ✅ **H2 In-Memory DB** for fast development
- ✅ **OpenFeign** for declarative REST clients
- ✅ **Spring Data JPA** for persistence
- ✅ **Lombok** to reduce boilerplate
- ✅ **Actuator** for health checks and metrics
- ✅ Clean project structure with shared modules
- ✅ Ready for Docker & Kubernetes

---

## 📦 Project Structure
```declarative
ecommerce-microservices/
├── user-service/ → User management (8081)
├── order-service/ → Order management (8082)
├── api-gateway/ → Routes requests (8080)
├── discovery-server/ → Eureka Server (8761)
├── config-server/ → Central config (8888)
├── shared/ → Shared DTOs and utils
├── pom.xml → Parent Maven POM
└── README.md




```

---

## ⚙️ Prerequisites

- Java 17
- Maven 3.6+
- Git
- Browser (for H2 Console)
- `curl` or Postman (for testing APIs)

---

## 🧪 Step-by-Step: Run the Project

### 1. Clone the repo
```bash
git clone https://github.com/yourname/ecommerce-microservices.git
cd ecommerce-microservices

```
### 2. Start user-service
```declarative
cd user-service
mvn spring-boot:run
```
→ Runs on http://localhost:8081
### 3. Start order-service
```declarative
cd user-service
mvn spring-boot:run
```
→ Runs on http://localhost:8082

### 🧪 Test APIs
#### Create a User
```declarative
curl -X POST http://localhost:8081/users \
  -H "Content-Type: application/json" \
  -d '{"name":"Alice","email":"alice@example.com"}'
```
#### Create an Order
```curl -X POST http://localhost:8082/orders \
  -H "Content-Type: application/json" \
  -d '{"item":"Laptop","quantity":1,"userId":1}' ```
  ```

## 🖥️ H2 Console
#### Access H2 database for debugging:
```
user-service: http://localhost:8081/h2-console
order-service: http://localhost:8082/h2-console
JDBC URL: jdbc:h2:mem:userdb
Username: sa
Password: (leave empty)
```
🔍 Troubleshooting


## 🛠️ Next Steps (Coming Soon)
- ✅ Add Eureka Discovery Server
- ✅ Add API Gateway (Spring Cloud Gateway)
- ✅ Add Config Server
- ✅ Add Resilience4j (Circuit Breaker)
- ✅ Add Distributed Tracing (Sleuth + Zipkin)
- ✅ Dockerize all services
- ✅ Deploy on Kubernetes (Minikube / Kind)
- 🙌 Author
- 👤 Rajeev NAYAn
- 📧 imrajeevnayan.@gmail.com
- 🔗 GitHub Profile

📄 License
