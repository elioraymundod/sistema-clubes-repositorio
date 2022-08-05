/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo.Repository.Controllers;

import com.repo.Repository.Model.Jugadores;
import com.repo.Repository.Projections.JugadoresProjection;
import com.repo.Repository.Services.JugadoresService;
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
@RequestMapping(value = "jugadores")
public class JugadoresController {

    @Autowired
    private JugadoresService jugadoresService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<JugadoresProjection>> getAllJugadores() {
        List<JugadoresProjection> lista = jugadoresService.getAllJugadores();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PostMapping(value = "/crear/jugador")
    public ResponseEntity<Jugadores> crearPais(@RequestBody Jugadores pJugador) {
        Jugadores jugador = jugadoresService.createPais(pJugador);
        return ResponseEntity.status(HttpStatus.OK).body(jugador);
    }

    @GetMapping(value = "/nombre/{pNombre}")
    public ResponseEntity<List<JugadoresProjection>> getJugadorByNombre(
            @PathVariable String pNombre
    ) {
        List<JugadoresProjection> lista = jugadoresService.getJugadorByNombre(pNombre);
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
}
