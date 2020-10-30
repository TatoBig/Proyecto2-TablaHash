/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablahash;

/**
 *
 * @author Tato
 */
public class TablaHash {
    public Nodo[] tabla;
    public int maximo = 0;
    
    public TablaHash(int tope){
        maximo = tope;
        tabla = new Nodo[maximo];
        for (int i=0; i<maximo; i++)
        {
            tabla[i] = new Nodo();
        }
            
    }
    
    public int HashPorID(int valor){
        return ((valor + 1) % maximo);
    }
    
    public int HashPorNombre(String Nombre){
        int[] nombre2=new int[Nombre.length()];
        int suma=0;
            for(int i = 0; i<=Nombre.length()-1;i++){
            nombre2[i]=Nombre.charAt(i);
            suma=nombre2[i]+suma;
        }
            return (suma+1)%maximo;
    }
    
    public void insertar(String Nombre, int ID){
        int llave = this.HashPorNombre(Nombre);
        tabla[llave].llenar(Nombre, ID);
    }
    
    public int buscar(int valor){
        int llave = this.HashPorID(valor);
        if (tabla[llave].libre){
            llave = -1;
        }            
        else{
            int contador = 0;
            for (int i = 0; i < tabla[llave].valores.size(); i++) {
                if (tabla[llave].valores.get(i).getID() == valor)
                {
                    break;  
                }                    
                contador++;
            }
            if (contador == tabla[llave].valores.size())
            {
                llave = -1;
            }
        }
        return llave;
    }
    
    public void eliminar(int llave, int valor){
        tabla[llave].vaciar(valor);
    }
}

