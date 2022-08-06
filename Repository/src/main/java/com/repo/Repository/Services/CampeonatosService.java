/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Campeonatos;
import com.repo.Repository.Model.Paises;
import com.repo.Repository.Repositories.CampeonatoRepository;
import com.repo.Repository.Repositories.PaisesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elio Raymundo
 */

@Service
public class CampeonatosService {
    @Autowired
    private CampeonatoRepository campeonatosRepository;
    
    /**
     * Metodo para crear un campeonato
     *
     * @author Elio Raymundo
     * @param pCampeonato objeto a crear
     * @return pais creado {@link Paises}
     */
    public Campeonatos createCampeonato(Campeonatos pCampeonato){
        return campeonatosRepository.save(pCampeonato);
    }
    
    /**
     * Metodo para obtener todos los campeonatos
     *
     * @author Elio Raymundo
     * @return lista de Campeonatos {@link Campeonatos}
     */
    public List<Campeonatos> getAllCampeonatos() {
        return (List<Campeonatos>) campeonatosRepository.findAll();
    }
    
}
