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
