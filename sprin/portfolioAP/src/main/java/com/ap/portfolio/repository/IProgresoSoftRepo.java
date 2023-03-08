
package com.ap.portfolio.repository;


import com.ap.portfolio.model.ProgresoSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProgresoSoftRepo extends JpaRepository<ProgresoSoft, Integer>{
    
}
