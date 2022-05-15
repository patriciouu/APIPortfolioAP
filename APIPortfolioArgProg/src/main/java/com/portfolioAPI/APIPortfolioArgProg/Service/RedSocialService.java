
package com.portfolioAPI.APIPortfolioArgProg.Service;

import com.portfolioAPI.APIPortfolioArgProg.Model.RedSocial;
import com.portfolioAPI.APIPortfolioArgProg.Repository.RedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService implements IRedSocialService {
    
    @Autowired
    private RedSocialRepository redRepo;

    @Override
    public List<RedSocial> getRedes() {
        return redRepo.findAll();
    }

    @Override
    public void saveRed(RedSocial red) {
        redRepo.save(red);
    }

    @Override
    public void deleteRed(Long id) {
        redRepo.deleteById(id);
    }

    @Override
    public RedSocial getRed(Long id) {
       return redRepo.getById(id);
    }
    
}
