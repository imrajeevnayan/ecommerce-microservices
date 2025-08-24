# 🛒 E-Commerce Microservices with Spring Boot & Frontend (No Docker)

A full-stack microservices application built with **Spring Boot 3**, **Java 17**, **PostgreSQL**, and a **Node.js-powered frontend**.  
No Docker required — runs locally with **Maven** and **Node.js**.

Perfect for learning, portfolios, or production prototypes.

---

## 🧱 Overview

This project simulates an e-commerce system with:
- ✅ `user-service`: Manages user data
- ✅ `order-service`: Manages orders
- ✅ `discovery-server`: Eureka Server for service discovery
- ✅ PostgreSQL: Persistent database (no H2)
- ✅ Frontend: HTML + JavaScript served via `http-server`
- ✅ CORS: Enabled for frontend-backend communication
- ✅ Maven multi-module structure

All services register with **Eureka** and communicate via REST.

---

## 🚀 Features

- ✅ REST APIs with Spring Web
- ✅ Service Discovery with **Eureka**
- ✅ Persistent Data with **PostgreSQL**
- ✅ Frontend integration (no Docker)
- ✅ CORS enabled for `http://localhost:3000`
- ✅ Inter-service communication (future-ready)
- ✅ Maven multi-module structure
- ✅ Runs without Docker
- ✅ Full `README` in one file

---


## 📦 Project Structure
```declarative
ecommerce-microservices/
├── user-service/ → User management (8081)
├── order-service/ → Order management (8082)
├── discovery-server/ → Eureka Server (8761)
├── frontend/ → Static HTML/JS (3000)
├── pom.xml → Parent Maven POM
└── README.md ← You're here!

```


---

## ⚙️ Prerequisites

- ✅ **Java 17** (JDK 17)
- ✅ **Maven 3.6+** (`mvn --version`)
- ✅ **Node.js + npm** (for frontend: `npx http-server`)
- ✅ **PostgreSQL** (installed manually or via installer)
- ✅ **Browser** (Chrome, Firefox, Edge)

---

## 🧪 Step-by-Step: Run the Project

### 1. Install and Start PostgreSQL

Download: [https://www.postgresql.org/download/](https://www.postgresql.org/download/)

Create databases:
```sql
CREATE DATABASE userdb;
CREATE DATABASE orderdb;

## 🧪 Step-by-Step: Run the Project

### 1. Clone the repo
```bash
git clone https://github.com/yourname/ecommerce-microservices.git
cd ecommerce-microservices

```
Use:

- Username: postgres
- Password: admin123
- Port: 5432

### 2. Start discovery-server (Eureka)
```declarative
cd discovery-server
mvn spring-boot:run
```

✅ Open: http://localhost:8761 → Eureka Dashboard
### 3. Start user-service
```declarative
cd user-service
mvn spring-boot:run
```
- → Runs on http://localhost:8081
- ✅ Registers with Eureka
### 4. Start order-service
```declarative
cd user-service
mvn spring-boot:run
```
- → Runs on http://localhost:8082
- ✅ Registers with Eureka

### 5. Start Frontend
```declarative
cd frontend
npx http-server -p 3000
```
- → Runs on http://localhost:3000
- 

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

## 🖥️ 🖥️ Eureka Dashboard
- After starting services,
- open: 👉 http://localhost:8761

You should see:



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
- 👤 Rajeev NAYAN
- 📧 imrajeevnayan.@gmail.com
- 🔗 [GitHub](https://github.com/imrajeevnayan)

📄 License
