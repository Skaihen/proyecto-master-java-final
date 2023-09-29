package io.skaihen.apirest.pokemon;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    @Query("SELECT p FROM Pokemon p WHERE p.hp >= :hpMin")
    List<Pokemon> findAllWithHpMin(int hpMin);
}