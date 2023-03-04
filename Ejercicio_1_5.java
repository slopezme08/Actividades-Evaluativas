/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicios_Actividad_1;

/**
 *
 * @author User
 */
public class Ejercicio_1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double y, x, suma;
       suma = 0;
       x = 20;
       suma = suma + x;
       y = 40;            
       x = x + Math.pow(y, 2);
       suma = suma + (x/y);
       System.out.println("El valor de la suma es: " + suma);
       
            
    }
    
}
