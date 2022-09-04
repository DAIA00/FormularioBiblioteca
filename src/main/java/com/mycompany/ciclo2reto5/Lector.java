/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclo2reto5;

/**
 *
 * @author DAIA
 */
public class Lector {
    
    private int codLector;
    private String identificacion;
    private String nombres;
    private String direccion;
    private String telefono;
    private int codCarrera;

    public Lector() {
    }

    public Lector(int codLector, String identificacion, String nombres, String direccion, String telefono, int codCarrera) {
        this.codLector = codLector;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codCarrera = codCarrera;
    }

    public int getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(int codCarrera) {
        this.codCarrera = codCarrera;
    }

    public int getCodLector() {
        return codLector;
    }

    public void setCodLector(int codLector) {
        this.codLector = codLector;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
