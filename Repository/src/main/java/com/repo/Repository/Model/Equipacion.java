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
@Table(name = "equipacion")
public class Equipacion {
    private Integer idEquip;
    private String enCasa;
    private String visita;
    private Integer idClub;

    public Equipacion() {
    }

    public Equipacion(Integer idEquip, String enCasa, String visita, Integer idClub) {
        this.idEquip = idEquip;
        this.enCasa = enCasa;
        this.visita = visita;
        this.idClub = idClub;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equip") 
    public Integer getIdEquip() {
        return idEquip;
    }

    public void setIdEquip(Integer idEquip) {
        this.idEquip = idEquip;
    }

    @Column(name = "en_casa") 
    public String getEnCasa() {
        return enCasa;
    }

    public void setEnCasa(String enCasa) {
        this.enCasa = enCasa;
    }

    @Column(name = "visita") 
    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    @Column(name = "id_club") 
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }
    
    
    
}
