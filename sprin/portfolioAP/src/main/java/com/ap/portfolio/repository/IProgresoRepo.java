
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Progreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProgresoRepo extends JpaRepository<Progreso, Integer> {
    
}
