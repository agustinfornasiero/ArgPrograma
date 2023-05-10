package com.argProg.portfolio.dtos;

public class ExperienciaDTO {

    private String puesto;

    private String desde;

    private String hasta;

    private String descripcion;

    // Constructor
    public ExperienciaDTO(Long id, String puesto, String desde, String hasta, String descripcion) {
        this.puesto = puesto;
        this.desde = desde;
        this.hasta = hasta;
        this.descripcion = descripcion;
    }

    public ExperienciaDTO() {}
    
    //#region Getters and Setters
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