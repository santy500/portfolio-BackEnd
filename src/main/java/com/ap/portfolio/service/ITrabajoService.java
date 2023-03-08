
package com.ap.portfolio.service;

import com.ap.portfolio.model.Trabajo;
import java.util.List;


public interface ITrabajoService {
    
    public void crearTrabajo(Trabajo trab);
    public void editarTrabajo(Trabajo trab, int id);
    public List<Trabajo> verTrabajos();
    public Trabajo buscarTrabajo(int id);
    public void eliminarTrabajo(int id);
}
