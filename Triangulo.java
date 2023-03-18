/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad2;

public class Triangulo {
    public double Cmbase;
    public double Cmaltura;
    public double Cmhipotenusa;  
    
    Triangulo(double Cmbase, double Cmaltura){
        this.Cmaltura = Cmaltura;
        this.Cmbase = Cmbase;        
    }
    
    public double hipotenusaTriangulo(){
    return Math.sqrt(Math.pow(Cmbase, 2)  + Math.pow(Cmaltura, 2));        
    }
        
    
    public double areaTriangulo(){
        return (Cmbase * Cmaltura)/2;        
    }

    
    public double perimetroTriangulo(){
        return Cmbase + Cmaltura + hipotenusaTriangulo();        
    }
    public String tipoTriangulo(){
        if (Cmbase == Cmaltura && Cmaltura == Cmhipotenusa){
            return "Equilatero";
        }else if((Cmbase != Cmaltura) && (Cmaltura != Cmhipotenusa) && (Cmhipotenusa != Cmaltura )){
            return "Escaleno";
        }else{
             return "Isóceles";      
    }
    }
}
