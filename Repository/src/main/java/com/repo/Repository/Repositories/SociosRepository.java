/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Socios;
import com.repo.Repository.Projections.SociosProjection;
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
public interface SociosRepository extends CrudRepository<Socios, Integer> {

    /**
     * Variable que almacena query base para consulta de socios
     */
    static final String CONSULTA_SOCIOS
            = "select so.id_socio as idSocio, so.nombre_socio as nombreSocio, so.apellido_socio as apellidoSocio, so.direccion, so.provincia, so.cuota_actual as cuotaActual, so.id_club as idClub, clu.nombre_club as nombreClub\n"
            + "from socios so \n"
            + "inner join clubes clu on clu.id_club = so.id_club ";

     /**
     * Metodo para obtener todos los socios
     *
     * @return Socios 
     */
    @Query(value
            = CONSULTA_SOCIOS,
            nativeQuery = true)
    public List<SociosProjection> getAllSocios();
}
