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
@Table(name = "socios")
public class Socios {
    private Integer idSocio;
    private String nombreSocio;
    private String apellidoSocio;
    private String direccion;
    private String provincia;
    private String cuotaActual;
    private Integer idClub;

    public Socios() {
    }

    public Socios(Integer idSocio, String nombreSocio, String apellidoSocio, String direccion, String provincia, String cuotaActual, Integer idClub) {
        this.idSocio = idSocio;
        this.nombreSocio = nombreSocio;
        this.apellidoSocio = apellidoSocio;
        this.direccion = direccion;
        this.provincia = provincia;
        this.cuotaActual = cuotaActual;
        this.idClub = idClub;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_socio") 
    public Integer getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Integer idSocio) {
        this.idSocio = idSocio;
    }

    @Column(name = "nombre_socio") 
    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    @Column(name = "apellido_socio") 
    public String getApellidoSocio() {
        return apellidoSocio;
    }

    public void setApellidoSocio(String apellidoSocio) {
        this.apellidoSocio = apellidoSocio;
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

    @Column(name = "cuota_actual") 
    public String getCuotaActual() {
        return cuotaActual;
    }

    public void setCuotaActual(String cuotaActual) {
        this.cuotaActual = cuotaActual;
    }

    @Column(name = "id_club") 
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }
    
    
    
}
