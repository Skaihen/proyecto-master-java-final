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

    /**
     * La función "peleas" devuelve una lista de objetos "Pelea" en formato JSON.
     *
     * @return Se devuelve una lista de objetos Pelea.
     */
    @GetMapping(value = "/peleas", produces = "application/json")
    public List<Pelea> peleas() {
        return peleaService.peleas();
    }

    /**
     * La función "buscarPelea" en el código Java recupera un objeto "Pelea" por su
     * ID.
     *
     * @param idPelea El id de la pelea que deseas buscar.
     * @return El método devuelve un objeto de tipo "Pelea".
     */
    @GetMapping(value = "/pelea/{idPelea}", produces = "application/json")
    public Pelea buscarPelea(@PathVariable int idPelea) {
        return peleaService.buscarPelea(idPelea);
    }

    /**
     * La función `nuevaPelea` crea una nueva batalla entre un aliado y un enemigo
     * en función de sus
     * respectivos ID.
     *
     * @param idAliado  La identificación del aliado en la pelea.
     * @param idEnemigo La identidad del enemigo en la lucha.
     * @return El método devuelve un objeto de tipo "Pelea".
     */
    @PostMapping(value = "/pelea/{idAliado}/{idEnemigo}", produces = "application/json")
    public Pelea nuevaPelea(@PathVariable int idAliado, @PathVariable int idEnemigo) {
        return peleaService.nuevaPelea(idAliado, idEnemigo);
    }

    /**
     * La función "actualizarPelea" actualiza un objeto "Pelea" mediante el servicio
     * "peleaService".
     *
     * @param pelea El parámetro "pelea" es de tipo Pelea, que es el cuerpo de
     *              solicitud del punto final
     *              API. Se consume en formato "aplicación/json".
     */
    @PutMapping(value = "/pelea", consumes = "application/json")
    public void actualizarPelea(@RequestBody Pelea pelea) {
        peleaService.actualizarPelea(pelea);
    }

    /**
     * Esta función Java elimina un objeto "Pelea" con el ID especificado y devuelve
     * una lista de los
     * objetos "Pelea" restantes.
     *
     * @param idPelea La identificación de la pelea que debe eliminarse.
     * @return El método devuelve una lista de objetos Pelea.
     */
    @DeleteMapping(value = "/pelea/{idPelea}", produces = "application/json")
    public List<Pelea> borrarPelea(@PathVariable int idPelea) {
        return peleaService.borrarPelea(idPelea);
    }

    /**
     * La función "buscarAnimalGanador" es una petición GET que recupera el animal
     * ganador de una pelea
     * basándose en el "idPelea" dado.
     *
     * @param idPelea El id de la pelea para buscar al animal ganador.
     * @return Se devuelve un objeto de tipo AnimalAux.
     */
    @GetMapping(value = "/ganador/{idPelea}", produces = "application/json")
    public AnimalAux buscarAnimalGanador(@PathVariable int idPelea) {
        return peleaService.buscarAnimalGanador(idPelea);
    }

}
