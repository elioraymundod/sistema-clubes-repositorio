/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Socios;
import com.repo.Repository.Projections.SociosProjection;
import com.repo.Repository.Repositories.SociosRepository;
import java.util.List;
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
    
    /**
     * Metodo para obtener todos los socios
     *
     * @author Elio Raymundo
     * @return lista de socios {@link Socios}
     */
    public List<SociosProjection> getAllSocios() {
        return (List<SociosProjection>) sociosRepository.getAllSocios();
    }
    
}
