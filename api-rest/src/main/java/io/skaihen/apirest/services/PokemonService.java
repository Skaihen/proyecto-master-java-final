package io.skaihen.apirest.services;

import java.util.List;

import io.skaihen.apirest.models.Pokemon;

public interface PokemonService {
    List<Pokemon> pokemons();

    Pokemon buscarPokemon(int id);

    void nuevoPokemon(Pokemon pokemon);

    void actualizarPokemon(Pokemon pokemon);

    void eliminarPokemon(int id);

    List<Pokemon> buscarPokemonSpeedMin(int speedMin);

    List<Pokemon> buscarPokemonEntreHpMinMax(int hpMin, int hpMax);
}
