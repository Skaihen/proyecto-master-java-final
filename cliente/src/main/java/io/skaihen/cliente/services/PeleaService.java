package io.skaihen.cliente.services;

import io.skaihen.cliente.models.Pelea;

public interface PeleaService {

    Pelea nuevaPelea(int idAliado, int idEnemigo);

}
