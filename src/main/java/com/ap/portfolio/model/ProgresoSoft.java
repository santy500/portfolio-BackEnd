
package com.ap.portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class ProgresoSoft {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="nombre", length=30, nullable=false)
    private String nombre;
    @Column(name="nivel", length=3, nullable=false)
    private int nivel;

    public ProgresoSoft() {
    }

    public ProgresoSoft(int id, String nombre, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    
}
