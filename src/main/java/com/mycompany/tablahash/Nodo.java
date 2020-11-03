/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablahash;

import java.util.ArrayList;

/**
 *
 * @author Tato
 */
public class Nodo {
    
    public ArrayList<Pelicula> peliculas = new ArrayList<>();
    public boolean libre;
    
    public Nodo(){
        libre = true;
    }
    
    public void llenar(String Nombre, Integer ID, String anio, String gen){
        Pelicula Nueva = new Pelicula(Nombre,ID,emp(anio),emp(gen));
        peliculas.add(Nueva);
        libre = false;
    }    
    private String emp(String Texto){
       if(Texto=="")
       {
           return "Sin Especificar";
       }
       else
       {
           return Texto;
       }
    }
    public void vaciar(int valorAEliminar){
        for (int i = 0; i < peliculas.size(); i++) {

            if (peliculas.get(i).getID() == valorAEliminar){
                peliculas.remove(i);
                break;
            }
        }
        if (peliculas.isEmpty()){
            libre = true;
        }
    }    
}
