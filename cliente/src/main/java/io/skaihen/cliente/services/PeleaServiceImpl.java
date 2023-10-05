package io.skaihen.cliente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.skaihen.cliente.models.AnimalAux;
import io.skaihen.cliente.models.Pelea;
import io.skaihen.cliente.repositories.PeleaRepository;

@Service
public class PeleaServiceImpl implements PeleaService {
    @Autowired
    RestTemplate template;

    @Autowired
    PeleaRepository peleaRepository;

    private String url = "http://localhost:8080/";

    @Override
    public List<Pelea> peleas() {
        return peleaRepository.findAll();
    }

    @Override
    public Pelea nuevaPelea(int idAliado, int idEnemigo) {
        AnimalAux aliado = template.getForObject(url + "animal/" + idAliado, AnimalAux.class);
        AnimalAux enemigo = template.getForObject(url + "animal/" + idEnemigo, AnimalAux.class);

        if (aliado == null || enemigo == null) {
            throw new NullPointerException("El animal no existe");
        }

        String resultado = "empate";

        if (aliado.calculateTotalStats() > enemigo.calculateTotalStats()) {
            resultado = "victoria";
        }
        if (enemigo.calculateTotalStats() > aliado.calculateTotalStats()) {
            resultado = "derrota";
        }

        Pelea pelea = new Pelea(0, aliado, enemigo, resultado);

        peleaRepository.save(pelea);

        return pelea;
    }
}