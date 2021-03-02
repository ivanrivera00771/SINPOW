/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import java.util.Random;


public class Utils {
    
    private final Automovil[] autosPredeterminados;
    private final datosDeJugadores[] competidores;
    
    public Utils(){
        autosPredeterminados = new Automovil[3];
        this.competidores = new datosDeJugadores[4];
    }
    
    public void autosPorDefecto(){
    
        Automovil auto1   = new  Automovil(1, "Verde", (float) 2.5);
        Automovil auto2   = new  Automovil(2, "Azul", (float) 2.6);
        Automovil auto3   = new  Automovil(6, "Rojo", (float) 3.8);
        
        autosPredeterminados[0] = auto1;
        autosPredeterminados[1] = auto2;
        autosPredeterminados[2] = auto3;
    }
    
    public Automovil getAuto(int index){
        
        if(index > 3){
            return  null;
        }
        
        return autosPredeterminados[index];
    }
    
    public void competidores(){
        String da[] = {"Andres","Juann","Pedro","Lopez"};
        Random rand = new Random();
        int numero;
        int numer1;
         numero= rand.nextInt(da.length);
         numer1= rand.nextInt(da.length);
        
        datosDeJugadores competidor1 = new datosDeJugadores();
//        competidor1.datosDeJugadores(da[numero], da[numer1]);
        System.out.println(da[numero]+ ", "+ da[numer1]);
        
        numero= rand.nextInt(da.length);
        numer1= rand.nextInt(da.length);
        datosDeJugadores competidor2 = new datosDeJugadores();
//        competidor2.datosDeJugadores(da[numero], da[numer1]);
        System.out.println(da[numero]+ ", "+ da[numer1]);
        
        numero= rand.nextInt(da.length);
        numer1= rand.nextInt(da.length);
        datosDeJugadores competidor3 = new datosDeJugadores();
//        competidor3.datosDeJugadores(da[numero], da[numer1]);
        System.out.println(da[numero]+ ", "+ da[numer1]);
        
        numero= rand.nextInt(da.length);
        numer1= rand.nextInt(da.length);
        datosDeJugadores competidor4 = new datosDeJugadores();
//        competidor4.datosDeJugadores(da[numero], da[numer1]);
        
        System.out.println(da[numero]+ ", "+ da[numer1]);
        
       this.competidores[0] = competidor1;
       this.competidores[1] = competidor2;
       this.competidores[2] = competidor3;
       this.competidores[3] = competidor4;
    }
    
     public datosDeJugadores getCompetidor(){
        
        Random rand = new Random();
        int num = rand.nextInt(this.competidores.length);
        return this.competidores[num];
    }
    
    
}
