
package com.portfolioAPI.APIPortfolioArgProg.Service;

import com.portfolioAPI.APIPortfolioArgProg.Model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersonas();

    public void savePersona(Persona perso);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);
    
    public void editPersona(Persona perso);
}
