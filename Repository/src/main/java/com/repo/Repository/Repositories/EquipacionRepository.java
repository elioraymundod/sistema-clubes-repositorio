/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Equipacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elio Raymundo
 */
@Repository
public interface EquipacionRepository  extends CrudRepository<Equipacion, Integer>{
    
    /**
     * Variable que almacena query base para consulta de equipaciones
     */
    static final String CONSULTA_EQUIPACIONES
            = "select * from paises pa ";
    
}
