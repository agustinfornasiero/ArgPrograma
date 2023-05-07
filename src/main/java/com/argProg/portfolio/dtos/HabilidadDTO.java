package com.argProg.portfolio.dtos;

public class HabilidadDTO {
    private String nombre;

    private String progreso;

    public HabilidadDTO(String nombre, String progreso) {
        this.nombre = nombre;
        this.progreso = progreso;
    }

    public HabilidadDTO(){

    }

    //#region Getters and Setters
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
