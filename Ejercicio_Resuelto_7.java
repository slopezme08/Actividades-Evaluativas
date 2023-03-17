/*
 Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo si
A es mayor, menor o igual a B 
 */
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;

public class Ejercicio_Resuelto_7 {

    public static void main(String[] args) {
        Scanner ale = new Scanner(System.in);
        double A, B;
        
        System.out.println("Valor número A");
        A = ale.nextDouble();
        System.out.println("Valor número B");
        B = ale.nextDouble();
        
        if (A == B){
            System.out.println("A " + A + " es igual a B " + B);
        }
        else if (A > B){
            System.out.println("A " + A + " es mayor a B " + B);
        }
        else{
            System.out.println("A " + A + " es mayor a B " + B);
        }                   
    }
    
}
