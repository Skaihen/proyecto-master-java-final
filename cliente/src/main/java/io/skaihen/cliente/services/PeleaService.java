package io.skaihen.cliente.services;

import java.util.List;

import io.skaihen.cliente.models.AnimalAux;
import io.skaihen.cliente.models.Pelea;

public interface PeleaService {

    List<Pelea> peleas();

    Pelea buscarPelea(int idPelea);

    Pelea nuevaPelea(int idAliado, int idEnemigo);

    void actualizarPelea(Pelea pelea);

    List<Pelea> borrarPelea(int idPelea);

    AnimalAux buscarAnimalGanador(int idPelea);

}
