/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;


 
public class Automovil {
    private int motor;
    private String color;
    private  float calidadLlanta;
    
    //agregamos todos los datos para que solo sean llamdos desde esta clase 
    public Automovil(int _motor, String _color, float _calidadLlanta ){
        this.motor = _motor = 4;
        this.color = _color;
        this.calidadLlanta = _calidadLlanta = 2;
    }

    // sus respectivos get par que nos pueda servir en cualquier momento 
    public int getMotor() {
        return motor;
    }

    public String getColor() {
        return color;
    }

    public float getCalidadLlanta() {
        return calidadLlanta;
    }
    
    
    
    
}
