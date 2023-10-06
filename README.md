# Proyecto final

## API-REST

Consiste en un pequeño **CRUD** de animales, los cuales poseen un id, nombre y estadísticas propias.

### API Endpoints

La aplicación expone los siguientes ***endpoints REST***:



### Estructura del proyecto

- **controllers** - Contiene el controlador REST
- **models** - Contiene el modelo de la clase "*Animal*"
- **services** - Contiene tanto la interfaz lógica como su implementación
- **repositories** - Contiene la interfaz del repositorio JPA

### Requisitos

- Java 8
- Maven

### Ejecutar la aplicación

Puedes iniciar la aplicación con el comando:

``` shell
mvn spring-boot:run
```

El servidor se iniciará en la dirección [`localhost:8080` (enlace)](http://localhost:8080).
