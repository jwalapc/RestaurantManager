
# About

The assignment involves the creation of a Java-based web application using Spring Boot and Gradle, hosted on GitHub, to manage a restaurant system. The project includes APIs for creating and fetching restaurant details, selecting a restaurant, creating and fetching menu items, and managing a user's shopping cart. Utilizing MySQL for data storage, the application supports functionalities such as adding and removing items from the cart, creating orders, and retrieving order details. The development adheres to proper code structure and Object-Oriented Programming (OOP) concepts, ensuring modularity and maintainability. Spring Boot streamlines the setup and development processes, while the GitHub repository facilitates collaborative work and version control. Overall, the project encompasses a comprehensive restaurant management system with a well-organized codebase and efficient use of frameworks and tools.







## Getting Started


To run the project locally, follow these steps:

```bash
    git clone [Repository]

    cd [Repository-Directory]

    ./gradlew build    

    ./gradlew bootRun
```

## Assignmnet

- create a GitHub project using gradle+java+springboot.
- Api to create restaurant.

- Api to fetch restaurant.
- Select a restaurant
- Create item api
- Fetch item api
- Add item to the cart
- Remove item from the cart
- Create order
- Get order details
- Use MySQL to store data



## Tech Stack

**Client:** Java , springboot, Gradle

**Server:** Spring boot

**Database:** Mysql

## Database Name: restaurantmanager 
port:3306

CREATE TABLE restaurant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);


CREATE TABLE item (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE `order` (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(255) NOT NULL,
    total_amount DOUBLE NOT NULL
);

CREATE TABLE `order_item` (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    order_id BIGINT,
    item_id BIGINT,
    quantity INT NOT NULL,
    FOREIGN KEY (order_id) REFERENCES `order`(id),
    FOREIGN KEY (item_id) REFERENCES `item`(id)
);

CREATE TABLE cart (
    id BIGINT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE cart_item (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    cart_id BIGINT,
    item_id BIGINT,
    quantity INT NOT NULL,
    FOREIGN KEY (cart_id) REFERENCES cart(id),
    FOREIGN KEY (item_id) REFERENCES item(id)
);

## Postman Api Testing:

http://localhost:8080/api/restaurants

http://localhost:8080/api/carts

http://localhost:8080/api/orders

eg:
orders


{
    "customerName": "John Doe",
    "totalAmount": 50.0
}


restaurants

{
    "name": "My Restaurant"
}

carts

{
    "userId": 1
}




