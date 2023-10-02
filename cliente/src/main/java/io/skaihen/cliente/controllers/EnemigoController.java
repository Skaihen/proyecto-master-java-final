package io.skaihen.cliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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

}
