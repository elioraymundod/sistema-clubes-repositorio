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
@Table(name = "club_jug")
public class ClubesJugadores {
    private Integer idClubJug;
    private Integer idJugador;
    private Integer idClub;

    public ClubesJugadores() {
    }

    public ClubesJugadores(Integer idClubJug, Integer idJugador, Integer idClub) {
        this.idClubJug = idClubJug;
        this.idJugador = idJugador;
        this.idClub = idClub;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_club_jug") 
    public Integer getIdClubJug() {
        return idClubJug;
    }

    public void setIdClubJug(Integer idClubJug) {
        this.idClubJug = idClubJug;
    }

    @Column(name = "id_jugador") 
    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    @Column(name = "id_club") 
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }
    
    
    
}
