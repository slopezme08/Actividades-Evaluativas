/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado, 
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación
*/
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;

public class Ejercicio_Propuesto_23 {

    public static void main(String[] args) {
        
        Scanner u = new Scanner(System.in);
        double A, B, C, x1 = 0, x2 = 0, dis;
        System.out.println("Ingrese el valor de A");
        A = u.nextDouble();
        
        System.out.println("Ingrese el valor de B");
        B = u.nextDouble();
        
        System.out.println("Ingrese el valor de C");
        C = u.nextDouble();
        
        dis = Math.pow(B, 2) - (4*A*C);
        if(dis >= 0){
            x1 = (-B + Math.sqrt(dis))/(2*A);
            x2 = (-B - Math.sqrt(dis))/(2*A);
        }
        else{
        System.out.println("La ecuación no tiene soluciones");
        }
        
        if (x1 != x2){
            System.out.println("La ecuación tiene dos soluciones: " + x1 + " y " + x2);
        }
        else{
            System.out.println("La solución de la ecuación es 0");
        }
           
    }    
}

