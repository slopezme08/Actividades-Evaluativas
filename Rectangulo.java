/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad2;

public class Rectangulo {
    public double Cmbase;
    public double Cmaltura;
    
    Rectangulo(double Cmbase, double Cmaltura){
        this.Cmbase = Cmbase;
        this.Cmaltura = Cmaltura;
    }
    public double areaRectangulo(){
        return Cmbase * Cmaltura;        
    }
    public double perimetroRectangulo(){
        return (2*Cmbase)+ (2*Cmaltura);        
    }
}
