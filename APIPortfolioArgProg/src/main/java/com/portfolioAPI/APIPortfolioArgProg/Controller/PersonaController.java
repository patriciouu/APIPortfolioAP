
package com.portfolioAPI.APIPortfolioArgProg.Controller;

import com.portfolioAPI.APIPortfolioArgProg.Model.Persona;
import com.portfolioAPI.APIPortfolioArgProg.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPerso;
    
    @GetMapping("/index")
    public List<Persona> returnPersonas(){
       return interPerso.getPersonas();
    }
}
