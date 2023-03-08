
package com.ap.portfolio.service;



import com.ap.portfolio.model.ProgresoSoft;
import com.ap.portfolio.repository.IProgresoSoftRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgresoSoftService implements IProgresoSoftService{

    @Autowired
    private IProgresoSoftRepo repo;
    
    @Override
    public void crearProgresoSoft(ProgresoSoft pro) {
        repo.save(pro);
    }

    @Override
    public List<ProgresoSoft> verProgresosSoft() {
        return repo.findAll();
    }

    @Override
    public ProgresoSoft buscarProgresoSoft(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminarProgresoSoft(int id) {
        repo.deleteById(id);
    }
    
    @Override
    public void editarProgresoSoft(ProgresoSoft pro, int id) {
        pro.setId(id);
        if(pro.getNombre()==""){
            pro.setNombre(buscarProgresoSoft(id).getNombre());
        }
        if(pro.getNivel()==0){
            pro.setNivel(buscarProgresoSoft(id).getNivel());
        }
        repo.save(pro);
        
    }
    
}
