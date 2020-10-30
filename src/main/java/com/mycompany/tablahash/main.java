/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablahash;

import java.util.Scanner;

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
        
        System.out.println("Ingresar tamaño de la tabla hash");
        int maximo = S.nextInt();
        TablaHash tablaH = new TablaHash(maximo);
        
        System.out.println("Programa por Santiago Navas");
        System.out.println("1. Ingresar dato");
        System.out.println("2. Buscar dato");
        System.out.println("3. Mostrar tabla");
        System.out.println("4. Eliminar dato");
        
        while (flag)
        {

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
                        tablaH.insertar(Nombre,ID);
                        break;   
                    case 2: 
                        System.out.println("Ingrese numero");
                        int buscado = S.nextInt();
                        tablaH.buscar(buscado);
                        break;   
                    case 3: 
                        for (int i = 0; i < tablaH.maximo; i++) {
                            if(tablaH.tabla[i].libre==false)
                            {
                                for (int j = 0; j < tablaH.tabla[i].valores.size(); j++) {
                                      System.out.print(tablaH.tabla[i].valores.get(j) + "   ");
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
