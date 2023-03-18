/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad2;

public class Cuadrado {
    public double Cmlado;
    
    Cuadrado(double Cmlado){
        this.Cmlado = Cmlado;
    }
    
    public double areaCuadrado(){
        return Math.pow(Cmlado, 2);        
    }
    public double perimetroCuadrado(){
        return 4*Cmlado;        
    }
}
