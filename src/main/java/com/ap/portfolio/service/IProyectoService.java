
package com.ap.portfolio.service;

import com.ap.portfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
   
    public void crearProyecto(Proyecto proy);
    public void editarProyecto(Proyecto proy, int id);
    public List<Proyecto> verProyectos();
    public Proyecto buscarProyecto(int id);
    public void eliminarProyecto(int id);
}
