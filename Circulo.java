/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad2;

public class Circulo {
    public double Cmradio;
    
    Circulo(double Cmradio){
        this.Cmradio = Cmradio;
    }
    public double areaCirculo(){
        return Math.pow(Cmradio, 2) * Math.PI;
    }
    public double perimetroCirculo(){
        return Cmradio * Math.PI * 2;
    }
}
