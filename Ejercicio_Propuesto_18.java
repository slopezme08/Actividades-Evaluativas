/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 *
Se tiene la siguiente información de un empleado:
· código del empleado,  
· nombres,  
· número de horas trabajadas al mes,  
· valor hora trabajada,  
· porcentaje de retención en la fuente. 
Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
*/

package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;
         
public class Ejercicio_Propuesto_18 {

    public static void main(String[] args) {
        
         Scanner inut = new Scanner(System.in);   
         
         System.out.println("Ingrese Código del Empleado");
         String code = inut.nextLine();
         
         System.out.println("Ingrese Nombres del Empleado");
         String name = inut.nextLine();
         
         System.out.println("Ingrese Número de Horas Trabajadas por el Emleado");
         int ho = inut.nextInt();
         
         System.out.println("Ingrese el Valor por Hora Trabajada por el Empleado");
         float pre = inut.nextFloat();
         
         System.out.println("Ingrese el Porcentaje de Retención en la Fuente");
         float rete = inut.nextFloat();
         
         float sala = ho * pre;
         double sale = sala *(1 - (rete / 100));
         
         System.out.println("El empleado " + name + ", identificado con el código: " + code + ". Por sus horas trabajadas recibe un salario bruto de " + sala + " y un salario neto de " + sale + " por sus retenciones en la fuente");
}
}
