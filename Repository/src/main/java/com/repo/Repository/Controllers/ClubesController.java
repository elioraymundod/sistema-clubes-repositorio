/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Controllers;

import com.repo.Repository.Model.Clubes;
import com.repo.Repository.Services.ClubesService;
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
@RequestMapping(value= "clubes")
public class ClubesController {
    
    @Autowired
    private ClubesService clubesService;
    
    @PostMapping(value = "/crear/club")
    public ResponseEntity<Clubes> crearClub(@RequestBody Clubes pClub) {
        Clubes club = clubesService.createClub(pClub);
        return ResponseEntity.status(HttpStatus.OK).body(club);
    }  
    
    @GetMapping(value = "/nombre/{pNombreClub}")
    public ResponseEntity<Clubes> getClubByNombre(
        @PathVariable String pNombreClub
    ) {
        Clubes club = clubesService.getClubByNombre(pNombreClub);
        return ResponseEntity.status(HttpStatus.OK).body(club);
    }  
    
}
