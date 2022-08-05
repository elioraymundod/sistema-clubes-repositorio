/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Projections;

/**
 *
 * @author Elio Raymundo
 */
public interface SociosProjection {
    Integer getIdSocio();
    
    String getNombreSocio();
    
    String getApellidoSocio();
    
    String getDireccion();
    
    String getProvincia();
    
    String getCuotaActual();
    
    Integer getIdClub();
    
    String getNombreClub();
}
