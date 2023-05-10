package com.argProg.portfolio.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argProg.portfolio.dtos.ExperienciaDTO;
import com.argProg.portfolio.model.Experiencia;
import com.argProg.portfolio.repositories.IExperienciaRepository;

@Service
public class ExperienciaService {
    @Autowired
    private IExperienciaRepository _experienciaRepository;

        //Getting a List of Experiencias in DB
        public ArrayList<Experiencia> getExperiencias(){
            return (ArrayList<Experiencia>) _experienciaRepository.findAll();
        }

         //Save a new Experiencia in DB
    public Experiencia saveExperiencia(Experiencia ex) {
        return _experienciaRepository.save(ex);
    }

    //Get a Experiencia by id
    public Optional<Experiencia> getById(Long id){
        return _experienciaRepository.findById(id);
    }

    //Update a Experiencia
    public Experiencia updateExperiencia(ExperienciaDTO exDto, Long id){
        Experiencia  ex = _experienciaRepository.findById(id).get();
        
        ex.setPuesto(exDto.getPuesto());
        ex.setDesde(exDto.getDesde());
        ex.setHasta(exDto.getHasta());
        ex.setDescripcion(exDto.getDescripcion());

        _experienciaRepository.save(ex);

        return ex;
    }

    //Delete a Experiencia
    public Boolean deleteExperiencia(Long id){
        try{
            _experienciaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}