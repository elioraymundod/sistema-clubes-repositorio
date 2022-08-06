/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Projections;

import java.util.Date;

/**
 *
 * @author Elio Raymundo
 */
public interface PalmaresProjection {
    Integer getIdPalmares();
    
    Integer getIdClub();
    
    Integer getIdCampeonato();
    
    Date getFecha();
    
    String getNombreCampeonato();
    
    String getNombreClub();

}
