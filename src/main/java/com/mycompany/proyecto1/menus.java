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
public class menus {
    Scanner leer= new Scanner(System.in);
    
    public menus(){}
    
    public void menuPrincipal(){
        System.out.println("[1]     Aceptar terminos y condiciones antes de comenzar a jugar ");
        System.out.println("[2]     salir...?");
        int opcion=leer.nextInt();
        
        if(opcion==1){
           menuSecundario();
        }
        else if (opcion==2){
        menuPrincipal();
        }
        
        
    }
    datosDeJugadores jugador1=new datosDeJugadores();
    public void menuSecundario(){
        
        Utils utils = new Utils();
        utils.autosPorDefecto();
        
        int opcionAuto = 0;
        
        //Pidiendo datos del jugador 
         
        System.out.println("Bienvenido a nuestros juegos ");
        System.out.println("Nombre del jugador");
        String nombre=leer.next();
        System.out.println("Edad");
        int edad=leer.nextInt();
        System.out.println("Ingrese nickname");
        String nickname=leer.next();
        
        jugador1.datosDeJugadores(nombre, nickname, edad, edad);
        System.out.println(" el usuario es: "+this.jugador1.nombre);
        System.out.println("y su sobre nombre es: "+this.jugador1.nickname);
        System.out.println("sus Monedas de oro son : "+this.jugador1.monedasOro);
        System.out.println("Y Sus gemas son : "+this.jugador1.gemas);
        
        do {    
            
            Automovil auto1 = utils.getAuto(0);
            System.out.println("***************************************************");
            System.out.println("[1].  Auto: 1" + auto1.getColor() );
            System.out.println("[2].  Auto: 2" + utils.getAuto(1).getColor() );
            System.out.println("[3].  Auto: 2" + utils.getAuto(2).getColor() );
            System.out.println("***************************************************");
          
            opcionAuto = leer.nextInt();
            
        } while (opcionAuto <= 0 || opcionAuto > 3);
        
        // Auto elegido
        Automovil autoElegido = utils.getAuto(opcionAuto - 1);
        jugador1.setAuto(autoElegido);
        
        System.out.println("************************************");
        System.out.println("1 ----- Menu Principal ");
        System.out.println("2-------salir");
        int opcion=leer.nextInt();
        if (opcion==1) {
             opcionesMenu();
            
        }else if(opcion==2){
            System.out.println("Gracias por jugar con nosotros!");
        }
        
        
        
        
        
    
    }
    public void opcionesMenu(){
        System.out.println("BIenvenido a el Meni Principal ");
        System.out.println("Seleccione una accion al realizar ");
        System.out.println("[1]-------------------COMPETIR ");
        System.out.println("[2]-------------------RULETA");
        System.out.println("[3]-------------------GARAGE ");
        System.out.println("[4]-------------------PISTAS ");
        System.out.println("[5]-------------------Estadisticas y reportes  ");
        System.out.println("[6]-------------------salir ");
    
            int opcion =leer.nextInt();
            switch(opcion){
            
                case 1:
                    competir comp = new competir();
                    comp.opcionCompetir();
                    break;
                    
                case 2:
                    ruleta ruleta= new ruleta();
                    ruleta.ruleta();
                    
            case 3:
                garage garage1= new garage(jugador1);
                garage1.opcionGarage();
                break;
                
                
    
    
}
    }
}
   
