/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class competir {
    
    public competir(){
    }
    
     public void opcionCompetir(){
         Utils utils = new Utils();
         utils.competidores();
         
        Scanner leer = new Scanner (System.in);
        Random rand = new Random();
        datosDeJugadores[] competidores;
        
        
        System.out.println("OPCIONES DE COMPETIR");
        System.out.println("[1]********Aleatorio");
        System.out.println("[2]********Definir");
        System.out.println("[3]********Regresar");
        int opcion=leer.nextInt();
        
        switch(opcion){
            case 1:
                int cantidadCompetidor;
                do {                    
                    cantidadCompetidor = rand.nextInt(6+1);
                    
                } while ( cantidadCompetidor == 0);
                
                competidores = new datosDeJugadores[cantidadCompetidor];
                for(int i= 0; i <cantidadCompetidor; i++){
                    competidores[i] = utils.getCompetidor();
                    System.out.println(competidores[i].nombre);
                }
                
                break;
            case 2:
                System.out.println("Indique el número: ");
                opcion = leer.nextInt();
                
                competidores = new datosDeJugadores[opcion];
                
                for(int i= 0; i <opcion; i++){
                    competidores[i] = utils.getCompetidor();
                    System.out.println(competidores[i].nombre);
                }
                
                break;
            case 3:
                menus menuPrincipal = new menus();
            menuPrincipal.opcionesMenu();
            break;
            default:
                System.out.println("Elija una de las seguientes opciones ");
        }
        
        
     }
    
    
}
