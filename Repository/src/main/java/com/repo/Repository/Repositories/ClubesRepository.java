/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Clubes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elio Raymundo
 */
@Repository
public interface ClubesRepository extends CrudRepository<Clubes, Integer>{
    /**
     * Variable que almacena query base para consulta de clubes
     */
    static final String CONSULTA_CLUBES
            = "select * from clubes clu ";
    
    /**
     * Metodo para obtener un club por el nombre
     *
     * @param pNombreClub Nombre del club a consultar
     * @return Clubes 
     */
    @Query(value
            = CONSULTA_CLUBES
            + " where clu.nombre_club = :pNombreClub",
            nativeQuery = true)
    public Clubes getClubByNombre(@Param("pNombreClub") String pNombreClub);
    
}
