package io.skaihen.apirest.pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> pokemons();

    Pokemon buscarPokemon(int id);

    List<Pokemon> subirPokemon(Pokemon pokemon);

    List<Pokemon> actualizarPokemon(Pokemon pokemon);

    List<Pokemon> eliminarPokemon(int id);

    List<Pokemon> buscarPokemonHpMin(int hpMin);
}
