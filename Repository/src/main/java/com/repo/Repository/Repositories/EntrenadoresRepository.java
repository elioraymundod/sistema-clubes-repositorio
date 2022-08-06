/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Entrenadores;
import com.repo.Repository.Model.Paises;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elio Raymundo
 */
@Repository
public interface EntrenadoresRepository extends CrudRepository<Entrenadores, Integer>{
    
    /**
     * Variable que almacena query base para consulta de paises
     */
    static final String CONSULTA_ENTRENADORES
            = "select * from entrenadores en ";
    
    /**
     * Metodo para obtener todos los entrenadores
     *
     * @return Entrenadores 
     */
    @Query(value
            = CONSULTA_ENTRENADORES,
            nativeQuery = true)
    public Paises getAllEntrenadores();
    
}
