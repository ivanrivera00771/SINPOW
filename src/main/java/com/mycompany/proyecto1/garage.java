/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class garage {
    Scanner leer = new Scanner (System.in);
    datosDeJugadores jugador;
    private final Automovil[] autos;
    private int indexCarro = -1;
    
    
    public garage(datosDeJugadores _jugador){
        this.jugador = _jugador;
        this.autos = _jugador.getAutos();
        this.indexCarro = _jugador.getIndexCarro();
    
    }
    
    
    public void opcionGarage(){
        System.out.println("Bienvenido: *" +jugador.nombre + " *\n\n");
        
        System.out.println("OPCIONES DE GARAGE");
        System.out.println("[1]********Llenar tanque ");
        System.out.println("[2]********Crear Vehiculo ");
        System.out.println("[3]********Modificar Vehiculo ");
        System.out.println("[3]********Modificar Vehiculo ");
        System.out.println("[4]********Regresar al Menu");
        int opcion=leer.nextInt();
        
        
        
        switch(opcion){
            case 1:
                mostrarAutos();
                opcion = leer.nextInt();
                
                if( opcion > 0 && opcion <= indexCarro ){
                    System.out.println("Tanque llenado");
                    
                }else{
                    System.out.println("El carro no existe");
                }
            break;
            case 2:
                
            break;
            case 3:
                mostrarAutos();
                opcion = leer.nextInt();
                
                if( opcion > 0 && opcion <= indexCarro ){
                    System.out.println("Carro modificado");
                    
                }else{
                    System.out.println("El carro no existe");
                
                }
            case 4:
                menus menuPrincipal = new menus();
            menuPrincipal.opcionesMenu();
            default:
                System.out.println("La opción no existe");
                break;
        
        
        
    
        }
    }
    
    private void mostrarAutos(){
           int i = 0;
        while(i < indexCarro){
            System.out.println("["+(i+1)+"]"+ "  Motor: "+autos[i].getMotor() + " Color: "+autos[i].getColor());
            i++;
        }
        
        
        
        
    }
    
}
