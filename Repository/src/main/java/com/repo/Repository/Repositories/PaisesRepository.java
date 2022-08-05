/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Paises;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elio Raymundo
 */
@Repository
public interface PaisesRepository extends CrudRepository<Paises, Integer>{
    
    /**
     * Variable que almacena query base para consulta de paises
     */
    static final String CONSULTA_PAISES
            = "select * from paises pa ";
    
    /**
     * Metodo para obtener un pais en base al nombre
     *
     * @param pNombrePais Nombre del pais a consultar
     * @return Pais 
     */
    @Query(value
            = CONSULTA_PAISES
            + " where pa.nombre_pais = :pNombrePais",
            nativeQuery = true)
    public Paises getPaisByNombre(@Param("pNombrePais") String pNombrePais);
}
