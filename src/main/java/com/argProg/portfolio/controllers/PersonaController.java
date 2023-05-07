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

import com.argProg.portfolio.dtos.PersonaDTO;
import com.argProg.portfolio.model.Persona;
import com.argProg.portfolio.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    
    @Autowired 
    private PersonaService personaSvc;

    //Getting a List of Personas in DB
    @GetMapping
    public ArrayList<Persona> getPersonas(){
        return this.personaSvc.getPersonas();
    }

    //Save a new Persona in DB
    @PostMapping
    public Persona savePersona(@RequestBody Persona per){
        return this.personaSvc.savePersona(per);
    }

    //Get a Persona by id
    @GetMapping (path = ("/{id}"))
    public Optional<Persona> getPersonaById(@PathVariable Long id){
        return this.personaSvc.getById(id);
    }

    //Update a Persona
    @PutMapping(path = ("/update/{id}"))
    public Persona updatePersona(@RequestBody PersonaDTO perDTO, @PathVariable Long id){
        
        return this.personaSvc.updatePersona(perDTO, id);
    }

    //Delete a Persona
    @DeleteMapping(path = ("/delete/{id}"))
    public String deletePersona(@PathVariable Long id){
        boolean ok = this.personaSvc.deletePersona(id);

        if(ok){
            return "Persona con id " + id + " fue borrado";
        } else {
            return "Error. No se pudo eliminar la persona con " + id;
        }
    }   
}
