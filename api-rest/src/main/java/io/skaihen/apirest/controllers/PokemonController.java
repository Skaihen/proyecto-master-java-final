package io.skaihen.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.apirest.models.Pokemon;
import io.skaihen.apirest.services.PokemonService;

@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    /**
     * La función devuelve una lista de objetos Pokémon.
     *
     * @return El método devuelve una lista de objetos Pokémon.
     */
    @GetMapping(value = "/pokemons", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pokemon> pokemons() {
        return pokemonService.pokemons();
    }

    /**
     * Esta función de Java recupera un objeto Pokémon por su ID.
     *
     * @param id El parámetro "id" es un valor entero que representa el
     *           identificador único de un Pokémon.
     *           Se utiliza para buscar un Pokémon específico en el sistema.
     * @return El método devuelve un objeto Pokémon.
     */
    @GetMapping(value = "/pokemon/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Pokemon buscarPokemon(@PathVariable int id) {
        return pokemonService.buscarPokemon(id);
    }

    /**
     * Esta función de Java maneja una solicitud POST para crear un nuevo Pokémon
     * consumiendo datos JSON y
     * devuelve una lista de todos los Pokémon.
     *
     * @param pokemon El parámetro `pokemon` es de tipo `Pokemon` y está anotado con
     *                `@RequestBody`. Esto
     *                significa que el objeto `pokemon` se deserializará del cuerpo
     *                de la solicitud, que se espera que
     *                esté en formato JSON.
     * @return El método devuelve una lista de objetos Pokémon.
     */
    @PostMapping(value = "/pokemon", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Pokemon> nuevoPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.nuevoPokemon(pokemon);
        return pokemonService.pokemons();
    }

    /**
     * La función "actualizarPokemon" actualiza un objeto Pokémon en la base de
     * datos.
     *
     * @param pokemon El parámetro "pokemon" es del tipo "Pokemon". Está anotado con
     *                "@RequestBody", lo que
     *                significa que el valor del parámetro se obtendrá del cuerpo de
     *                la solicitud. El cuerpo de la
     *                solicitud debe contener una representación JSON de un objeto
     *                Pokémon.
     */
    @PutMapping(value = "/pokemon", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.actualizarPokemon(pokemon);
    }

    /**
     * Esta función de Java elimina un Pokémon con una ID específica y devuelve la
     * lista actualizada de los
     * Pokémon restantes.
     *
     * @param id El parámetro "id" es un valor entero que representa el
     *           identificador único de un Pokémon.
     *           Se utiliza para especificar qué Pokémon se deben eliminar de la
     *           lista de Pokémon.
     * @return El método devuelve una lista de objetos Pokémon.
     */
    @DeleteMapping(value = "/pokemon/{id}")
    public List<Pokemon> eliminarPokemon(@PathVariable int id) {
        pokemonService.eliminarPokemon(id);
        return pokemonService.pokemons();
    }

    /**
     * Esta función devuelve una lista de Pokémon con una velocidad mayor o igual a
     * una velocidad mínima
     * determinada.
     *
     * @param speedMin El parámetro speedMin es un valor entero que representa el
     *                 valor mínimo de velocidad
     *                 del Pokémon.
     * @return El método devuelve una lista de objetos Pokémon.
     */
    @GetMapping(value = "/speed/{speedMin}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pokemon> buscarPokemonSpeedMin(@PathVariable int speedMin) {
        return pokemonService.buscarPokemonSpeedMin(speedMin);
    }

    /**
     * Esta función de Java recupera una lista de objetos Pokémon con valores de HP
     * entre un valor mínimo y
     * máximo.
     *
     * @param hpMin El valor mínimo de HP que debe buscar el Pokémon.
     * @param hpMax El valor máximo de HP que debe buscar el Pokémon.
     * @return El método devuelve una lista de objetos Pokémon.
     */
    @GetMapping(value = "/hp/{hpMin}/{hpMax}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pokemon> buscarPokemonEntreHpMinMax(@PathVariable int hpMin,
            @PathVariable int hpMax) {
        return pokemonService.buscarPokemonEntreHpMinMax(hpMin, hpMax);
    }
}
