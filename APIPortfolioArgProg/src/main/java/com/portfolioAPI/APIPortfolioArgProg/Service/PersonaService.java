
package com.portfolioAPI.APIPortfolioArgProg.Service;

import com.portfolioAPI.APIPortfolioArgProg.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository persoRepository;
    
}
