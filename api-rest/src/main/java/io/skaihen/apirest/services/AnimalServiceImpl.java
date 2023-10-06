package io.skaihen.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.skaihen.apirest.models.Animal;
import io.skaihen.apirest.repositories.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalRepository animalRepository;

    /**
     * La función `animales()` devuelve una lista de todos los animales del
     * repositorio de animales.
     *
     * @return El método devuelve una lista de objetos animales.
     */
    @Override
    public List<Animal> animales() {
        return animalRepository.findAll();
    }

    /**
     * La función `buscarAnimal` busca un animal con una ID determinada en el
     * `animalRepository` y lo
     * devuelve, o devuelve nulo si no se encuentra ningún animal.
     *
     * @param id El parámetro id es un número entero que representa el identificador
     *           único del animal que
     *           se va a buscar.
     * @return El método `buscarAnimal` devuelve un objeto `Animal`.
     */
    @Override
    public Animal buscarAnimal(int id) {
        return animalRepository.findById(id).orElse(null);
    }

    /**
     * La función guarda un nuevo objeto animal en el repositorio de animales y
     * devuelve una lista de todos
     * los animales.
     *
     * @param animal El parámetro "animal" es un objeto de tipo Animal.
     * @return El método devuelve una lista de objetos animales.
     */
    @Override
    public List<Animal> nuevoAnimal(Animal animal) {
        animalRepository.save(animal);
        return animalRepository.findAll();
    }

    /**
     * La función `actualizarAnimal` actualiza un objeto animal en el repositorio de
     * animales.
     *
     * @param animal El parámetro "animal" es un objeto de tipo Animal que
     *               representa el animal a
     *               actualizar.
     */
    @Override
    public void actualizarAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    /**
     * La función `eliminarAnimal` elimina un animal con la identificación
     * proporcionada del repositorio de
     * animales y devuelve una lista de todos los animales restantes.
     *
     * @param id El parámetro "id" es un número entero que representa el
     *           identificador único del animal que
     *           debe eliminarse.
     * @return El método devuelve una lista de objetos animales.
     */
    @Override
    public List<Animal> eliminarAnimal(int id) {
        animalRepository.deleteById(id);
        return animalRepository.findAll();
    }

    /**
     * La función "buscarAnimalSpeedMin" devuelve una lista de animales con una
     * velocidad mínima mayor o
     * igual al valor especificado.
     *
     * @param speedMin El parámetro `speedMin` es un número entero que representa el
     *                 valor mínimo de
     *                 velocidad para los animales que desea buscar.
     * @return El método devuelve una lista de objetos animales.
     */
    @Override
    public List<Animal> buscarAnimalSpeedMin(int speedMin) {
        return animalRepository.findAllWithSpeedMin(speedMin);
    }

    /**
     * La función busca animales con puntos de vida (hp) entre un valor mínimo y
     * máximo.
     *
     * @param hpMin El valor mínimo de los puntos de vida del animal (hp).
     * @param hpMax El valor máximo de los puntos de vida del animal (hp).
     * @return El método devuelve una lista de objetos animales.
     */
    @Override
    public List<Animal> buscarAnimalEntreHpMinMax(int hpMin, int hpMax) {
        return animalRepository.findAllBetweenHpMinMax(hpMin, hpMax);
    }
}
