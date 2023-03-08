
package com.ap.portfolio.service;

import com.ap.portfolio.model.Proyecto;
import com.ap.portfolio.repository.IProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    private IProyectoRepo repo;
    
    
    @Override
    public void crearProyecto(Proyecto proy) {
        repo.save(proy);
    }

    @Override
    public List<Proyecto> verProyectos() {
        return repo.findAll();
    }

    @Override
    public Proyecto buscarProyecto(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminarProyecto(int id) {
        repo.deleteById(id);
    }
    
    @Override
    public void editarProyecto(Proyecto proy, int id) {
        proy.setId(id);
        if(proy.getNombre()==""){
            proy.setNombre(buscarProyecto(id).getNombre());
        }
        if(proy.getDescripcion()==""){
            proy.setDescripcion(buscarProyecto(id).getDescripcion());
        }
        if(proy.getImagen()==""){
            proy.setImagen(buscarProyecto(id).getImagen());
        }
        if(proy.getFecInicio()==0){
            proy.setFecInicio(buscarProyecto(id).getFecInicio());
        }
        
        if(proy.getFecFin()==0){
            proy.setFecFin(buscarProyecto(id).getFecFin());
        }
        if(proy.getLink()==""){
            proy.setLink(buscarProyecto(id).getLink());
        }
        repo.save(proy);
    }
    
}
