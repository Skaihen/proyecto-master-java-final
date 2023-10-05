package io.skaihen.cliente.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AnimalAux {
    @Id
    private int id;
    private String name;
    private String type1;
    private String type2;
    private int level;
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    public int calcularStatsTotal() {
        return hp + attack + defense + specialAttack + specialDefense + speed;
    }
}
