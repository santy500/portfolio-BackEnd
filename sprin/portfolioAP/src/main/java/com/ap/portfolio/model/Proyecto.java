
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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="nombre", length=20, nullable=false)
    private String nombre;
    @Column(name="inicio", length=4, nullable=false)
    private int fecInicio;
    @Column(name="fin", length=4, nullable=false)
    private int fecFin;
    @Column(name="descripcion", length=200, nullable=false)
    private String descripcion;
    @Column(name="imagen",length=200, nullable=false)
    private String imagen;
    @Column(name="link",length=200, nullable=false)
    private String link;
    
    public Proyecto() {
    }

    public Proyecto(int id, String nombre, int fecInicio, int fecFin, String descripcion, String imagen,String link) {
        this.id = id;
        this.nombre = nombre;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.link = link;
    }
    
    
}
