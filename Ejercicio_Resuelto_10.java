/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los siguientes datos: 
• Número de inscripción  
• Nombres
• Patrimonio. 
• Estrato social. 
La universidad cobra un valor constante para cada estudiante de $50.000. 
Si el patrimonio es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3% 
sobre el patrimonio. Hacer un algoritmo que muestre: 
• Número de inscripción. 
• Nombres. 
• Pago de matrícula
*/
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;

public class Ejercicio_Resuelto_10 {

    public static void main(String[] args) {
        double pat, sal, bas = 50000;
        
        Scanner lau = new Scanner(System.in);
        
        System.out.println("Digite el numero de inscripción del estudiante");
        String num = lau.next();
        
          
                
        System.out.println("Digite el patrimonio del estudiante");
        pat = lau.nextDouble();
  
        
        System.out.println("Digite el estrato social del estudiante");
        int est = lau.nextInt();
                
        System.out.println("Digite el nombre del estudiante");
        String nam = lau.next();                
        
        if (pat > 2000000 && est > 3){
            sal = bas + pat*0.03;
        }
        else {
            sal = bas;
        }
        System.out.println("Al estudiante " + nam + ", identificado bajo el proceso numero de inscripción " + num
        + " le corresponde un pago de matrícula de " + sal);
    }    
}
