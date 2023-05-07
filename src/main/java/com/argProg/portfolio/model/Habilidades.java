package com.argProg.portfolio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Habilidades")
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nombre", unique = false, nullable = false, length = 100)
    private String nombre;

    @Column(name = "Progreso", unique = false, length = 10)
    private String progreso;

    //Constructor
    public Habilidades(Long id, String nombre, String progreso) {
        this.id = id;
        this.nombre = nombre;
        this.progreso = progreso;
    }

    public Habilidades(){}

    //#region Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProgreso() {
        return progreso;
    }

    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }

    //#endregion Getters and Setters

    

    
}
