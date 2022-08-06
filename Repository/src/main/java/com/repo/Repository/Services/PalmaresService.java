/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Paises;
import com.repo.Repository.Model.Palmares;
import com.repo.Repository.Projections.PalmaresProjection;
import com.repo.Repository.Repositories.PaisesRepository;
import com.repo.Repository.Repositories.PalmaresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elio Raymundo
 */
@Service
public class PalmaresService {
    @Autowired
    private PalmaresRepository palmaresRepository;
    
    /**
     * Metodo para crear un palmares
     *
     * @author Elio Raymundo
     * @param pPalmares objeto a crear
     * @return palmares creado {@link Palmares}
     */
    public Palmares createPalmares(Palmares pPalmares){
        return palmaresRepository.save(pPalmares);
    }
    
     /**
     * Metodo para obtener todos los palmareses
     *
     * @author Elio Raymundo
     * @return lista de palmares {@link Palmares}
     */
    public List<PalmaresProjection> getAllPalmares() {
        return (List<PalmaresProjection>) palmaresRepository.getAllPalmares();
    }
}
