
package com.portfolioAPI.APIPortfolioArgProg.Controller;

import com.portfolioAPI.APIPortfolioArgProg.Model.Experiencia;
import com.portfolioAPI.APIPortfolioArgProg.Service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/portfolio") //Prueba de conexión con el front
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService interExp;
    
    @GetMapping("/experiencia")
    private List<Experiencia> returnExperiencias(){
        return interExp.getExperiencias();
    }
    
    @DeleteMapping("/experiencia/delete/{id}")
    private void deleteExperencia(@PathVariable Long id){
        interExp.deleteExperiencia(id);
    }
}
