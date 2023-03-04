/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicios_Actividad_1;
import java.util.Scanner;

public class Ejercicio_1_14 {

    public static void main(String[] args) {
        double n, n1, n2;
        
        System.out.println("Ingrese el número a calcular");
        Scanner re = new Scanner(System.in);
        n = re.nextFloat();
        
        n1 = Math.pow(n, 2); 
        n2 = Math.pow(n, 3);
        
        System.out.println("El cuadrado del número ingresado es: " + n1);
        System.out.println("El cubo del número ingresado es: " + n2);
    }
    
}
