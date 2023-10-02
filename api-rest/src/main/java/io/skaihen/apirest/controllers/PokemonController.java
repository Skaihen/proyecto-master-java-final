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

    @GetMapping(value = "/pokemons", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pokemon> pokemons() {
        return pokemonService.pokemons();
    }

    @GetMapping(value = "/pokemon/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Pokemon buscarPokemon(@PathVariable("id") int id) {
        return pokemonService.buscarPokemon(id);
    }

    @PostMapping(value = "/pokemon", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nuevoPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.nuevoPokemon(pokemon);
    }

    @PutMapping(value = "/pokemon", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.actualizarPokemon(pokemon);
    }

    @DeleteMapping(value = "/pokemon/{id}")
    public void eliminarPokemon(@PathVariable("id") int id) {
        pokemonService.eliminarPokemon(id);
    }

    @GetMapping(value = "/speed/{speedMin}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pokemon> buscarPokemonSpeedMin(@PathVariable("speedMin") int speedMin) {
        return pokemonService.buscarPokemonSpeedMin(speedMin);
    }

    @GetMapping(value = "/hp/{hpMin}/{hpMax}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pokemon> buscarPokemonEntreHpMinMax(@PathVariable("hpMin") int hpMin,
            @PathVariable("hpMax") int hpMax) {
        return pokemonService.buscarPokemonEntreHpMinMax(hpMin, hpMax);
    }
}
