/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el perímetro, 
el valor de la altura y el área del triángulo
*/
package com.mycompany.ejercicios_resueltos_actividad2;
import java.util.Scanner;

public class Ejercicio_Propuesta_19 {

    public static void main(String[] args) {
        Scanner ele = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del lado del triángulo equilatero");
        double lao = ele.nextDouble();
        
        double peri, alt, are, va;
        peri = lao * 3;
        va = lao / 2;
        alt = Math.sqrt(Math.pow(lao, 2) -  Math.pow(va, 2));
        are = alt * lao / 2;
        
        System.out.println("Del triángulo equilatero con lado: " + lao + 
                ". Podemos deducir su perimetro " + peri + ", su altura " + alt + " y su área " + are);
        
    }
    
}
