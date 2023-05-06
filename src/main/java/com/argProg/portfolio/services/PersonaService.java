package com.argProg.portfolio.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argProg.portfolio.model.Persona;
import com.argProg.portfolio.repositories.IPersonaRepository;

@Service
public class PersonaService {
    @Autowired IPersonaRepository _personaRepository;

    //Getting a List of Personas in DB
    public ArrayList<Persona> getPersonas(){
        return (ArrayList<Persona>) _personaRepository.findAll();
    }
    
    
    //Save a new Persona in DB
    public Persona savePersona(Persona per) {
        return _personaRepository.save(per);
    }
}
