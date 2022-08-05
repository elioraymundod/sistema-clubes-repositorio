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
@Table(name = "estadios")
public class Estadios {
   private Integer idEstadio;
   private String nombreEstadio;
   private String direccion;
   private String provincia;
   private Double capacidad;
   private Date inaguracion;
   private String dimensiones;
   private Integer idClub;

    public Estadios() {
    }

    public Estadios(Integer idEstadio, String nombreEstadio, String direccion, String provincia, Double Capacidad, Date inaguracion, String dimensiones, Integer idClub) {
        this.idEstadio = idEstadio;
        this.nombreEstadio = nombreEstadio;
        this.direccion = direccion;
        this.provincia = provincia;
        this.capacidad = Capacidad;
        this.inaguracion = inaguracion;
        this.dimensiones = dimensiones;
        this.idClub = idClub;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estadio") 
    public Integer getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(Integer idEstadio) {
        this.idEstadio = idEstadio;
    }

    @Column(name = "nombre_estadio") 
    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
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

    @Column(name = "capacidad") 
    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double Capacidad) {
        this.capacidad = Capacidad;
    }

    @Column(name = "inaguracion")
    public Date getInaguracion() {
        return inaguracion;
    }

    public void setInaguracion(Date inaguracion) {
        this.inaguracion = inaguracion;
    }

    @Column(name = "dimensiones")
    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Column(name = "id_club")
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }
   
   
    
}
