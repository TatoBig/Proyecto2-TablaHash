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
    
    public ArrayList<Pelicula> valores = new ArrayList<>();
    public boolean libre;
    
    public Nodo(){
        libre = true;
    }
    
    public void llenar(String Nombre, Integer ID){
        Pelicula Nueva = new Pelicula(Nombre,ID);
        valores.add(Nueva);
        libre = false;
    }    
    public void vaciar(int valorAEliminar){
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i).getID() == valorAEliminar){
                valores.remove(i);
                break;
            }
        }
        if (valores.isEmpty()){
            libre = true;
        }            
    }    
}
