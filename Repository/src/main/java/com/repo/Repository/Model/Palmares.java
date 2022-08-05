/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Model;

import java.util.Date;
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
@Table(name = "palmares")
public class Palmares {
    private Integer idPalmares;
    private Integer idClub;
    private Integer idCampeonato;
    private Date fecha;

    public Palmares() {
    }

    public Palmares(Integer idPalmares, Integer idClub, Integer idCampeonato, Date fecha) {
        this.idPalmares = idPalmares;
        this.idClub = idClub;
        this.idCampeonato = idCampeonato;
        this.fecha = fecha;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_palmares") 
    public Integer getIdPalmares() {
        return idPalmares;
    }

    public void setIdPalmares(Integer idPalmares) {
        this.idPalmares = idPalmares;
    }

    @Column(name = "id_club") 
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    @Column(name = "id_campeonato") 
    public Integer getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(Integer idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    @Column(name = "fecha") 
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
