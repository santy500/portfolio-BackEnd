
package com.ap.portfolio.service;

import com.ap.portfolio.model.Progreso;
import com.ap.portfolio.repository.IProgresoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgresoService implements IProgresoService {

    @Autowired
    private IProgresoRepo repo;
    
    @Override
    public void crearProgreso(Progreso pro) {
        repo.save(pro);
    }

    @Override
    public List<Progreso> verProgresos() {
        return repo.findAll();
    }

    @Override
    public Progreso buscarProgreso(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminarProgreso(int id) {
        repo.deleteById(id);
    }
    
    @Override
    public void editarProgreso(Progreso pro, int id) {
        pro.setId(id);
        if(pro.getNombre()==""){
            pro.setNombre(buscarProgreso(id).getNombre());
        }
        if(pro.getNivel()==0){
            pro.setNivel(buscarProgreso(id).getNivel());
        }
        repo.save(pro);
        
    }
}
