package io.skaihen.cliente.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "peleas")
public class Pelea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private AnimalAux idAliado;
    private AnimalAux idEnemigo;
    private String resultado;
}
