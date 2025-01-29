# 612.What is Spring framework?
* he Spring Framework is a comprehensive, lightweight, and modular Java framework used for building enterprise applications. It provides a wide range of features to simplify Java development, especially for web applications, microservices, and enterprise solutions.
```
Key Features of Spring Framework:
Inversion of Control (IoC) – Uses Dependency Injection (DI) to manage object creation and dependencies, making applications loosely coupled.
Aspect-Oriented Programming (AOP) – Helps separate cross-cutting concerns like logging, security, and transaction management.
Spring MVC – A powerful Model-View-Controller framework for building web applications.
Spring Boot – A project under the Spring ecosystem that simplifies Spring application development by providing auto-configuration and embedded servers.
Spring Data – Simplifies database access with JPA, Hibernate, JDBC, and NoSQL databases.
Spring Security – Provides authentication, authorization, and protection against threats like CSRF and XSS.
Spring Cloud – Supports the development of microservices architectures with features like service discovery, circuit breakers, and distributed tracing.
Spring Integration – Helps integrate enterprise applications with messaging systems.
Spring Batch – Manages batch processing and scheduled tasks efficiently.
Advantages of Spring Framework:
✔ Modular & Lightweight – Allows you to use only the needed components.
✔ Flexible & Scalable – Works with various architectures, including monoliths, microservices, and cloud-native apps.
✔ High Performance – Optimized for speed and efficiency with built-in caching and asynchronous processing.
✔ Easy Integration – Works well with third-party libraries like Hibernate, Kafka, RabbitMQ, and more.

Spring is widely used in modern enterprise Java applications due to its scalability, maintainability, and robustness.
```
# 614.What are the modules in Core Container of Spring framework?
```
Core	Provides IoC and DI using BeanFactory.
Beans	Manages Spring Beans and their lifecycle.
Context	Extends BeanFactory with ApplicationContext for enterprise features.
SpEL	Expression Language for dynamic property values and queries.
```
# 615.What are the modules in Data Access/Integration layer of Spring
framework?
```
JDBC	Simplifies raw JDBC operations using JdbcTemplate.
ORM	Integrates ORM frameworks like Hibernate and JPA.
Transaction	Manages declarative and programmatic transactions.
Messaging	Supports JMS, RabbitMQ, Kafka, and WebSockets.
Spring Data	Simplifies database access for relational and NoSQL databases.
```
