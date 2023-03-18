/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine 
cuál es la esfera de mayor peso. 
*/
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;

public class Ejercicio_Propuesto_24 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double A, B, C, ma; 
        String le;
        
        System.out.println("ingese el peso de la esfera A");
        A = l.nextDouble();
        
        System.out.println("ingese el peso de la esfera B");
        B = l.nextDouble();
        
        System.out.println("ingese el peso de la esfera C");
        C = l.nextDouble();
        
        ma = A;
        le  = "A";
        
        if (B > A || C > A){
            if (B > C){
            ma = B;
            le = "B";
            }
            else{
            ma = C;
            le = "C";
            }
        }
        System.out.println(le+" Es la esfera de mayor peso: " + ma);        
    }    
}
