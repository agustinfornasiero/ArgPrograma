package com.argProg.portfolio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "Nombre", unique = false, nullable = false, length = 35)
    private String nombre;
    
    @Column (name = "Apellido", unique = false, nullable = false, length = 35)
    private String apellido;

    @Column (name = "SobreMi", unique = false, nullable = false, length = 255)
    private String sobreMi;

    @Column (name = "Email", unique = true, nullable = false, length = 45)
    private String email;

    @Column (name = "Telefono", unique = true, nullable = false, length = 20)
    private String telefono;

    @Column (name = "Direccion", unique = false, nullable = false, length = 35)
    private String direccion;

    //Constructor
    public Persona(Long id, String nombre, String apellido, String sobreMi, String email, String telefono,
            String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobreMi = sobreMi;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //#endregion Getters and Setters

    
}
