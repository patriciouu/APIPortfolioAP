
package com.portfolioAPI.APIPortfolioArgProg.Controller;

import com.portfolioAPI.APIPortfolioArgProg.Model.Persona;
import com.portfolioAPI.APIPortfolioArgProg.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPerso;
    
    @GetMapping("/persona")
    public List<Persona> returnPersonas(){
       return interPerso.getPersonas();
    }
    
    @PutMapping("/persona/edit/{id}")
    public void editPersona(@PathVariable Long id,
            @RequestBody Persona perso){
        interPerso.savePersona(perso);
    }
}
