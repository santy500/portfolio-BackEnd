
package com.ap.portfolio.service;

import com.ap.portfolio.model.Trabajo;
import com.ap.portfolio.repository.ITrabajoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoService implements ITrabajoService{

    @Autowired
    private ITrabajoRepo repo;
    
    @Override
    public void crearTrabajo(Trabajo trab) {
        repo.save(trab);
    }

    @Override
    public List<Trabajo> verTrabajos() {
        return repo.findAll();
    }

    @Override
    public Trabajo buscarTrabajo(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminarTrabajo(int id) {
        repo.deleteById(id);
    }
    
    @Override
    public void editarTrabajo(Trabajo trab, int id) {
        trab.setId(id);
        if(trab.getNombre()==""){
            trab.setNombre(buscarTrabajo(id).getNombre());
        }
        if(trab.getDescripcion()==""){
            trab.setDescripcion(buscarTrabajo(id).getDescripcion());
        }
        if(trab.getImagen()==""){
            trab.setImagen(buscarTrabajo(id).getImagen());
        }
        if(trab.getFecInicio()==0){
            trab.setFecInicio(buscarTrabajo(id).getFecInicio());
        }
        
        if(trab.getFecFin()==0){
            trab.setFecFin(buscarTrabajo(id).getFecFin());
        }
        repo.save(trab);
    }
    
}
