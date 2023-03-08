
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrabajoRepo extends JpaRepository<Trabajo, Integer> {
    
}
