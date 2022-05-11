
package com.portfolioAPI.APIPortfolioArgProg.Repository;

import com.portfolioAPI.APIPortfolioArgProg.Model.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RedSocialRepository extends JpaRepository <RedSocial, Long>{
    
}
