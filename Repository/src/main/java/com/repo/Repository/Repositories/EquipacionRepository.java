/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Equipacion;
import com.repo.Repository.Model.Paises;
import com.repo.Repository.Projections.EquipacionProjection;
import static com.repo.Repository.Repositories.PaisesRepository.CONSULTA_PAISES;
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
public interface EquipacionRepository extends CrudRepository<Equipacion, Integer> {

    /**
     * Variable que almacena query base para consulta de equipaciones
     */
    static final String CONSULTA_EQUIPACIONES
            = "select eq.id_equip as idEquipo, eq.en_casa as enCasa, eq.visita, eq.id_club as idClub, clu.nombre_club as nombreClub\n"
            + "from equipacion eq \n"
            + "inner join clubes clu on clu.id_club = eq.id_club ";
    
     /**
     * Metodo para obtener todas las equipaciones
     *
     * @return Equipacion 
     */
    @Query(value
            = CONSULTA_EQUIPACIONES,
            nativeQuery = true)
    public List<EquipacionProjection> getAllEquipaciones();

}
