package io.skaihen.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.apirest.models.Animal;
import io.skaihen.apirest.services.AnimalService;

@RestController
public class AnimalController {

    @Autowired
    AnimalService animalService;

    /**
     * La función "animales" devuelve una lista de objetos Animales en formato JSON.
     *
     * @return El método devuelve una lista de objetos animales.
     */
    @GetMapping(value = "/animales", produces = "application/json")
    public List<Animal> animales() {
        return animalService.animales();
    }

    /**
     * Esta función de Java recupera un objeto animal por su ID.
     *
     * @param id El parámetro "id" es un valor entero que representa el
     *           identificador único del animal que
     *           se busca.
     * @return El método devuelve un objeto de tipo Animal.
     */
    @GetMapping(value = "/animal/{id}", produces = "application/json")
    public Animal buscarAnimal(@PathVariable int id) {
        return animalService.buscarAnimal(id);
    }

    /**
     * Esta función de Java maneja una solicitud POST para crear un nuevo objeto
     * animal y devuelve una
     * lista de todos los animales.
     *
     * @param animal El parámetro "animal" es de tipo Animal y está anotado
     *               con @RequestBody. Esto
     *               significa que se completará con los datos JSON del cuerpo de la
     *               solicitud.
     * @return El método devuelve una lista de objetos animales.
     */
    @PostMapping(value = "/animal", consumes = "application/json")
    public List<Animal> nuevoAnimal(@RequestBody Animal animal) {
        animalService.nuevoAnimal(animal);
        return animalService.animales();
    }

    /**
     * La función "actualizarAnimal" actualiza un objeto animal en el servicio de
     * animales.
     *
     * @param animal El parámetro `animal` es de tipo `Animal` y está anotado con
     *               `@RequestBody`. Esto
     *               significa que el objeto "animal" se deserializará del cuerpo de
     *               la solicitud, que se espera que esté
     *               en formato JSON.
     */
    @PutMapping(value = "/animal", consumes = "application/json")
    public void actualizarAnimal(@RequestBody Animal animal) {
        animalService.actualizarAnimal(animal);
    }

    /**
     * Esta función de Java elimina un animal con la ID especificada y devuelve la
     * lista actualizada de
     * animales.
     *
     * @param id El parámetro "id" es un valor entero que representa el
     *           identificador único del animal que
     *           debe eliminarse.
     * @return El método devuelve una lista de objetos animales.
     */
    @DeleteMapping(value = "/animal/{id}", produces = "application/json")
    public List<Animal> eliminarAnimal(@PathVariable int id) {
        animalService.eliminarAnimal(id);
        return animalService.animales();
    }

    /**
     * Esta función devuelve una lista de animales con una velocidad mínima
     * especificada por el usuario.
     *
     * @param speedMin El parámetro `speedMin` es un valor entero que representa la
     *                 velocidad mínima de un
     *                 animal.
     * @return El método devuelve una lista de objetos animales.
     */
    @GetMapping(value = "/speed/{speedMin}", produces = "application/json")
    public List<Animal> buscarAnimalSpeedMin(@PathVariable int speedMin) {
        return animalService.buscarAnimalSpeedMin(speedMin);
    }

    /**
     * Esta función de Java recupera una lista de animales con puntos de vida (hp)
     * dentro de un rango
     * específico.
     *
     * @param hpMin El valor mínimo para los "hp" (puntos de vida) de un animal.
     * @param hpMax El valor máximo para los "hp" (puntos de vida) de un animal.
     * @return El método devuelve una lista de objetos animales.
     */
    @GetMapping(value = "/hp/{hpMin}/{hpMax}", produces = "application/json")
    public List<Animal> buscarAnimalEntreHpMinMax(@PathVariable int hpMin,
            @PathVariable int hpMax) {
        return animalService.buscarAnimalEntreHpMinMax(hpMin, hpMax);
    }
}
