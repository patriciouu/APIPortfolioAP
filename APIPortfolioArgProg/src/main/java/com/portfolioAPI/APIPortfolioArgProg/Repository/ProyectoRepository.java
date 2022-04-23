
package com.portfolioAPI.APIPortfolioArgProg.Repository;

import com.portfolioAPI.APIPortfolioArgProg.Model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
    
}
