# Library Management System

This project is a simple Library Management System built using Spring Boot and PostgreSQL. The system manages books and patrons, allowing patrons to borrow and return books. The project consists of three main entities: `Book`, `Patron`, and `PatronBorrowBook`.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Entities](#entities)
  - [Book](#book)
  - [Patron](#patron)
  - [PatronBorrowBook](#patronborrowbook)
- [API Endpoints](#api-endpoints)
  - [Book API](#book-api)
  - [Patron API](#patron-api)
  - [PatronBorrowBook API](#patronborrowbook-api)
- [Running the Application](#running-the-application)
- [Conclusion](#conclusion)

## Features

- Manage library books (add, update, delete, retrieve)
- Manage library patrons (add, update, delete, retrieve)
- Borrow and return books by patrons
- Integration with PostgreSQL for persistent data storage

## Technologies Used

- **Spring Boot**: For building the RESTful APIs.
- **PostgreSQL**: As the relational database management system.
- **Jakarta Persistence (JPA)**: For object-relational mapping (ORM).
- **Maven**: For dependency management and project building.

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.6+
- PostgreSQL 13 or later
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:

   ```bash
   https://github.com/Elsokkary101/LMS.git
   cd LMS
   ```

2. Configure PostgreSQL:

   - Create a new database in PostgreSQL.
   - Update the `application.properties` file with your PostgreSQL credentials:

     ```properties
        spring.application.name=LMS
        spring.datasource.url=jdbc:postgresql://localhost:5432/LMSDatabase
        spring.datasource.username = postgres
        spring.datasource.password = 1234
        spring.jpa.show-sql = true
        spring.mvc.throw-exception-if-no-handler-found=true
        spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
     ```

3. Build and run the application:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

   The application will start running on `http://localhost:8080`.

## Entities

### Book

The `Book` entity represents a book in the library. It has the following attributes:

- `id`: Unique identifier for the book.
- `title`: The title of the book.
- `author`: The author of the book.
- `isbn`: The International Standard Book Number.
- `language`: The language in which the book is written.
- `publication_year`: The year the book was published.
- `shelf_location`: The location of the book within the library.

### Patron

The `Patron` entity represents a library user. It has the following attributes:

- `id`: Unique identifier for the patron.
- `name`: The name of the patron.
- `email`: The email address of the patron.
- `phone_number`: The contact number of the patron.
- `birth_date`: The date of birth of the patron.
- `out_standing_fines`: The fines pending payment by the patron.

### PatronBorrowBook

The `PatronBorrowBook` entity represents the borrowing of a book by a patron. It has the following attributes:

- `id`: Unique identifier for the borrowing record.
- `book_id`: The ID of the borrowed book.
- `patron_id`: The ID of the patron who borrowed the book.
- `due_date`: The date by which the book must be returned.
- `status`: The current status of the borrowing (e.g., borrowed or returned).

## API Endpoints

### Book API

- **GET /api/books**: Retrieve a list of all books.
- **GET /api/books/{id}**: Retrieve details of a specific book by ID.
- **POST /api/books**: Add a new book to the library.
- **PUT /api/books/{id}**: Update an existing book's details.
- **DELETE /api/books/{id}**: Remove a book from the library.

### Patron API

- **GET /api/patrons**: Retrieve a list of all patrons.
- **GET /api/patrons/{id}**: Retrieve details of a specific patron by ID.
- **POST /api/patrons**: Add a new patron to the library.
- **PUT /api/patrons/{id}**: Update an existing patron's details.
- **DELETE /api/patrons/{id}**: Remove a patron from the library.

### PatronBorrowBook API

- **POST /api/borrow/{bookId}/patron/{patronId}**: Record the borrowing of a book by a patron.
- **PUT /api/return/{bookId}/patron/{patronId}**: Record the return of a borrowed book by a patron.

## Running the Application

To run the application locally, ensure that your PostgreSQL server is running, and you have configured the `application.properties` file correctly. Then, execute the following command:

```bash
mvn spring-boot:run
```

The application will be accessible at `http://localhost:8080`.
