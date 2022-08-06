/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Entrenadores;
import com.repo.Repository.Model.Paises;
import com.repo.Repository.Repositories.EntrenadoresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elio Raymundo
 */
@Service
public class EntrenadoresService {
    @Autowired
    private EntrenadoresRepository entrenadoresRepository;
    
    /**
     * Metodo para crear un entrenador
     *
     * @author Elio Raymundo
     * @param pEntrenador objeto a crear
     * @return Entrenador creado {@link Entrenadores}
     */
    public Entrenadores createEntrenador(Entrenadores pEntrenador){
        return entrenadoresRepository.save(pEntrenador);
    }
    
    /**
     * Metodo para obtener todos los entrenadores
     *
     * @author Elio Raymundo
     * @return lista de Entrenadores {@link Entrenadores}
     */
    public List<Entrenadores> getAllEntrenadores() {
        return (List<Entrenadores>) entrenadoresRepository.findAll();
    }
    
}
