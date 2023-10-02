package io.skaihen.apirest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.skaihen.apirest.models.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    @Query("SELECT p FROM Pokemon p WHERE p.speed >= :speedMin")
    List<Pokemon> findAllWithSpeedMin(int speedMin);

    @Query("SELECT p FROM Pokemon p WHERE p.hp BETWEEN :hpMin AND :hpMax")
    List<Pokemon> findAllBetweenHpMinMax(int hpMin, int hpMax);
}