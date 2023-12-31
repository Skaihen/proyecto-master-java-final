package io.skaihen.cliente.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
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
    @SequenceGenerator(initialValue = 1, name = "pelea_seq", sequenceName = "pelea_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pelea_seq")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aliado", referencedColumnName = "id")
    private AnimalAux aliado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enemigo", referencedColumnName = "id")
    private AnimalAux enemigo;

    private String resultado;

    public String obtenerIdGanador() {

        if (resultado.equals("empate"))
            return resultado;

        return resultado.equals("victoria") ? String.valueOf(aliado.getId())
                : String.valueOf(enemigo.getId());
    }
}
