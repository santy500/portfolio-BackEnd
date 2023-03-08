
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
    @Column(name = "descripcion", length=400, nullable=false)
    private String descripcion;
    @Column(name = "imagen", length=200, nullable=false)
    private String imagen;
    @Column(name = "instagram", length=200, nullable=false)
    private String instagram;
    @Column(name = "twitter", length=200, nullable=false)
    private String twitter;
    @Column(name = "github", length=200, nullable=false)
    private String github;
    @Column(name = "fondo", length=200, nullable=false)
    private String fondo;
    
    public Descripcion() {
    }

    public Descripcion(int id, String titulo, String descripcion, String imagen, String instagram, String twitter, String fondo,String github) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.instagram = instagram;
        this.twitter = twitter;
        this.fondo = fondo;
        this.github = github;
    }

    
    
    
}
