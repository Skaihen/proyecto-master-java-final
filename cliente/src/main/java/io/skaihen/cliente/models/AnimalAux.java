package io.skaihen.cliente.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalAux {
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

    public int calculateTotalStats() {
        return hp + attack + defense + specialAttack + specialDefense + speed;
    }
}
