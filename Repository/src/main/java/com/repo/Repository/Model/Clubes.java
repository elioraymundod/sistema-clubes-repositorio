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
@Table(name = "clubes")
public class Clubes implements java.io.Serializable{
    private Integer idClub;
    private String nombreClub;
    private String direccion;
    private String provincia;
    private String colores;
    private String anioFundacion;
    private Double presupuesto;
    private String presidente;
    private String vicePresidente;

    public Clubes() {
    }

    public Clubes(Integer idClub, String nombreClub, String direccion, String provincia, String colores, String anioFundacion, Double presupuesto, String presidente, String vicePresidente) {
        this.idClub = idClub;
        this.nombreClub = nombreClub;
        this.direccion = direccion;
        this.provincia = provincia;
        this.colores = colores;
        this.anioFundacion = anioFundacion;
        this.presupuesto = presupuesto;
        this.presidente = presidente;
        this.vicePresidente = vicePresidente;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_club") 
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    @Column(name = "nombre_club") 
    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    @Column(name = "direccion") 
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name = "provincia") 
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Column(name = "colores") 
    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    @Column(name = "anio_fundacion") 
    public String getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(String anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    @Column(name = "presupuesto") 
    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Column(name = "presidente") 
    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    @Column(name = "vice_presidente") 
    public String getVicePresidente() {
        return vicePresidente;
    }

    public void setVicePresidente(String vicePresidente) {
        this.vicePresidente = vicePresidente;
    }
    
    
    
}
