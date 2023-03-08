
package com.ap.portfolio.service;


import com.ap.portfolio.model.ProgresoSoft;
import java.util.List;


public interface IProgresoSoftService {
    
    public void crearProgresoSoft(ProgresoSoft pro);
    public void editarProgresoSoft(ProgresoSoft pro, int id);
    public List<ProgresoSoft> verProgresosSoft();
    public ProgresoSoft buscarProgresoSoft(int id);
    public void eliminarProgresoSoft(int id);
}
