package io.skaihen.cliente.services;

import java.util.List;

import io.skaihen.cliente.models.AnimalAux;
import io.skaihen.cliente.models.Pelea;

public interface PeleaService {
    /**
     * La función "peleas()" devuelve una lista de todos los objetos "Pelea" del
     * "peleaRepository".
     *
     * @return Se devuelve una lista de objetos Pelea.
     */
    List<Pelea> peleas();

    /**
     * La función "buscarPelea" busca una pelea por su ID y devuelve una referencia
     * a la misma.
     *
     * @param idPelea El parámetro "idPelea" es un número entero que representa el
     *                identificador único de
     *                un objeto "Pelea".
     * @return El método devuelve un objeto de tipo "Pelea".
     */
    Pelea buscarPelea(int idPelea);

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
    Pelea nuevaPelea(int idAliado, int idEnemigo);

    /**
     * La función "actualizarPelea" actualiza un objeto "Pelea" en el
     * "peleaRepository".
     *
     * @param pelea El parámetro "pelea" es un objeto de tipo "Pelea".
     */
    void actualizarPelea(Pelea pelea);

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
    List<Pelea> borrarPelea(int idPelea);

    /**
     * La función busca el animal ganador de una pelea por su ID y lo devuelve.
     *
     * @param idPelea El id de la pelea para la que queremos encontrar el animal
     *                ganador.
     * @return El método devuelve un objeto de tipo AnimalAux.
     */
    AnimalAux buscarAnimalGanador(int idPelea);

}
