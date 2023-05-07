package com.argProg.portfolio.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.argProg.portfolio.dtos.HabilidadDTO;
import com.argProg.portfolio.model.Habilidades;
import com.argProg.portfolio.services.HabilidadesService;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
    @Autowired
    private HabilidadesService habilidadesSvc;

    //Get a List of Educaciones in DB
    @GetMapping
    public ArrayList<Habilidades> getHabilidades(){
        return this.habilidadesSvc.getHabilidades();
    }

    //Save a new Habilidad in DB
    @PostMapping
    public Habilidades saveHabilidad(@RequestBody Habilidades hab){
        return this.habilidadesSvc.saveHabilidades(hab);
    }

    //Get a Habilidad by id
    @GetMapping (path = ("/{id}"))
    public Optional<Habilidades> getHabilidadById(@PathVariable Long id){
        return this.habilidadesSvc.getById(id);
    }

    //Update a Habilidad
    @PutMapping(path = ("/update/{id}"))
    public Habilidades updateHabilidad(@RequestBody HabilidadDTO habDTO, @PathVariable Long id){
        
        return this.habilidadesSvc.updateHabilidades(habDTO, id);
    }

    //Delete a Habilidad
    @DeleteMapping(path = ("/delete/{id}"))
    public String deleteHabilidad(@PathVariable Long id){
        boolean ok = this.habilidadesSvc.deleteHabilidad(id);

        if(ok){
            return "Persona con id " + id + " fue borrado";
        } else {
            return "Error. No se pudo eliminar la persona con " + id;
        }
    }   

}
