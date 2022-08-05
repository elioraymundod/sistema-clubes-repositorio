/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Paises;
import com.repo.Repository.Repositories.PaisesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elio Raymundo
 */
@Service
public class PaisesService {
    @Autowired
    private PaisesRepository paisesRepository;
    
    /**
     * Metodo para obtener todos los paises
     *
     * @author Elio Raymundo
     * @return lista de paises {@link Paises}
     */
    public List<Paises> getAllPaises() {
        return (List<Paises>) paisesRepository.findAll();
    }
    
    /**
     * Metodo para obtener todos los paises
     *
     * @author Elio Raymundo
     * @param pNombrePais nombre del pais a consultar
     * @return lista de paises {@link Paises}
     */
    public Paises getPaisByNombre(String pNombrePais) {
        return paisesRepository.getPaisByNombre(pNombrePais);
    }
    
    /**
     * Metodo para crear un pais
     *
     * @author Elio Raymundo
     * @param pPais objeto a crear
     * @return pais creado {@link Paises}
     */
    public Paises createPais(Paises pPais){
        return paisesRepository.save(pPais);
    }
}
