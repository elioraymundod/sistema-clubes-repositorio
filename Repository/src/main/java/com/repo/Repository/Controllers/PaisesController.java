/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Controllers;

import com.repo.Repository.Model.Paises;
import com.repo.Repository.Services.PaisesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Elio Raymundo
 */
@RestController
@RequestMapping(value= "paises")
public class PaisesController {
    
    @Autowired
    private PaisesService paisesService;
    
    @GetMapping(value = "/all")
    public ResponseEntity<List<Paises>> getAllPaises() {
        List<Paises> lista = paisesService.getAllPaises();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }    
    
    @GetMapping(value = "/nombre/{pNombrePais}")
    public ResponseEntity<Paises> getPaisByNombre(
        @PathVariable String pNombrePais
    ) {
        Paises pais = paisesService.getPaisByNombre(pNombrePais);
        return ResponseEntity.status(HttpStatus.OK).body(pais);
    }  
    
    @PostMapping(value = "/crear/pais")
    public ResponseEntity<Paises> crearPais(@RequestBody Paises pPais) {
        Paises pais = paisesService.createPais(pPais);
        return ResponseEntity.status(HttpStatus.OK).body(pais);
    }  
}
