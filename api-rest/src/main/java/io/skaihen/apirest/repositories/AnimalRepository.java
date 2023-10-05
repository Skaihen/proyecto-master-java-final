package io.skaihen.apirest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.skaihen.apirest.models.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.speed >= :speedMin")
    List<Animal> findAllWithSpeedMin(int speedMin);

    @Query("SELECT a FROM Animal a WHERE a.hp BETWEEN :hpMin AND :hpMax")
    List<Animal> findAllBetweenHpMinMax(int hpMin, int hpMax);
}