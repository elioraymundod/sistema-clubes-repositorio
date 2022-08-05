/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repo.Repository.Repositories;

import com.repo.Repository.Model.Jugadores;
import com.repo.Repository.Projections.JugadoresProjection;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elio Raymundo
 *
 */
@Repository
public interface JugadoresRepository extends CrudRepository<Jugadores, Integer> {

    /**
     * Variable que almacena query base para consulta de paises
     */
    static final String CONSULTA_JUGADORES
            = "select ju.id_jugador as idJugador, ju.nombre_jugador as nombreJugador, ju.dorsal, ju.id_pais as idPais, pa.nombre_pais as nombrePais\n"
            + "from jugadores ju \n"
            + "inner join paises pa on pa.id_pais = ju.id_pais";

    /**
     * Metodo para obtener todos los jugadores
     *
     * @return Lista de Jugadores
     */
    @Query(value
            = CONSULTA_JUGADORES,
            nativeQuery = true)
    public List<JugadoresProjection> getAllJugadores();

    /**
     * Metodo para obtener un jugador en base al nombre
     *
     * @param pNombreJugador Nombre del jugador a consultar
     * @return Jugador
     */
    @Query(value
            = CONSULTA_JUGADORES
            + " where ju.nombre_jugador = :pNombreJugador",
            nativeQuery = true)
    public Jugadores getJugadorByNombre(@Param("pNombreJugador") String pNombreJugador);
}
