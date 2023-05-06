package com.argProg.portfolio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
