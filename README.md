## Description of the project 📖

This is a simple microservice developed using the Spring Boot framework. It provides a basic web interface for 
creating customer orders and processing those orders using a scheduled task. The main features of the project 
include:
* A form for submitting customer orders through a JSP page.
* A controller for handling form submissions and storing orders in a relational database.
* A scheduled task that periodically processes new orders and simulates sending them to another microservice.

## Technical components of the project: ⚙️🛠
* Programming Language : **_Java 17_**
* Framework: **_Spring Boot 3.3.2_**
* Database: **_MySQL 8.0.32_**
* Lombok: **_For automatic template code generation_**
* JSP: **_Java Server Pages used to create dynamic web pages_**
* MapStruct: **_To display models in DTO and mapper generation_**
* Liquibase: **_To manage database schema versions and migrations_**
* Docker: **_version 25.0.3_**
* Maven: **_A build automation tool used to manage project dependencies and the build lifecycle_**

## Database Structure 🧾
Table: orders

| Column    | Type    | Constraints |
|-----------|---------|-------------|
| id        | Long    | Primary Key, Auto-increment |
| lastname  | String  | Not Null |
| product   | 	String | Not Null |
| quantity  | Integer | Not Null |
| status | String | Not Null (default: "NEW") |

The Orders table is designed to store customer orders with the following columns:
* id: unique identifier for each order. This is the auto-incremented primary key.
* lastname: Last name of the customer who places the order.
* product: The name of the product the customer is ordering.
* quantity: the quantity of the product.
* status: Order status. It is initialized as "NEW" and is updated when the order is processed by 
the scheduled task.

This structure was chosen so that each order is uniquely identifiable and contains all the information necessary 
for processing. The status column helps track the status of the order, making it easier to manage the processing 
process.