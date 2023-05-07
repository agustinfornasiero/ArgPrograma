package com.argProg.portfolio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Educacion")
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NombreInstitucion", unique = false, nullable = false, length = 45)
    private String nombreInstitucion;

    @Column(name = "Titulo", unique = false, nullable = false, length = 55)
    private String titulo;

    @Column(name = "Desde", unique = false, nullable = false, length = 10)
    private String desde;

    @Column(name = "Hasta", unique = false, nullable = true, length = 10)
    private String hasta;

    //Constructor
    public Educacion(Long id, String nombreInsitucion, String titulo, String desde, String hasta) {
        this.id = id;
        this.nombreInstitucion = nombreInsitucion;
        this.titulo = titulo;
        this.desde = desde;
        this.hasta = hasta;
    }

    public Educacion(){

    }

    //#region Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreInsitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    //#endregion Getters and Setters

    

}
