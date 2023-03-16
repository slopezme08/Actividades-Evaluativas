/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
 Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro, semiperímetro y el área del triángulo. 
*/
package com.mycompany.ejercicios_resueltos_actividad2;
import java.util.Scanner;

public class Ejercicio_Propuesto_21 {

    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        double uno, dos, tre, peri, semi, are;
        
        System.out.println("Ingrese lado 1 del triángulo");
        uno = el.nextDouble();
        System.out.println("Ingrese lado 2 del triángulo");
        dos = el.nextDouble();
        System.out.println("Ingrese lado 3 del triángulo");
        tre = el.nextDouble();
        
        peri = uno + dos + tre;
        semi = peri / 2;
        are = Math.sqrt(semi*(semi - uno)*(semi - dos)*(semi-tre));
        
        System.out.println("El perímetro del triángulo es " + peri + ", Su semiperímetro " + semi
        + " y su área " + are);
    }
    
}
