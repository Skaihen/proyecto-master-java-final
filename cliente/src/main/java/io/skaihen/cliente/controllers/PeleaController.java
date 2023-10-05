package io.skaihen.cliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.cliente.models.Pelea;
import io.skaihen.cliente.services.PeleaService;

@RestController
public class PeleaController {

    @Autowired
    PeleaService peleaService;

    @GetMapping(value = "/peleas", produces = "application/json")
    public List<Pelea> peleas() {
        return peleaService.peleas();
    }

    @PostMapping(value = "/pelea/{idAliado}/{idEnemigo}", consumes = "application/json")
    public Pelea nuevaPelea(@PathVariable int idAliado, @PathVariable int idEnemigo) {
        return peleaService.nuevaPelea(idAliado, idEnemigo);
    }

}
