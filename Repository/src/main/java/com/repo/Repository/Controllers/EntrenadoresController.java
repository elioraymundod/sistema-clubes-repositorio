/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Controllers;

import com.repo.Repository.Model.Entrenadores;
import com.repo.Repository.Model.Paises;
import com.repo.Repository.Services.EntrenadoresService;
import com.repo.Repository.Services.PaisesService;
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
@RequestMapping(value= "entrenadores")
public class EntrenadoresController {
    @Autowired
    private EntrenadoresService entrenadoresService;
    
    @PostMapping(value = "/crear/entrenador")
    public ResponseEntity<Entrenadores> crearEntrenador(@RequestBody Entrenadores pEntrenador) {
        Entrenadores e = entrenadoresService.createEntrenador(pEntrenador);
        return ResponseEntity.status(HttpStatus.OK).body(e);
    }  
    
    @GetMapping(value = "/all")
    public ResponseEntity<List<Entrenadores>> getAllEntrenadores() {
        List<Entrenadores> lista = entrenadoresService.getAllEntrenadores();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }    
}
