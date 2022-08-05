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
@Table(name = "esponsor")
public class Esponsor {
    
    private Integer idEsponsor;
    private String nombreEsponsor;
    private Integer idClub;

    public Esponsor() {
    }

    public Esponsor(Integer idEsponsor, String nombreEsponsor, Integer idClub) {
        this.idEsponsor = idEsponsor;
        this.nombreEsponsor = nombreEsponsor;
        this.idClub = idClub;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_esponsor") 
    public Integer getIdEsponsor() {
        return idEsponsor;
    }

    public void setIdEsponsor(Integer idEsponsor) {
        this.idEsponsor = idEsponsor;
    }

    @Column(name = "nombre_esponsor") 
    public String getNombreEsponsor() {
        return nombreEsponsor;
    }

    public void setNombreEsponsor(String nombreEsponsor) {
        this.nombreEsponsor = nombreEsponsor;
    }

    @Column(name = "id_club") 
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }
    
    
}
