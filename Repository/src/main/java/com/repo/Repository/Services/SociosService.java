/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Socios;
import com.repo.Repository.Repositories.SociosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elio Raymundo
 */
@Service
public class SociosService {
    @Autowired
    private SociosRepository sociosRepository;
    
    /**
     * Metodo para crear un socio
     *
     * @param pSocio objeto a crear
     * @author Elio Raymundo
     * @return Socios
     */
    public Socios createSocio(Socios pSocio) {
         return sociosRepository.save(pSocio);
    }
    
}
