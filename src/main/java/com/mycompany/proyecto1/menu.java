
package com.mycompany.proyecto1;

import java.util.Scanner;

public class menu {
     Scanner leer = new Scanner(System.in);
  
    
    public menu(){
    
    }
    
//    logica del juego
    public void menu(){
        
                 
        menus menuPrincipal =new menus();
        menuPrincipal.menuPrincipal();
         int opcion = 0;
    
       
        if (opcion==1) {
            menuPrincipal.menuSecundario( );
        } else if (opcion ==2 ){
                System.out.println(" PAra poder ingfresar debe de aceptar los termino y condiciones ");
                menuPrincipal.menuPrincipal();
                }
            
            
        
    }

    


    }

    
    
        
    

