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
@Table(name = "entren_clubes")
public class EntrenadoresClubes {
    private Integer idEntreClub;
    private Integer idClub;
    private Integer idEntrenador;

    public EntrenadoresClubes() {
    }

    public EntrenadoresClubes(Integer idEntreClub, Integer idClub, Integer idEntrenador) {
        this.idEntreClub = idEntreClub;
        this.idClub = idClub;
        this.idEntrenador = idEntrenador;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entre_club")
    public Integer getIdEntreClub() {
        return idEntreClub;
    }

    public void setIdEntreClub(Integer idEntreClub) {
        this.idEntreClub = idEntreClub;
    }

    @Column(name = "id_club")
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    @Column(name = "id_entrenador")
    public Integer getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(Integer idEntrenador) {
        this.idEntrenador = idEntrenador;
    }
    
    
    
}
