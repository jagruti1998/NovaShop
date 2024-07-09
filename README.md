# NovaShop

## Online Shopping Portal

This is an online shopping portal developed using Spring Boot and microservices architecture. The first microservice implemented is the Product Service, which handles various operations related to products and stores data in MongoDB.

## Product MicroService Features

- Create a product
- Get a list of products
- Get a product by ID
- Get products by category
- Update a product
- Delete a product

### Technologies/Tools used:

- Java 19
- Spring Boot
- Microservices
- MongoDB
- Gradle
- Postman

## API Endpoints

### Product Management

#### 1. Add a Product

- **Endpoint:** POST `/v1/addProduct`
- **Description:** Adds a new product to the database.
- **Request Body:**
  ```json
  {
      "name": "Product Name",
      "category": "Product Category",
      "price": 100.0,
      "description": "Product Description"
  }
