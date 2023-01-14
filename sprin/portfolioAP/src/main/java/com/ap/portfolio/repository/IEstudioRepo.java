
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepo extends JpaRepository<Estudio, Integer> {
    
}
