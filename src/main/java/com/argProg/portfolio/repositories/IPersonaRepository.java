package com.argProg.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.argProg.portfolio.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
