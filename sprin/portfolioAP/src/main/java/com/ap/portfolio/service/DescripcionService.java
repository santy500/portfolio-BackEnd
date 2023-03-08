
package com.ap.portfolio.service;

import com.ap.portfolio.model.Descripcion;
import com.ap.portfolio.repository.IDescripcionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescripcionService implements IDescripcionService {
    
    
    @Autowired
    private IDescripcionRepo repo;

    @Override
    public void crearDescripcion(Descripcion des) {
        repo.save(des);
    }

    @Override
    public Descripcion verDescripcion(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void editarDescripcion(Descripcion des, int id) {
        des.setId(id);
        if(des.getTitulo()==""){
            des.setTitulo(verDescripcion(id).getTitulo());
        }
        if(des.getDescripcion()==""){
            des.setDescripcion(verDescripcion(id).getDescripcion());
        }
        if(des.getImagen()==""){
            des.setImagen(verDescripcion(id).getImagen());
        }
        if(des.getInstagram()==""){
            des.setInstagram(verDescripcion(id).getInstagram());
        }
        if(des.getTwitter()==""){
            des.setTwitter(verDescripcion(id).getTwitter());
        }
        if(des.getGithub()==""){
            des.setGithub(verDescripcion(id).getGithub());
        }
        if(des.getFondo()==""){
            des.setFondo(verDescripcion(id).getFondo());
        }
        repo.save(des);
    }
    
    
    
}
