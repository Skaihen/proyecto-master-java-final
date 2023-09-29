package io.skaihen.cliente.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EquipoServiceImpl {
    @Autowired
    RestTemplate template;

    private String url = "https://localhost:8080/";

    @Override
    public List<Equipo> nuevoEquipo(Equipo equipo) {
        template.postForLocation(url + "pokemon", equipo);

        return Arrays.asList(template.getForObject(url + "pokemons", Equipo[].class));
    }

}
