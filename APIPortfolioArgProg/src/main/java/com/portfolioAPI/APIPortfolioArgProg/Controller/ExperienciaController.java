
package com.portfolioAPI.APIPortfolioArgProg.Controller;

import com.portfolioAPI.APIPortfolioArgProg.Model.Experiencia;
import com.portfolioAPI.APIPortfolioArgProg.Service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService interExp;
    
    @GetMapping("experiencia/list")
    private List<Experiencia> returnExperiencias(){
        return interExp.getExperiencias();
    }
}
