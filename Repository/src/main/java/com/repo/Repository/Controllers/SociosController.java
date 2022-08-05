/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Controllers;

import com.repo.Repository.Model.Paises;
import com.repo.Repository.Model.Socios;
import com.repo.Repository.Projections.SociosProjection;
import com.repo.Repository.Services.PaisesService;
import com.repo.Repository.Services.SociosService;
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
@RequestMapping(value= "socios")
public class SociosController {
    
    @Autowired
    private SociosService sociosService;
    
    @PostMapping(value = "/crear/socio")
    public ResponseEntity<Socios> crearSocio(@RequestBody Socios pSocio) {
        Socios socio = sociosService.createSocio(pSocio);
        return ResponseEntity.status(HttpStatus.OK).body(socio);
    }  
    
    @GetMapping(value = "/all")
    public ResponseEntity<List<SociosProjection>> getAllSocios() {
        List<SociosProjection> lista = sociosService.getAllSocios();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }    
    
}
