/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablahash;

/**
 *
 * @author aniba
 */
public class Pelicula {
    private String Nombre;
    private Integer ID;
    private String Genero;
    private String Anio;
    
    public Pelicula (String Nombre, Integer ID, String anio, String gen){
        this.Nombre=Nombre;
        this.ID = ID;
        this.Anio=anio;
        this.Genero=gen;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public Integer getID(){
        return this.ID;
    }
    public void setID(Integer ID){
        this.ID=ID;
    }
}
