Readme
🍽️ Food Menu Management System

A full-stack web application built as a junior-level technical assessment. The system allows users to register, login, and manage food menu items securely.

📌 Tech Stack
Backend

Java 17+

Spring Boot

Spring Security (JWT Authentication)

JPA / Hibernate

Microsoft SQL Server

RESTful API

Frontend

Angular

TypeScript

HTML / CSS

Bootstrap

Tools

Git & GitHub

Postman (API testing)

✨ Features
Authentication

User Registration

User Login

JWT-based authentication

Protected routes (menu page requires login)

Food Menu Management

Create food menu

View all menu items

Update menu items

Delete menu items

Validation

Login & Registration form validation

Menu form validation

Name: required

Description: required

Price: must be greater than 0

🗂️ Project Structure
Backend (Spring Boot)
└── src/main/java/com/example/foodmenu
    ├── controller
    ├── entity
    ├── repository
    ├── security
    └── service


Frontend (Angular)
└── src/app
    ├── pages
    │   ├── login
    │   └── menu
    ├── services
    ├── guards
    └── app.routes.ts
🚀 How to Run the Project
Backend (Spring Boot)

Open the backend project in IntelliJ IDEA / VS Code

Configure database connection in application.properties

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=foodmenu
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD

Run the Spring Boot application

Backend will start at:

http://localhost:8080
Frontend (Angular)

Navigate to Angular project folder

Install dependencies:

npm install

Start Angular development server:

ng serve

Open browser and access:

http://localhost:4200
🔐 Authentication Flow

User registers an account

User logs in with credentials

Backend returns JWT token

Token stored in localStorage

Token attached to API requests

Protected routes require valid token

🧪 API Testing

API endpoints tested using Postman

Authorization header:

Authorization: Bearer <JWT_TOKEN>
📝 Git Commit Practice

Meaningful commit messages

Clear separation of backend and frontend commits

🎯 Assessment Notes

This project was built to demonstrate:

Understanding of full-stack development

REST API design

Authentication & authorization

Angular frontend integration

Clean and maintainable code

👤 Author

Amin Hakim
