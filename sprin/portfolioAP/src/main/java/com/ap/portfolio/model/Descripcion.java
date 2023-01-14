
package com.ap.portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Descripcion {
    
    @Id
    private int id;
    @Column(name = "titulo", length=20, nullable=false)
    private String titulo;
    @Column(name = "descripcion", length=200, nullable=false)
    private String descripcion;
    @Column(name = "imagen", length=200, nullable=false)
    private String imagen;
    

    public Descripcion() {
    }

    public Descripcion(int id, String titulo, String descripcion, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    
    
    
}
