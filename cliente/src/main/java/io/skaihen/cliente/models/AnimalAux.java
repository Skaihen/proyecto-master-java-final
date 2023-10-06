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
    private int intelligence;
    private int power;
    private int defense;
    private int speed;
    private int hp;
    private int stealth;

    public int calculateTotalStats() {
        return intelligence + power + defense + speed + hp + stealth;
    }
}
