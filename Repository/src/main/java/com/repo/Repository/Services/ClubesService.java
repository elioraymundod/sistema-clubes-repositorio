/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Clubes;
import com.repo.Repository.Repositories.ClubesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elio Raymundo
 */
@Service
public class ClubesService {
    @Autowired
    private ClubesRepository clubesRepository;
    
    /**
     * Metodo para crear un club
     *
     * @author Elio Raymundo
     * @param pClub objeto a crear
     * @return club creado {@link Clubes}
     */
    public Clubes createClub(Clubes pClub){
        return clubesRepository.save(pClub);
    }
    
    /**
     * Metodo para obtener club segun nombre
     *
     * @author Elio Raymundo
     * @param pNombreClub nombre del club a consultar
     * @return club
     */
    public Clubes getClubByNombre(String pNombreClub) {
        return clubesRepository.getClubByNombre(pNombreClub);
    }
}
