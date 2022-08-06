/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Controllers;

import com.repo.Repository.Model.Paises;
import com.repo.Repository.Model.Palmares;
import com.repo.Repository.Projections.PalmaresProjection;
import com.repo.Repository.Services.PaisesService;
import com.repo.Repository.Services.PalmaresService;
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
@RequestMapping(value= "palmares")
public class PalmaresController {
    @Autowired
    private PalmaresService palmaresService;
    
    @PostMapping(value = "/crear/palmares")
    public ResponseEntity<Palmares> crearPalmares(@RequestBody Palmares pPalmares) {
        Palmares p = palmaresService.createPalmares(pPalmares);
        return ResponseEntity.status(HttpStatus.OK).body(p);
    }  
    
    @GetMapping(value = "/all")
    public ResponseEntity<List<PalmaresProjection>> getAllPalmares() {
        List<PalmaresProjection> lista = palmaresService.getAllPalmares();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }    
    
    
}
