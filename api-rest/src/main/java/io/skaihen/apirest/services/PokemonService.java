package io.skaihen.apirest.services;

import java.util.List;

import io.skaihen.apirest.models.Pokemon;

public interface PokemonService {
    List<Pokemon> pokemons();

    Pokemon buscarPokemon(int id);

    List<Pokemon> subirPokemon(Pokemon pokemon);

    void actualizarPokemon(Pokemon pokemon);

    List<Pokemon> eliminarPokemon(int id);

    List<Pokemon> buscarPokemonHpMin(int hpMin);
}
