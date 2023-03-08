
package com.ap.portfolio.service;

import com.ap.portfolio.model.Progreso;
import java.util.List;


public interface IProgresoService {
    
    public void crearProgreso(Progreso pro);
    public void editarProgreso(Progreso pro, int id);
    public List<Progreso> verProgresos();
    public Progreso buscarProgreso(int id);
    public void eliminarProgreso(int id);
    
    
}
