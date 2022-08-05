/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Services;

import com.repo.Repository.Model.Jugadores;
import com.repo.Repository.Projections.JugadoresProjection;
import com.repo.Repository.Repositories.JugadoresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elio Raymundo
 */
@Service
public class JugadoresService {
    
    @Autowired
    private JugadoresRepository jugadoresRepository;
    
    /**
     * Metodo para obtener todos los jugadores
     *
     * @author Elio Raymundo
     * @return lista de jugadores {@link Jugadores}
     */
    public List<JugadoresProjection> getAllJugadores() {
        return (List<JugadoresProjection>) jugadoresRepository.getAllJugadores();
    }
    
    /**
     * Metodo para crear un jugador
     *
     * @author Elio Raymundo
     * @param pJugador objeto a crear
     * @return jugador creado {@link Jugadores}
     */
    public Jugadores createPais(Jugadores pJugador){
        return jugadoresRepository.save(pJugador);
    }
    
    /**
     * Metodo para obtener un jugador en base al nombre
     *
     * @author Elio Raymundo
     * @param pNombre Nombre a consultar
     * @return jugador {@link JugadoresProjection}
     */
    public List<JugadoresProjection> getJugadorByNombre(String pNombre){
        return (List<JugadoresProjection>) jugadoresRepository.getJugadorByNombre(pNombre);
    }
    
}
