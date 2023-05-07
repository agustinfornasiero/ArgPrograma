package com.argProg.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argProg.portfolio.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
