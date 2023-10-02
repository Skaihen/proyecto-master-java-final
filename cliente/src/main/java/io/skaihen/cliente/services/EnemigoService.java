package io.skaihen.cliente.services;

import java.util.List;

import io.skaihen.cliente.models.Enemigo;

public interface EnemigoService {
    List<Enemigo> enemigos();

    Enemigo buscarEnemigo(int id);

    void nuevoEnemigo(Enemigo enemigo);

    void actualizarEnemigo(Enemigo enemigo);

    void eliminarEnemigo(int id);

    List<Enemigo> buscarEnemigoSpeedMin(int speedMin);

    List<Enemigo> buscarEnemigoHpEntreMinMax(int hpMin, int hpMax);
}
