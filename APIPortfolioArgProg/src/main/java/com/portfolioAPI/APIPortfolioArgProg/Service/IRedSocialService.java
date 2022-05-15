
package com.portfolioAPI.APIPortfolioArgProg.Service;

import com.portfolioAPI.APIPortfolioArgProg.Model.RedSocial;
import java.util.List;


public interface IRedSocialService {
    
    public List<RedSocial> getRedes();
    
    public void saveRed(RedSocial red);
    
    public void deleteRed(Long id);
    
    public RedSocial getRed (Long id);
    
}
