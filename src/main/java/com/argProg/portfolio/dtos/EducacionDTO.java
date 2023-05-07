package com.argProg.portfolio.dtos;

public class EducacionDTO {
    private String nombreInstitucion;

    private String titulo;

    private String desde;

    private String hasta;

    public EducacionDTO(String nombreInstitucion, String titulo, String desde, String hasta) {
        this.nombreInstitucion = nombreInstitucion;
        this.titulo = titulo;
        this.desde = desde;
        this.hasta = hasta;
    }

    public EducacionDTO(){

    }

    //#region Getters and Setters
    public String getNombreInstitucion() {
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
