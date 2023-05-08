package com.argProg.portfolio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Experiencia_Laboral")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Puesto", unique = false, nullable = false, length = 50)
    private String puesto;

    @Column(name = "Desde", unique = false, nullable = false, length = 10)
    private String desde;

    @Column(name = "Hasta", unique = false, nullable = true, length = 10)
    private String hasta;

    @Column(name = "Descripcion", unique = false, nullable = false, length = 100)
    private String descripcion;

    // Constructor
    public Experiencia(Long id, String puesto, String desde, String hasta, String descripcion) {
        this.id = id;
        this.puesto = puesto;
        this.desde = desde;
        this.hasta = hasta;
        this.descripcion = descripcion;
    }

    public Experiencia() {}
    
    //#region Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //#endregion Getters and Setters
}
