/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Paises;
import com.repo.Repository.Model.Palmares;
import com.repo.Repository.Projections.PalmaresProjection;
import static com.repo.Repository.Repositories.PaisesRepository.CONSULTA_PAISES;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Elio Raymundo
 */
public interface PalmaresRepository extends CrudRepository<Palmares, Integer> {

    /**
     * Variable que almacena query base para consulta de paises
     */
    static final String CONSULTA_PALMARES
            = "select pa.id_palmares as idPalmares, pa.id_club as idClub, pa.id_campeonato as idCampeonato, pa.fecha, clu.nombre_club as nombreClub, ca.nombre_campeonato as nombreCampeonato\n"
            + "from palmares pa \n"
            + "inner join clubes clu on clu.id_club = pa.id_club\n"
            + "inner join campeonato ca on ca.id_campeonato = pa.id_campeonato ";
    
    /**
     * Metodo para obtener todos los palmares
     *
     * 
     * @return Palmares 
     */
    @Query(value
            = CONSULTA_PALMARES,
            nativeQuery = true)
    public List<PalmaresProjection> getAllPalmares();

}
