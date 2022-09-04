/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclo2reto5;

/**
 *
 * @author DAIA
 */
public class Carrera {
    
    private int codCarrera;
    private String nombre;

    public Carrera() {
    }

    public Carrera(int codCarrera, String nombre) {
        this.codCarrera = codCarrera;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(int codCarrera) {
        this.codCarrera = codCarrera;
    }
    
    @Override
    public String toString (){
        return getNombre();
    }
    
}
