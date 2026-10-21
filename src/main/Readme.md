# Student Management System

## Overview

The Student Management System is a Java-based database application developed as part of my SWYNEX Java Developer Internship.

The application uses Java, JDBC, and MySQL to manage student records through a simple console-based interface. It demonstrates CRUD operations, database connectivity, object-oriented programming, and input validation.

## Technologies Used

* Java
* MySQL
* JDBC (Java Database Connectivity)
* MySQL Connector/J
* Maven
* IntelliJ IDEA

## Features

* Add new student records
* View all student records
* Update student marks using student ID
* Delete student records using student ID
* Automatically generate student IDs
* Validate user input
* Handle database errors
* Store student records permanently in MySQL

## Database Setup

1. Install MySQL Server and MySQL Workbench.
2. Open MySQL Workbench and connect to your local MySQL server.
3. Execute the following SQL statements:

```sql
CREATE DATABASE student_management;

USE student_management;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL,
    marks INT NOT NULL
);
```

If the database or table already exists, do not create it again unnecessarily.

## Configuration

1. Open the project in IntelliJ IDEA.

2. Configure your MySQL username and password in `DBConnection.java`.

3. Make sure the database URL points to your local MySQL server:

   `jdbc:mysql://localhost:3306/student_management`

4. Ensure the MySQL JDBC dependency is configured in `pom.xml`.

5. Allow Maven to download the required dependency.

Do not upload real database passwords or other credentials to GitHub.

## How to Run

1. Start your MySQL Server.
2. Open the project in IntelliJ IDEA.
3. Ensure the database and `students` table exist.
4. Configure your local MySQL credentials.
5. Wait for Maven to resolve the project dependencies.
6. Run `Main.java`.
7. Select an operation from the console menu.

## Project Structure

```text
StudentManagementSystem/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            ├── Main.java
            ├── DBConnection.java
            ├── Student.java
            └── StudentDAO.java
```

## Learning Outcomes

This project helped me practise:

* Java classes and objects
* Encapsulation
* JDBC database connectivity
* SQL CRUD operations
* PreparedStatement and ResultSet
* Exception handling
* Input validation
* Maven dependency management

## Internship

Developed as part of the SWYNEX Java Developer Internship.

## Author

Amaan Abbas
