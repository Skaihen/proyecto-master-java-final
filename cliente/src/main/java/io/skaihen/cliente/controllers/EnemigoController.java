package io.skaihen.cliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.skaihen.cliente.models.Enemigo;
import io.skaihen.cliente.services.EnemigoService;

@RestController
public class EnemigoController {

    @Autowired
    EnemigoService enemigoService;

    @GetMapping(value = "/enemigos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Enemigo> enemigos() {
        return enemigoService.enemigos();
    }

    @GetMapping(value = "/enemigo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Enemigo buscarEnemigo(@PathVariable("id") int id) {
        return enemigoService.buscarEnemigo(id);
    }

    @PostMapping(value = "/enemigo", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nuevoEnemigo(Enemigo enemigo) {
        enemigoService.nuevoEnemigo(enemigo);
    }

    @PutMapping(value = "/enemigo", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarEnemigo(Enemigo enemigo) {
        enemigoService.actualizarEnemigo(enemigo);
    }

    @DeleteMapping(value = "/enemigo/{id}")
    public void eliminarEnemigo(@PathVariable("id") int id) {
        enemigoService.eliminarEnemigo(id);
    }

    @GetMapping(value = "/speed/{speedMin}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Enemigo> buscarEnemigoSpeedMin(@PathVariable("speedMin") int speedMin) {
        return enemigoService.buscarEnemigoSpeedMin(speedMin);
    }

    @GetMapping(value = "/hp/{hpMin}/{hpMax}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Enemigo> buscarEnemigoHpEntreMinMax(@PathVariable("hpMin") int hpMin,
            @PathVariable("hpMax") int hpMax) {
        return enemigoService.buscarEnemigoEntreHpMinMax(hpMin, hpMax);
    }
}
