
package com.ap.portfolio.service;

import com.ap.portfolio.model.Usuario;


public interface IUsuarioService {
    
    public Usuario verUsuario(int id);
    public void crearUsuario(Usuario user);
    public void editarUsuario(Usuario user, int id);
}
