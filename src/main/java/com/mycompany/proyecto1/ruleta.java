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
public class ruleta {
     double random;
    int opcion;
    String nombre;
String nickname;    
    datosDeJugadores datos1 = new datosDeJugadores();
     Scanner leer = new Scanner(System.in);
    
    public void ruleta(){
       
datos1.datosDeJugadores(nombre, nickname, opcion, opcion);
        
       
         
        System.out.println("\n\nNickname: " + this.datos1.nickname);
		System.out.println("Gemas: " + this.datos1.nombre);
		System.out.println("Monedas De Oro: " + this.datos1.gemas);
		System.out.println("\n__________Ruleta__________");
		System.out.println("\nPremios de la Ruleta: ");
		System.out.println("\n1. 40 Gemas");
		System.out.println("2. 75 Monedas de Oro");
		System.out.println("3. 1000 Gemas");
		System.out.println("4. 2000 Monedas de Oro");
		System.out.println("5. 5 Gemas");
		System.out.println("6. 10 Monedas de Oro");

		System.out.println("\n_____5 GEMAS POR GIRO_____");
		System.out.println("\n1. Girar");
		System.out.println("2. Regresar");
		System.out.println("\nIngrese la Opcion: ");
		opcion = leer.nextInt();

		if (this.datos1.gemas < 5) {
		    System.out.println("\n\nNo tienes Gemas Suficientes");
		    ruleta();
	        } else if (opcion != 1 && opcion != 2) {
		    System.out.println("\nValor Invalido, amigo intentalo de nuevo");

		    ruleta();
		}

		if (opcion == 1) {
		    int aleatorio;
		    int premio = 0 ;

		    aleatorio = (int) (Math.random() * 100);

		    if (aleatorio >= 0 && aleatorio < 10) {
		        premio = 1;
		    } else if (aleatorio >= 10 && aleatorio < 25) {
		        premio = 2;
            } else if (aleatorio >= 25 && aleatorio < 30) {
                premio = 3;
            } else if (aleatorio >= 30 && aleatorio < 35) {
                premio = 4;
            } else if (aleatorio >= 35 && aleatorio < 65) {
                premio = 5;
            } else if (aleatorio >= 65) {
                premio = 6;
            }

          switch (premio) {
                case 1:  {
                    System.out.println("\n\n\nFelicidades " + nickname + " Has ganado 40 Gemas"+this.datos1.gemas);
                this.datos1.gemas=this.datos1.gemas+40;
                }
                case 2 : {
                    System.out.println("\n\n\nFelicidades " + this.datos1.nickname + " Has ganado 75 Monedas de Oro");
                   this.datos1.monedasOro=this.datos1.monedasOro+75;
                }
                case 3 : {
                    System.out.println("\n\n\nFelicidades " + this.datos1.nickname + " Has ganado 1000 Gemas");
                    this.datos1.gemas=this.datos1.gemas+1000;
                }
                case 4 : {
                    System.out.println("\n\n\nFelicidades " + this.datos1.nickname + " Has ganado 2000 Monedas De Oro");
                    this.datos1.monedasOro= this.datos1.monedasOro+2000;
                }
                case 5 : {
                    System.out.println("\n\n\nFelicidades " + this.datos1.nickname + " Has ganado 5 Gemas");
                    this.datos1.gemas=this.datos1.gemas+5;
                  
                }
                case 6 : {
                    System.out.println("\n\n\nFelicidades " + this.datos1.nickname + " Has ganado 10 Monedas De Oro");
                    this.datos1.monedasOro = this.datos1.monedasOro + 10;
                }
                default : {
                    
                }

            }
            this.datos1.gemas = this.datos1.gemas - 5;
            
    
    
    }

                System.out.println("premios ganardos para "+this.datos1.nickname);
                System.out.println("las momedas son "+this.datos1.monedasOro);
                System.out.println("las gemas son "+this.datos1.gemas);
                menus menuPrincipal = new menus();
            menuPrincipal.opcionesMenu();
    }
    
    
    
}
