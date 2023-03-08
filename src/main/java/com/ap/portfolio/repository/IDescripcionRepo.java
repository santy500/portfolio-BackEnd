
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Descripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDescripcionRepo extends JpaRepository<Descripcion, Integer> {
    
}
