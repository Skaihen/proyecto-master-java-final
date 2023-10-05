package io.skaihen.cliente.services;

import java.util.List;

import io.skaihen.cliente.models.Pelea;

public interface PeleaService {

    List<Pelea> peleas();

    Pelea nuevaPelea(int idAliado, int idEnemigo);

}
