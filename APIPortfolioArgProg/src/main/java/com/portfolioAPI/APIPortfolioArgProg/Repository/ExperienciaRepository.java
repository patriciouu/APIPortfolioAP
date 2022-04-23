
package com.portfolioAPI.APIPortfolioArgProg.Repository;

import com.portfolioAPI.APIPortfolioArgProg.Model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}
