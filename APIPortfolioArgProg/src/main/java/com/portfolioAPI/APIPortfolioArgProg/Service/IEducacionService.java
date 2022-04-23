
package com.portfolioAPI.APIPortfolioArgProg.Service;

import com.portfolioAPI.APIPortfolioArgProg.Model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> getEducacionList();
    
    public void saveEducacion(Educacion edu);
    
    public void deleteEducacion(Long id);
    
    public Educacion getEducacion(Long id);
}
