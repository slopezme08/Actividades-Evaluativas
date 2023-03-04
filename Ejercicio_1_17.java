/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicios_Actividad_1;
import java.util.Scanner;

public class Ejercicio_1_17 {

    public static void main(String[] args) {
       double r, a, c;
       
       System.out.println("Ingrese el radio del círculo");
       Scanner re = new Scanner(System.in);
       r = re.nextDouble();
       
       a = Math.pow(r, 2) * Math.PI;
       c = 2 * Math.PI * r;
       
       System.out.println("El área del circulo de radio " + r + " es " + a);
       System.out.println("La circunferencia del circulo de radio " + r + " es " + c);
    }
    
}
