
package com.portfolioAPI.APIPortfolioArgProg.Repository;

import com.portfolioAPI.APIPortfolioArgProg.Model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{
    
}
