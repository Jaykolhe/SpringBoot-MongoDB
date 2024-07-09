# SpringBoot-MongoDB 
This project explains CRUD (Create, Read, Update, Delete) operations using MongoTemplate and MongoRepository using spring boot and mongo DB. 
In this app we are using Spring Data JPA for built-in methods to do CRUD operations and Mongo queries using MongoTemplate.
@EnableMongoRepositories annotation is used on main class to Enable Mongo related configuration, which will read properties from application.properties file.

# Prerequisites
* Java
* Spring Boot
* Maven
* Mongo DB

# Tools
* Eclipse or IntelliJ IDEA (or any preferred IDE)
* Maven
* Postman (or any RESTful API testing tool)

# Build and Run application
GOTO > **~/absolute-path-to-directory/spring-boot-mongodb**
and try below command in terminal
**mvn spring-boot:** run it will run application as spring boot application

or

mvn clean install it will build application and create jar file under target directory

Run jar file from below path with given command

**java -jar ~/path-to-spring-boot-mongodb/target/spring-boot-mongodb-0.0.1-SNAPSHOT.jar**

Or

run main method from **SpringBootMongoDBApplication.java** as spring boot application.
