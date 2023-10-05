package io.skaihen.cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.skaihen.cliente.models.Pelea;

@Repository
public interface PeleaRepository extends JpaRepository<Pelea, Integer> {

}
