
package com.portfolioAPI.APIPortfolioArgProg.Service;

import com.portfolioAPI.APIPortfolioArgProg.Model.Educacion;
import com.portfolioAPI.APIPortfolioArgProg.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository eduRepo;

    @Override
    public List<Educacion> getEducacionList() {
        List<Educacion> eduList = eduRepo.findAll();
        return eduList;
    }

    @Override
    public void saveEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion getEducacion(Long id) {
        Educacion edu = eduRepo.findById(id).orElse(null);
        return edu;
    }
    
    
    
}
