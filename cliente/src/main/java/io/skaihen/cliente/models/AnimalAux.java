package io.skaihen.cliente.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "animales_aux")
public class AnimalAux {
    @Id
    @SequenceGenerator(initialValue = 1, name = "animal_aux_seq", sequenceName = "animal_aux_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_aux_seq")
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
