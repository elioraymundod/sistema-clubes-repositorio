/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Socios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elio Raymundo
 */
@Repository
public interface SociosRepository extends CrudRepository<Socios, Integer>{
    /**
     * Variable que almacena query base para consulta de socios
     */
    static final String CONSULTA_SOCIOS
            = "select * from socios so ";
}
