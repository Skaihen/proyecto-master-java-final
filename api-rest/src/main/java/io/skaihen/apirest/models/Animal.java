package io.skaihen.apirest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "animales")
public class Animal {
    @Id
    private int id;
    private String name;
    private int intelligence;
    private int power;
    private int defense;
    private int speed;
    private int hp;
    private int stealth;
}
