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

import com.argProg.portfolio.dtos.EducacionDTO;
import com.argProg.portfolio.model.Educacion;
import com.argProg.portfolio.services.EducacionService;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
    @Autowired
    private EducacionService educacionSvc;

    //Getting a List of Educaciones in DB
    @GetMapping
    public ArrayList<Educacion> getEducaciones(){
        return this.educacionSvc.getEducaciones();
    }

     //Save a new Educacion in DB
     @PostMapping
     public Educacion saveEducacion(@RequestBody Educacion ed){
         return this.educacionSvc.saveEducacion(ed);
     }

     //Get a Educacion by id
    @GetMapping (path = ("/{id}"))
    public Optional<Educacion> getPersonaById(@PathVariable Long id){
        return this.educacionSvc.getById(id);
    }

     //Update a Educacion
     @PutMapping(path = ("/update/{id}"))
     public Educacion upEducacion(@RequestBody EducacionDTO edDTO, @PathVariable Long id){
         
         return this.educacionSvc.updateEducacion(edDTO, id);
     }

      //Delete a Educacion
    @DeleteMapping(path = ("/delete/{id}"))
    public String deleteEducacion(@PathVariable Long id){
        boolean ok = this.educacionSvc.deleteEducacion(id);

        if(ok){
            return "Educacion con id " + id + " fue borrado";
        } else {
            return "Error. No se pudo eliminar educacion con " + id;
        }
    }   
}
