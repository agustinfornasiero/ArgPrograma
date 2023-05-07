package com.argProg.portfolio.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argProg.portfolio.dtos.HabilidadDTO;
import com.argProg.portfolio.model.Habilidades;
import com.argProg.portfolio.repositories.IHabilidadesRepository;

@Service
public class HabilidadesService {
    @Autowired
    private IHabilidadesRepository _habilidadesRepository;

     //Getting a List of Habilidades in DB
     public ArrayList<Habilidades> getHabilidades(){
        return (ArrayList<Habilidades>) _habilidadesRepository.findAll();
    }
    
    //Save a new Habilidad in DB
    public Habilidades saveHabilidades(Habilidades hab) {
        return _habilidadesRepository.save(hab);
    }

    //Get a Habilidad by id
    public Optional<Habilidades> getById(Long id){
        return _habilidadesRepository.findById(id);
    }

    //Update a Habilidad
    public Habilidades updateHabilidades(HabilidadDTO habDto, Long id){
        Habilidades  hab = _habilidadesRepository.findById(id).get();

        hab.setNombre(habDto.getNombre());
        hab.setProgreso(habDto.getProgreso());

        _habilidadesRepository.save(hab);
        return hab;
    }

    //Delete a Habilidad
    public Boolean deleteHabilidad(Long id){
        try{
            _habilidadesRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
