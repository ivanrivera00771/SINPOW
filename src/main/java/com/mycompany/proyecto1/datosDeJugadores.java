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
public class datosDeJugadores {
    Scanner leer = new Scanner(System.in);
    int edad=0;
    String nombre;
    String nickname;
    private final Automovil[] autos;
    private int index = 0;
    int monedasOro=0;
    int gemas=0;
    
    public datosDeJugadores(){
        autos = new Automovil[6];
    }
    
    public void datosDeJugadores(String nombre,String nickname, int monedasOro, int gemas){
        this.edad=0;
        this.nombre=nombre;
        this.nickname=nickname;
        this.monedasOro= 50;
        this.gemas= 30;
                
    }
    
    public void setAuto(Automovil _auto){
    
        if( index > 6 ){
            System.out.println("Ya has llegado al límite de autos deportivos");
            return;
        }
        autos[index] = _auto;
        index += 1;
        System.out.println("Ya tinies un nuevo auto ");
    }
    
    public Automovil[] getAutos(){ return this.autos; }
    
    public int getIndexCarro(){ return this.index; }
    
    public void mostrarAutos(){
    
        for( int i = 0; i< 6; i++){
            
            if( autos[i] != null ){
                System.out.println("Motor: "+autos[i].getMotor()+ " color: "+autos[i].getColor());
            }
            
        }
    }
    
    public void AgregarCarro(){
          if(gemas>=25){
              System.out.println("Execelente puedec comprar un carro nuevo");
            }
            
        int opcion = 0 ;
        System.out.println("Desea comprar un nuevo vehiculo"+nickname);
        System.out.println("[1]-----Si");
        System.out.println("[2]-----No");
        
        if (opcion == 1) {
            System.out.println("BIENVENIDO TE OFRECEMOS ESTOS CARROS ");
            
            
            
            
          
        } else {
            menus menuPrincipal = new menus();
            menuPrincipal.opcionesMenu();
        }
    }
    
}
