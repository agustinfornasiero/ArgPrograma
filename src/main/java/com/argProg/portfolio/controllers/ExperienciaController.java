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

import com.argProg.portfolio.dtos.ExperienciaDTO;
import com.argProg.portfolio.model.Experiencia;
import com.argProg.portfolio.services.ExperienciaService;

@RestController
@RequestMapping("/Experiencia")
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaSvc;

    //Getting a List of Experiencia in DB
    @GetMapping
    public ArrayList<Experiencia> getExperiencias(){
        return this.experienciaSvc.getExperiencias();
    }

     //Save a new Experiencia in DB
     @PostMapping
     public Experiencia saveExperiencia(@RequestBody Experiencia ed){
         return this.experienciaSvc.saveExperiencia(ed);
     }

     //Get a Experiencia by id
    @GetMapping (path = ("/{id}"))
    public Optional<Experiencia> getPersonaById(@PathVariable Long id){
        return this.experienciaSvc.getById(id);
    }

     //Update a Experiencia
     @PutMapping(path = ("/update/{id}"))
     public Experiencia upExperiencia(@RequestBody ExperienciaDTO edDTO, @PathVariable Long id){
         
         return this.experienciaSvc.updateExperiencia(edDTO, id);
     }

      //Delete a Experiencia
    @DeleteMapping(path = ("/delete/{id}"))
    public String deleteExperiencia(@PathVariable Long id){
        boolean ok = this.experienciaSvc.deleteExperiencia(id);

        if(ok){
            return "Experiencia con id " + id + " fue borrada";
        } else {
            return "Error. No se pudo eliminar experiencia con " + id;
        }
    } 
}
