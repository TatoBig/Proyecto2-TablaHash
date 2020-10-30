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
    
    public Pelicula (String Nombre, Integer ID){
        this.Nombre=Nombre;
        this.ID = ID;
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
