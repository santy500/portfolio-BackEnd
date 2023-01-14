
package com.ap.portfolio.service;

import com.ap.portfolio.model.Usuario;
import com.ap.portfolio.repository.IUsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepo repo;
    
    @Override
    public Usuario verUsuario(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void crearUsuario(Usuario user) {
        repo.save(user);
    }

    @Override
    public void editarUsuario(Usuario user, int id) {
        user.setId(id);
        if(user.getEmail()==""){
        user.setEmail(verUsuario(id).getEmail());
        }
        if(user.getPassword()==""){
        user.setPassword(verUsuario(id).getPassword());
        }
        repo.save(user);
    }
    
}
