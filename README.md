# Proyecto final

## API-REST

Consiste en un pequeño **CRUD** de animales, los cuales poseen un id, nombre y estadísticas propias.

### Requisitos

- Java 8
- Maven

### Ejecutar la aplicación

Puedes iniciar la aplicación con el comando:

``` shell
mvn spring-boot:run
```

El servidor se iniciará en la dirección [`localhost:8080` (enlace)](http://localhost:8080).

### API Endpoints

La aplicación expone los siguientes ***endpoints REST***:

- **GET /animales**: Devuelve una lista los animales encontrados en la base de datos.
- **GET /animal/{id}**: Devuelve los datos de un animal dado su id.
- **POST /animal**: Crea un nuevo animal a partir de un objeto en el cuerpo de la petición.
- **PUT /animal/{id}**: Actualiza los datos de un animal, dado su id, a partir de un objeto en el cuerpo de la petición.
- **DELETE /animal/{id}**: Elimina un animal de la base de datos dado su id.
- **GET /speed/{speedMin}**: Devuelve los animales cuya velocidad sea mayor o igual a la velocidad indicada en el parámetro.
- **GET /hp/{hpMin}/{hpMax}**: Devuelve los animales cuya salud se encuentre entre los valores indicados en los parámetros.

### Estructura del proyecto

- **controllers** - Contiene el controlador REST.
- **models** - Contiene el modelo de la clase "***Animal***".
- **services** - Contiene tanto la interfaz lógica como su implementación.
- **repositories** - Contiene la interfaz del repositorio JPA.

## Cliente

Consiste en un **CRUD** de peleas, el cual se alimenta del microservicio de animales, y que consta de una base de datos donde se guardan los ids de los animales y el resultado de la pelea.

### Requisitos

- Java 8
- Maven

### Ejecutar la aplicación

Puedes iniciar la aplicación con el comando:

``` shell
mvn spring-boot:run
```

El servidor se iniciará en la dirección [`localhost:8081` (enlace)](http://localhost:8081).

### API Endpoints

La aplicación expone los siguientes ***endpoints REST***:

- **GET /peleas**: Devuelve una lista de las peleas encontradas en la base de datos.
- **GET /pelea/{idPelea}**: Devuelve los datos de una pelea dado su id.
- **POST /pelea/{idAliado}/{idEnemigo}**: Toma de entrada el id de dos animales, uno aliado y otro enemigo, calcula la fuerza total de cada uno y crea una nueva pelea, guardando los ids de los animales junto con el resultado de la pelea.
- **PUT /pelea/{idPelea}**: Actualiza los datos de una pelea, dado su id, a partir de un objeto en el cuerpo de la petición.
- **DELETE /pelea/{idPelea}**: Elimina una pelea de la base de datos dado su id.
- **GET /ganador/{idPelea}**: Devuelve el animal ganador de una pelea dado el id de la pelea.

### Estructura del proyecto

- **controllers** - Contiene el controlador REST.
- **models** - Contiene el modelo de la clase "***Pelea***" y la clase auxiliar "***AnimalAux***".
- **services** - Contiene tanto la interfaz lógica como su implementación.
- **repositories** - Contiene la interfaz del repositorio JPA.
