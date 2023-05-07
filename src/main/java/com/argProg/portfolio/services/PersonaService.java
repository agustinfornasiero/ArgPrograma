package com.argProg.portfolio.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argProg.portfolio.dtos.PersonaDTO;
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

    //Get a Persona by id
    public Optional<Persona> getById(Long id){
        return _personaRepository.findById(id);
    }

    //Update a Persona
    public Persona updatePersona(PersonaDTO perDto, Long id){
        Persona  per = _personaRepository.findById(id).get();

        per.setNombre(perDto.getNombre());
        per.setApellido(perDto.getApellido());
        per.setDireccion(perDto.getApellido());
        per.setEmail(perDto.getEmail());
        per.setDireccion(perDto.getDireccion());
        per.setTelefono(perDto.getTelefono());
        per.setSobreMi(perDto.getSobreMi());

        _personaRepository.save(per);
        return per;
    }

    //Delete a Persona
    public Boolean deletePersona(Long id){
        try{
            _personaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
