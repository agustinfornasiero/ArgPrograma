package com.argProg.portfolio.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argProg.portfolio.dtos.EducacionDTO;
import com.argProg.portfolio.model.Educacion;
import com.argProg.portfolio.repositories.IEducacionRepository;

@Service
public class EducacionService {
    @Autowired
    private IEducacionRepository _educacionRepository;

        //Getting a List of Educaciones in DB
        public ArrayList<Educacion> getEducaciones(){
            return (ArrayList<Educacion>) _educacionRepository.findAll();
        }

         //Save a new Educacion in DB
    public Educacion saveEducacion(Educacion ed) {
        return _educacionRepository.save(ed);
    }

    //Get a Educacion by id
    public Optional<Educacion> getById(Long id){
        return _educacionRepository.findById(id);
    }

    //Update a Educacion
    public Educacion updateEducacion(EducacionDTO edDto, Long id){
        Educacion  ed = _educacionRepository.findById(id).get();
        
        ed.setNombreInstitucion(edDto.getNombreInstitucion());
        ed.setTitulo(edDto.getTitulo());
        ed.setDesde(edDto.getDesde());
        ed.setHasta(edDto.getHasta());

        _educacionRepository.save(ed);

        return ed;
    }

    //Delete a Persona
    public Boolean deleteEducacion(Long id){
        try{
            _educacionRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
