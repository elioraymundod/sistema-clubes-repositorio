/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Elio Raymundo
 */
@Entity
@Table(name = "jugadores")
public class Jugadores {
    private Integer idJugador;
    private String nombreJugador;
    private Integer dorsal;
    private Integer idPais;

    public Jugadores() {
    }

    public Jugadores(Integer idJugador, String nombreJugador, Integer dorsal, Integer idPais) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        this.dorsal = dorsal;
        this.idPais = idPais;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jugador") 
    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    @Column(name = "nombre_jugador") 
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    @Column(name = "dorsal") 
    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    @Column(name = "id_pais") 
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }
    
    
    
}
