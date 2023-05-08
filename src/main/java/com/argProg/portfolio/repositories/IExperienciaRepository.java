package com.argProg.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argProg.portfolio.model.Experiencia;

public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
