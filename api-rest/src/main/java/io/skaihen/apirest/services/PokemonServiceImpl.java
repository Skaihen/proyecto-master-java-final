package io.skaihen.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.skaihen.apirest.models.Pokemon;
import io.skaihen.apirest.repositories.PokemonRepository;

@Service
public class PokemonServiceImpl implements PokemonService {
    @Autowired
    PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> pokemons() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon buscarPokemon(int id) {
        return pokemonRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pokemon> subirPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
        return pokemonRepository.findAll();
    }

    @Override
    public void actualizarPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    @Override
    public List<Pokemon> eliminarPokemon(int id) {
        pokemonRepository.deleteById(id);
        return pokemonRepository.findAll();
    }

    @Override
    public List<Pokemon> buscarPokemonHpMin(int hpMin) {
        return pokemonRepository.findAllWithHpMin(hpMin);
    }
}
