package io.skaihen.apirest.services;

import java.util.List;

import io.skaihen.apirest.models.Pokemon;

public interface PokemonService {
    /**
     * La función devuelve una lista de todos los objetos Pokémon del repositorio de
     * Pokémon.
     *
     * @return El método `pokemons()` devuelve una lista de objetos `Pokemon`.
     */
    List<Pokemon> pokemons();

    /**
     * La función `buscarPokemon` busca un Pokémon con una ID determinada en el
     * `pokemonRepository` y lo
     * devuelve, o devuelve nulo si no lo encuentra.
     *
     * @param id El parámetro id es un número entero que representa el identificador
     *           único del Pokémon que
     *           deseas buscar.
     * @return El método `buscarPokemon` devuelve un objeto `Pokemon`.
     */
    Pokemon buscarPokemon(int id);

    /**
     * La función guarda un nuevo objeto Pokémon en el repositorio y devuelve una
     * lista de todos los
     * objetos Pokémon.
     *
     * @param pokemon El parámetro "pokemon" es un objeto de tipo "Pokemon" que
     *                representa un nuevo Pokémon
     *                que se agregará a la base de datos.
     * @return El método `nuevoPokemon` devuelve una lista de objetos Pokémon.
     */
    List<Pokemon> nuevoPokemon(Pokemon pokemon);

    /**
     * La función `actualizarPokemon` actualiza un objeto Pokémon en el repositorio
     * de Pokémon.
     *
     * @param pokemon El parámetro "pokemon" es un objeto de tipo "Pokemon" que
     *                representa el Pokémon a
     *                actualizar.
     */
    void actualizarPokemon(Pokemon pokemon);

    /**
     * La función elimina un Pokémon con una ID determinada del repositorio y
     * devuelve la lista actualizada
     * de todos los Pokémon restantes.
     *
     * @param id El parámetro "id" es un número entero que representa el
     *           identificador único del Pokémon
     *           que debe eliminarse.
     * @return El método devuelve una lista de objetos Pokémon.
     */
    List<Pokemon> eliminarPokemon(int id);

    /**
     * La función busca todos los Pokémon con un valor de velocidad mínimo.
     *
     * @param speedMin El parámetro `speedMin` es un valor entero que representa la
     *                 velocidad mínima del
     *                 Pokémon que queremos buscar.
     * @return El método devuelve una lista de objetos Pokémon.
     */
    List<Pokemon> buscarPokemonSpeedMin(int speedMin);

    /**
     * La función busca Pokémon con valores de HP entre un valor mínimo y máximo.
     *
     * @param hpMin El valor mínimo de HP para el Pokémon que se va a buscar.
     * @param hpMax El valor máximo de HP del Pokémon que se va a buscar.
     * @return El método devuelve una lista de objetos Pokémon.
     */
    List<Pokemon> buscarPokemonEntreHpMinMax(int hpMin, int hpMax);
}
