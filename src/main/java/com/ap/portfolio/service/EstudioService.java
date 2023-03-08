
package com.ap.portfolio.service;

import com.ap.portfolio.model.Estudio;
import com.ap.portfolio.repository.IEstudioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService {

    @Autowired
    private IEstudioRepo repo;
    
    @Override
    public void crearEstudio(Estudio est) {
        repo.save(est);
    }

    @Override
    public List<Estudio> verEstudios() {
        return repo.findAll();
    }

    @Override
    public Estudio buscarEstudio(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminarEstudio(int id) {
        repo.deleteById(id);
    }
    
    @Override
    public void editarEstudio(Estudio est, int id) {
        est.setId(id);
        if(est.getNombre()==""){
            est.setNombre(buscarEstudio(id).getNombre());
        }
        if(est.getDescripcion()==""){
            est.setDescripcion(buscarEstudio(id).getDescripcion());
        }
        if(est.getImagen()==""){
            est.setImagen(buscarEstudio(id).getImagen());
        }
        if(est.getFecInicio()==0){
            est.setFecInicio(buscarEstudio(id).getFecInicio());
        }
        
        if(est.getFecFin()==0){
            est.setFecFin(buscarEstudio(id).getFecFin());
        }
        repo.save(est);
    }
}
