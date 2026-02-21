📚 Library Management System

A Spring Boot–based Library Management System that exposes secure REST APIs to manage books, users, and transactions efficiently. The application is fully containerized using Docker and automated through a Jenkins CI/CD pipeline.

🚀 Features

📖 Book Management (Add, Update, Delete, View) 👤 User Management 🔐 JWT-based Authentication & Authorization 🔑 Role-based access control (Admin / User) 🗃️ MySQL Database Integration 🐳 Dockerized Application & Database ⚙️ CI/CD Pipeline using Jenkins (auto deploy on deploy branch) 🧱 Layered Architecture (Controller → Service → Repository) 🌐 RESTful APIs

🔐 Security

Spring Security integration 
JWT token generation & validation 
Stateless authentication 
Protected endpoints based on roles 
Password encryption using BCrypt

🛠️ Tech Stack

🔹 Backend

Java Spring Boot Spring Data JPA Hibernate Spring Security JWT

🔹 Database

MySQL

🔹 DevOps & Tools

Docker Docker Compose Jenkins (CI/CD) Maven Git & GitHub

⚙️ CI/CD Flow

1️⃣ Code push on deploy branch 
2️⃣ Jenkins triggers pipeline 
3️⃣ Docker image build 
4️⃣ Containers recreated using Docker Compose 
5️⃣ Application deployed automatically 🚀
