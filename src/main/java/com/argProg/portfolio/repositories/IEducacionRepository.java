package com.argProg.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argProg.portfolio.model.Educacion;

public interface IEducacionRepository extends JpaRepository<Educacion, Long> {
    
}
