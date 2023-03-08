
package com.ap.portfolio.service;

import com.ap.portfolio.model.Estudio;
import java.util.List;


public interface IEstudioService {
    
     public void crearEstudio(Estudio est);
    public void editarEstudio(Estudio est, int id);
    public List<Estudio> verEstudios();
    public Estudio buscarEstudio(int id);
    public void eliminarEstudio(int id);
}
