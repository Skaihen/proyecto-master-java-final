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

    /**
     * La función "peleas()" devuelve una lista de todos los objetos "Pelea" del
     * "peleaRepository".
     *
     * @return Se devuelve una lista de objetos Pelea.
     */
    @Override
    public List<Pelea> peleas() {
        return peleaRepository.findAll();
    }

    /**
     * La función "buscarPelea" busca una pelea por su ID y devuelve una referencia
     * a la misma.
     *
     * @param idPelea El parámetro "idPelea" es un número entero que representa el
     *                identificador único de
     *                un objeto "Pelea".
     * @return El método devuelve un objeto de tipo "Pelea".
     */
    @Override
    public Pelea buscarPelea(int idPelea) {
        return peleaRepository.getReferenceById(idPelea);
    }

    /**
     * La función `nuevaPelea` crea una nueva batalla entre dos animales, calcula
     * las estadísticas totales
     * de cada animal, determina el resultado de la batalla (victoria, derrota o
     * empate), guarda el
     * registro de la batalla en la base de datos y devuelve el objeto de la
     * batalla.
     *
     * @param idAliado  La identificación del animal aliado en la pelea.
     * @param idEnemigo El parámetro "idEnemigo" representa la identificación del
     *                  animal enemigo en una
     *                  batalla.
     * @return El método devuelve un objeto de tipo "Pelea".
     */
    @Override
    public Pelea nuevaPelea(int idAliado, int idEnemigo) {
        AnimalAux aliado = template.getForObject(url + "animal/" + idAliado, AnimalAux.class);
        AnimalAux enemigo = template.getForObject(url + "animal/" + idEnemigo, AnimalAux.class);

        if (aliado == null || enemigo == null) {
            throw new NullPointerException("El animal no existe");
        }

        aliado.setId(0);
        enemigo.setId(0);

        String resultado = aliado.calculateTotalStats() > enemigo.calculateTotalStats() ? "victoria" : "derrota";

        if (aliado.calculateTotalStats() == enemigo.calculateTotalStats()) {
            resultado = "empate";
        }

        Pelea pelea = new Pelea(0, aliado, enemigo, resultado);

        peleaRepository.save(pelea);

        return pelea;
    }

    /**
     * La función "actualizarPelea" actualiza un objeto "Pelea" en el
     * "peleaRepository".
     *
     * @param pelea El parámetro "pelea" es un objeto de tipo "Pelea".
     */
    @Override
    public void actualizarPelea(Pelea pelea) {
        peleaRepository.save(pelea);
    }

    /**
     * La función elimina una pelea con una ID determinada y devuelve una lista de
     * todas las peleas
     * restantes.
     *
     * @param idPelea El parámetro `idPelea` es un número entero que representa el
     *                ID de la pelea que debe
     *                eliminarse.
     * @return El método devuelve una lista de objetos Pelea.
     */
    @Override
    public List<Pelea> borrarPelea(int idPelea) {
        peleaRepository.deleteById(idPelea);
        return peleaRepository.findAll();
    }

    /**
     * La función busca el animal ganador de una pelea por su ID y lo devuelve.
     *
     * @param idPelea El id de la pelea para la que queremos encontrar el animal
     *                ganador.
     * @return El método devuelve un objeto de tipo AnimalAux.
     */
    @Override
    public AnimalAux buscarAnimalGanador(int idPelea) {
        AnimalAux animalGanador = template.getForObject(
                url + "animal/" + peleaRepository.getReferenceById(idPelea).obtenerIdGanador(),
                AnimalAux.class);

        if (animalGanador == null) {
            throw new NullPointerException("El animal no existe");
        }

        return animalGanador;
    }
}