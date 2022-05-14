package com.portfolioAPI.APIPortfolioArgProg.Controller;

import com.portfolioAPI.APIPortfolioArgProg.Model.Persona;
import com.portfolioAPI.APIPortfolioArgProg.Service.PersonaService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/portfolio")
public class PersonaController {

    @Autowired
    private PersonaService interPerso;

    @GetMapping("/persona")
    public List<Persona> returnPersonas() {
        return interPerso.getPersonas();
    }

    @PutMapping("/persona/edit/{id}")
    public void editPersona(@PathVariable Long id,
            @RequestBody Persona perso){
        interPerso.savePersona(perso);
    }
}
