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
    public void nuevoPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    @Override
    public void actualizarPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    @Override
    public void eliminarPokemon(int id) {
        pokemonRepository.deleteById(id);
    }

    @Override
    public List<Pokemon> buscarPokemonSpeedMin(int speedMin) {
        return pokemonRepository.findAllWithSpeedMin(speedMin);
    }

    @Override
    public List<Pokemon> buscarPokemonEntreHpMinMax(int hpMin, int hpMax) {
        return pokemonRepository.findAllBetweenHpMinMax(hpMin, hpMax);
    }
}
