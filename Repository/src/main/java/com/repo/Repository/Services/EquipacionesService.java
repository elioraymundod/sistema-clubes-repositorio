/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Equipacion;
import com.repo.Repository.Repositories.EquipacionRepository;
import com.repo.Repository.Repositories.PaisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elio Raymundo
 */

@Service
public class EquipacionesService {
    @Autowired
    private EquipacionRepository equipacionRepository;
    
    /**
     * Metodo para crear una equipacion
     *
     * @author Elio Raymundo
     * @param pEquipacion objeto a crear
     * @return equipacion creado {@link Equipacion}
     */
    public Equipacion createEquipacion(Equipacion pEquipacion){
        return equipacionRepository.save(pEquipacion);
    }
}
