
# 🛒 Basic Store API (Spring Boot)

A simple **Spring Boot** application that simulates a basic store product management system **without database integration**.  
Products are stored **in-memory**, making it perfect for learning **Spring Boot REST APIs**.

---

## 📌 Features
- **List all products** (`GET /api/products`)
- **Get product by ID** (`GET /api/products/{id}`)
- **Create a new product** (`POST /api/products`)
- **Update an existing product** (`PUT /api/products/{id}`)
- **Delete a product** (`DELETE /api/products/{id}`)
- Fully functional API for testing in **Postman** or any HTTP client.
- Runs **without a database** — data is stored in memory.

---

## 🛠️ Technologies Used
- **Java 17+**  
- **Spring Boot 3.x** (Spring Web)  
- **Maven** (for build and dependency management)  


## 📂 Project Structure
```
src
 └── main
     ├── java
     │   └── com.example.store
     │       ├── controller   # REST API controllers
     │       ├── model        # Product model class
     │       ├── service      # Business logic
     │       └── StoreApplication.java # Main entry point
     └── resources
         └── application.properties   # App configuration
```

---

## 🚀 Installation & Running
### 1️⃣ Clone the repository
```bash
git clone https://github.com/your-username/basic-store-api.git
cd basic-store-api
```

### 2️⃣ Build & Run with Maven
```bash
mvn spring-boot:run
```

> By default, the app runs on **http://localhost:9191**.  
> You can change the port in `src/main/resources/application.properties`:
```properties
server.port=9191
```

---

## 📬 API Endpoints

| Method | Endpoint                | Description                | Request Body Example |
|--------|------------------------|----------------------------|----------------------|
| GET    | `/api/products`         | Get all products           | -                    |
| GET    | `/api/products/{id}`    | Get a product by ID        | -                    |
| POST   | `/api/products`         | Create a product           | `{ "name": "Phone", "price": 999.99 }` |
| PUT    | `/api/products/{id}`    | Update a product           | `{ "name": "Laptop", "price": 1299.99 }` |
| DELETE | `/api/products/{id}`    | Delete a product           | -                    |

---

## 🧪 Testing in Postman

1. Open **Postman**.
2. Create a new collection called **Basic Store API**.
3. Add requests:
   - **GET** → `http://localhost:9191/api/products`
   - **GET** → `http://localhost:9191/api/products/1`
   - **POST** → `http://localhost:9191/api/products` → Body (JSON):
     ```json
     {
       "name": "Smartphone",
       "price": 799.99
     }
     ```
     Set **Content-Type** to `application/json`.
   - **PUT** → `http://localhost:9191/api/products/1` → Body (JSON):
     ```json
     {
       "name": "Updated Smartphone",
       "price": 899.99
     }
     ```
   - **DELETE** → `http://localhost:9191/api/products/1`

4. Send requests and verify responses.

---

## 📌 Notes
- Since there is **no database**, data will reset when the app restarts.
- The API is **CORS-enabled** by default (if configured), so it can work with frontends like React, Angular, or Vue.

---

## 📄 License
This project is open-source and free to use for educational purposes.
```

