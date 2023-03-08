
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepo extends JpaRepository<Proyecto, Integer> {
    
}
