
package com.ap.portfolio.service;

import com.ap.portfolio.model.Descripcion;


public interface IDescripcionService {
    
    
    public void crearDescripcion(Descripcion des);
    public Descripcion verDescripcion(int id);
    public void editarDescripcion(Descripcion des, int id);
}
