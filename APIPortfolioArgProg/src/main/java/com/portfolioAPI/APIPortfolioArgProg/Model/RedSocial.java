/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioAPI.APIPortfolioArgProg.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author patri
 */
@Entity
@Getter @Setter
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long redSocialId;
    private String urlInstagram;
    private String urlLinkedin;
    private String urlFacebook;

    public RedSocial() {
    }

    public RedSocial(Long redSocialId, String urlInstagram, String urlLinkedin, String urlFacebook) {
        this.redSocialId = redSocialId;
        this.urlInstagram = urlInstagram;
        this.urlLinkedin = urlLinkedin;
        this.urlFacebook = urlFacebook;
    }
    
}
