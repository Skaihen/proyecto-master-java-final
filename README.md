# Ejercicio Cursos

Este projecto es un **CRUD** simple, el cual representa una serie de **cursos** con sus características, usando **Spring Boot y Spring MVC**.

## Requisitos

- Java 8
- Maven

## Ejecutar la aplicación

Puedes iniciar la aplicación con el comando:

``` shell
mvn spring-boot:run
```

El servidor se iniciará en la dirección `localhost:8080`.

## API Endpoints

La aplicación expone los siguientes ***endpoints REST***:

### Get All Courses

***GET*** `/cursos`

- Devuelve una lista de todos los cursos.

### Get Single Course

***GET*** `/cursos/{id}`

- Toma de entrada un id de curso en la ruta de la petición.
- Devuelve un solo curso dado su id.

### Create New Course

***POST*** `/cursos/alta`

- Crea un nuevo curso dado un JSON en el body de la petición.
- Devuelve una lista de todos los cursos.

### Update Course Duration

***PUT*** `/cursos/actualizar/{id}/{duration}`

- Toma de entrada un id de curso y la nueva duración en la ruta de la petición.
- Actualiza la duración de un curso existente.

### Delete Course

***DELETE*** `/cursos/eliminar/{id}`

- Toma de entrada un id de curso en la ruta de la petición.
- Elimina un curso dado su id.
- Devuelve una lista de todos los cursos.

### Get Courses In Range

***GET*** `/cursos/precio/{precioMin}/{precioMax}`

- Toma de entrada un intervalo de precio en la ruta de la petición.
- Devuelve una lista de todos los cursos dentro del intervalo de precio.

## Estructura del proyecto

- **controller** - Contiene el controlador REST
- **model** - Contiene el modelo de la clase "*Curso*"
- **service** - Contiene tanto la interfaz lógica como su implementación
- **repository** - Contiene la interfaz del repositorio JPA