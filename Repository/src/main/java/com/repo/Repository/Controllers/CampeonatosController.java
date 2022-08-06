/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Controllers;

import com.repo.Repository.Model.Campeonatos;
import com.repo.Repository.Model.Paises;
import com.repo.Repository.Services.CampeonatosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Elio Raymundo
 */
@RestController
@RequestMapping(value= "campeonatos")
public class CampeonatosController {
    @Autowired
    private CampeonatosService campeonatosService;
    
    @PostMapping(value = "/crear/campeonato")
    public ResponseEntity<Campeonatos> crearCampeonato(@RequestBody Campeonatos pCampeonato) {
        Campeonatos campeonato = campeonatosService.createCampeonato(pCampeonato);
        return ResponseEntity.status(HttpStatus.OK).body(campeonato);
    }  
    
    @GetMapping(value = "/all")
    public ResponseEntity<List<Campeonatos>> getAllCampeonatos() {
        List<Campeonatos> lista = campeonatosService.getAllCampeonatos();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }  
}
