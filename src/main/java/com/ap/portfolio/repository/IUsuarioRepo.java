
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findOneByEmail(String email);
}
