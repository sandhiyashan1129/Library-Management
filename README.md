# Student Management System

This is a Spring Boot application for managing student records. It provides REST APIs for creating, reading, updating, deleting, and searching student information.

## Features
- Create, view, update, and delete student records
- Search students by ID, name, department, or email
- Validation for mandatory fields
- Prevention of duplicate Student IDs and email addresses

## Requirements
- Java 21
- Maven

## Running the Application
1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run`.

## API Endpoints
- `POST /api/students`: Create a new student
- `GET /api/students/{id}`: Get a student by ID
- `GET /api/students`: Get all students
- `PUT /api/students/{id}`: Update a student
- `DELETE /api/students/{id}`: Delete a student

## Testing
Run `mvn test` to execute unit tests.