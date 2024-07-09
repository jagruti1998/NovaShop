# NovaShop 

# Online Shopping Portal

This is an online shopping portal developed using Spring Boot and microservices architecture. The first microservice implemented is the Product Service, which handles various operations related to products and stores data in MongoDB.

## Features

- Create a product
- Get a list of products
- Get a product by ID
- Get products by category
- Update a product
- Delete a product

## Technologies Used

- Java
- Spring Boot
- Microservices
- MongoDB
- Gradle

## Endpoints

### Create a Product




### Technologies/Tools used: </br>
Java 17 </br>
Spring Boot framework </br>
Hibernate </br>
PostgresSQL database </br>
Postman


## Features
Create and manage quizzes </br>
CRUD operations on questions and quizzes </br>
Fetch questions by category </br>
Submit quiz answers </br>


## Installation & Run
 - Before running the API server, we should update the database config inside the application.properties file.
 - Update the port number, username, and password as per our local database config.  
    - spring.application.name=IntelliQuiz
    - spring.datasource.driver-class-name=org.postgresql.Driver
    - spring.datasource.url=jdbc:postgresql://localhost:5432/questiondb
    - spring.datasource.username=postgres
    - spring.datasource.password=root
    - spring.jpa.hibernate.ddl-auto=update
    - spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

  
## API Endpoints

Question Management

- Retrieve All Questions

Endpoint: GET /question/allQuestions </br>
Description: Fetches all the questions available in the database.

- Retrieve Questions by Category

Endpoint: GET /question/category/{category} </br>
Description: Fetches questions based on a specific category.

- Add a Question

Endpoint: POST /question/add </br>
Description: Allows adding a new question to the database.

- Delete a Question

Endpoint: DELETE /question/{id} </br>
Description: Deletes a question based on its ID.

Quiz Management

- Create a Quiz

Endpoint: POST /quiz/create </br>
Description: Creates a new quiz based on the specified category, number of questions, and title.

- Retrieve Quiz Questions

Endpoint: GET /quiz/get/{id} </br>
Description: Fetches the questions for a specific quiz based on its ID.

- Submit a Quiz

Endpoint: POST /quiz/submit/{id}
Description: Submits answers for a quiz and calculates the result.
Request Body: List of SubmitResponse objects
Response: Quiz score
