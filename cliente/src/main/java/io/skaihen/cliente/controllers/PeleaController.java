package io.skaihen.cliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.cliente.models.AnimalAux;
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

    @GetMapping(value = "/pelea/{idPelea}", produces = "application/json")
    public Pelea buscarPelea(@PathVariable int idPelea) {
        return peleaService.buscarPelea(idPelea);
    }

    @PostMapping(value = "/pelea/{idAliado}/{idEnemigo}", produces = "application/json")
    public Pelea nuevaPelea(@PathVariable int idAliado, @PathVariable int idEnemigo) {
        return peleaService.nuevaPelea(idAliado, idEnemigo);
    }

    @PutMapping(value = "/pelea", consumes = "application/json")
    public void actualizarPelea(@RequestBody Pelea pelea) {
        peleaService.actualizarPelea(pelea);
    }

    @DeleteMapping(value = "/pelea/{idPelea}", produces = "application/json")
    public List<Pelea> borrarPelea(@PathVariable int idPelea) {
        return peleaService.borrarPelea(idPelea);
    }

    @GetMapping(value = "/ganador/{idPelea}", produces = "application/json")
    public AnimalAux buscarAnimalGanador(@PathVariable int idPelea) {
        return peleaService.buscarAnimalGanador(idPelea);
    }

}
