# API REST de Catálogo de Libros

Hola, mi nombre es Alexis Sinue González Medina.

## Descripción del proyecto

Desarrollo de una API RESTful con Spring Boot para administrar un catálogo de libros. La API permite registrar, consultar, actualizar y eliminar libros con información sobre autor, género literario, ISBN, año de publicación y disponibilidad. Incluye endpoints de búsqueda por autor y por género, implementados mediante query methods de Spring Data JPA. El proyecto utiliza una base de datos H2 en memoria para el entorno de desarrollo y documentación interactiva generada con SpringDoc OpenAPI (Swagger UI). El objetivo es demostrar el uso de consultas derivadas en repositorios JPA y la construcción de una API REST bien estructurada.

## Tecnologias
* **Java JDK 26**
* **Spring Boot 3.5.14**
* **Spring Data JPA**
* **H2 Database**
* **POSTMAN**

## Ejecución Local
1. Abre el proyecto en **IntelliJ IDEA**.
2. Asegúrate de tener instalado **Java 17**.
3. Ejecuta la clase `CatalogoLibrosApplication` (botón Play).

## Base de Datos (H2)
* Acceso: `http://localhost:8080/h2-console`
* JDBC URL: `jdbc:h2:mem:catalogo-libros`
* Usuario: `sa` (sin contraseña).
