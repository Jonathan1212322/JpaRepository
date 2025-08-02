# JpaRepository
# 📚 BookAPI – RESTful Book Catalog

**BookAPI** is a RESTful application built with **Spring Boot**, designed to help the fictional publishing company **"Letras Vivas"** manage its digital catalog of books. It allows clients to list, add, search, and delete books using HTTP requests.

This project follows a multi-layered architecture with a clean separation between the controller, service, repository, and model layers. It also uses Spring Data JPA for database interaction, dependency injection, and H2 in-memory database configuration for quick testing.

---

## ✅ Steps to Run and View Our API

### Step 1:
Download the project and once finished, open it in an IDEA, which is IntelliJ IDEA. At this point, the community version has been used.

### Step 2: 
Go to the file Challenge1Application.java which is located at the package address sv.edu.udb.challenge1.

### Step 3:
Run the file and open the following URL in your browser: http://localhost:8080/h2-console

### Step 4: 
a table is shown where credentials are entered and in the project it is already determined how to enter but in the section where it says JDBC URL: this address "jdbc:h2:mem:letrasvivas" will be written to access our project.	


This will allow you to access our project’s in-memory database.

---

## 📁 Project Structure

```bash
src/
└── main/
    └── java/
        └── edu/
            └── udb/
                └── desafio1/
                    ├── Desafio1Application.java    # Main entry point
                    ├── controller/                 # REST API controllers
                    │   └── BookController.java
                    ├── service/                    # Business logic
                    │   └── BookService.java
                    ├── repository/                 # Data access interface
                    │   └── BookRepository.java
                    └── model/                      # Book entity definition
                        └── Book.java
