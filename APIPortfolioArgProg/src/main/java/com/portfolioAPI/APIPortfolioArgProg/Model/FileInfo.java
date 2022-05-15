/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioAPI.APIPortfolioArgProg.Model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author patri
 */
@Getter @Setter 
public class FileInfo {

    private String name;
    private String url;

    public FileInfo() {
    }

    public FileInfo(String name, String url) {
        this.name = name;
        this.url = url;
    }
    
    
}
