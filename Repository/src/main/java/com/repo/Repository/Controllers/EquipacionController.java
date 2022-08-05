/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Controllers;

import com.repo.Repository.Model.Equipacion;
import com.repo.Repository.Model.Paises;
import com.repo.Repository.Services.EquipacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Elio Raymundo
 */
@RestController
@RequestMapping(value= "equipacion")
public class EquipacionController {
    
    @Autowired
    private EquipacionesService equipacionesService;
    
    @PostMapping(value = "/crear/equipacion")
    public ResponseEntity<Equipacion> crearEquipacion(@RequestBody Equipacion pEquipacion) {
        Equipacion equip = equipacionesService.createEquipacion(pEquipacion);
        return ResponseEntity.status(HttpStatus.OK).body(equip);
    }  
    
}
