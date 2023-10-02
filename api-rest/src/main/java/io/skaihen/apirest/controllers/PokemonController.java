package io.skaihen.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.skaihen.apirest.models.Pokemon;
import io.skaihen.apirest.services.PokemonService;

@Controller
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemons")
    public List<Pokemon> pokemons() {
        return pokemonService.pokemons();
    }
}
