/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Campeonatos;
import com.repo.Repository.Model.Paises;
import static com.repo.Repository.Repositories.PaisesRepository.CONSULTA_PAISES;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Elio Raymundo
 */
public interface CampeonatoRepository extends CrudRepository<Campeonatos, Integer>{
    /**
     * Variable que almacena query base para consulta de Campeonatos
     */
    static final String CONSULTA_PAISES
            = "select * from campeonatos ca ";
    
    /**
     * Metodo para obtener todos los campeonatos
     *
     * @return Campeonatos 
     */
    @Query(value
            = CONSULTA_PAISES,
            nativeQuery = true)
    public Paises getAllCampeonatos();
    
}
