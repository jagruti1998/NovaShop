# NovaShop

## Online Shopping Portal

NovaShop is an online shopping portal developed using Spring Boot and microservices architecture. The first microservice implemented is the Product Service, which handles various operations related to products and stores data in MongoDB.

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
    "name": "jiggy",
    "category": {
        "id": 1,
        "name": "book",
        "brand": "isha foundation"
    },
    "price": 500,
    "currency": "INR",
    "discount": 10.0,
    "discountDescription": "year end sale offer"
}

#### 2. Retrieve All Products

- **Endpoint:** GET `/v1/ProductList`
- **Description:** Fetches all the products available in the database.

#### 3. Retrieve Products By Category

- **Endpoint:** GET `/v1/ProductList/{category}`
- **Description:** Fetches products based on a specific category.
- **Path Variable:** category - The category of the products to fetch.

#### 4. Get Product By Id

- **Endpoint:** GET `/v1/Product{id}`
- **Description:** Fetches products based on a specific category.
- **Path Variable:** id - The ID of the product to retrieve.

#### 5. Update a Product

- **Endpoint:** PUT `/v1/ProductUpdate`
- **Description:** Updates an existing product in the database.
- **Request Body:**
  ```json
  {
  "id": 1,
  "name": "jiggy",
  "category": {
      "id": 1,
      "name": "book",
      "brand": "isha foundation"
  },
  "price": 500,
  "currency": "INR",
  "discount": 10.0,
  "discountDescription": "year end sale offer"
}

## License

These projects are licensed under the [MIT License](LICENSE).
#### 6. Delete a Product

- **Endpoint:** DELETE `/v1/Product/{id}`
- **Description:** Deletes a product from the database.
- **Path Variable:** id - The ID of the product to delete.

