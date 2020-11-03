/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablahash;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Tato
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
        int opcion = 0;
        boolean flag;
        flag = true;
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.ERROR_MESSAGE);
        System.out.println("Ingresar tamaño de la tabla hash");
        int maximo = S.nextInt();
        TablaHash tablaH = new TablaHash(maximo);
        
        
        
        while (flag)
        {
        System.out.println("\n\nPrograma por Santiago Navas");
        System.out.println("1. Ingresar dato");
        System.out.println("2. Buscar dato");
        System.out.println("3. Mostrar tabla");
        System.out.println("4. Eliminar dato");
            System.out.println("5. Salir");
            System.out.println("Seleccionar opcion::");
            opcion = S.nextInt();
            if (opcion == 5) {             
                System.exit(0);
                flag = false;
                break;
            } else {
                switch (opcion) {
                    case 1: 
                        System.out.println("Ingrese Nombre de la pelicula");
                        String Nombre = S.next();
                        System.out.println("Ingrese ID de la pelicula");
                        Integer ID = S.nextInt();
                        System.out.println("1. Año y Genero\n2. Solo Año\n3. Solo Genero\n4. Ninguno");
                        opcion=S.nextInt();
                        if(opcion==1)
                        {
                            System.out.println("Ingrese Año de la pelicula");
                            String anio = S.next();
                            System.out.println("Ingrese Genero de la pelicula");
                        String gen = S.next();
                        tablaH.insertar(Nombre,ID,anio,gen);
                        }
                        else if(opcion==2)
                        {
                              System.out.println("Ingrese Año de la pelicula");
                            String anio = S.next();
                            tablaH.insertar(Nombre,ID,anio,"");
                        }
                        else if(opcion==3)
                        {
                            System.out.println("Ingrese Genero de la pelicula");
                            String gen = S.next();
                            tablaH.insertar(Nombre,ID,"",gen);
                        }
                        else
                        {
                            tablaH.insertar(Nombre,ID,"","");
                        }
                        break;   
                    case 2: 
                        System.out.println("Ingrese numero");
                        int buscado = S.nextInt();
                        System.out.println("");
                        for (int i = 0; i < tablaH.getMaximo(); i++) {
                            if(tablaH.tabla[i].libre==false)
                            {
                                for (int j = 0; j < tablaH.tabla[i].peliculas.size(); j++) {
                                    if(buscado==tablaH.tabla[i].peliculas.get(j).getID()){
                                    System.out.println(tablaH.tabla[i].peliculas.get(j).getID()+"     "+tablaH.tabla[i].peliculas.get(j).getNombre()+"\n"+tablaH.tabla[i].peliculas.get(j).getGenero()+"\n"+tablaH.tabla[i].peliculas.get(j).getAnio());
                                }
                                }
                            }
                        }
                        break;   
                    case 3: 
                        int a=1;
                        for (int i = 0; i < tablaH.getMaximo(); i++) {
                            if(tablaH.tabla[i].libre==false)
                            {
                                System.out.println("#"+(a++)+"");  
                                for (int j = 0; j < tablaH.tabla[i].peliculas.size(); j++) {
                                    System.out.println(tablaH.tabla[i].peliculas.get(j).getID()+"     "+tablaH.tabla[i].peliculas.get(j).getNombre()+"\n"+tablaH.tabla[i].peliculas.get(j).getGenero()+"\n"+tablaH.tabla[i].peliculas.get(j).getAnio());
                                }
                                System.out.println("");
                            }
                            else{
                                System.out.println("0");
                            }
                        }
                        break;   
                    case 4: 
                        System.out.println("Ingrese numero");
                        int eliminar = S.nextInt();
                        tablaH.eliminar(tablaH.HashPorID(eliminar),eliminar);
                        break;   
                    default: 
                        System.out.println("\nError\n");
                        break;
                }
            }
        }
    }    
}
