/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 * Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el número 
de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor de $450.000, de 
lo contrario escriba sólo el nombre
*/
package com.mycompany.ejercicios_resueltos_actividad2;
import java.util.Scanner;

public class Ejercicio_Propuesto_22 {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        double hora, salb, sale;
        
        System.out.println("Ingrese el nombre del empleado");
        String nam = t.nextLine();
        
        System.out.println("Ingrese el salario básico por hora del empleado");
        salb = t.nextDouble();
        
        System.out.println("Ingrese el número de horas trabajadas en el mer por el empleado");
        hora = t.nextDouble();
        
        sale = hora * salb;
        if (sale > 450000){
            System.out.println("Empleado: " + nam + ". Salario: " + sale);
        }
        else{
            System.out.println("Empleado: " + nam);
        }
    }    
}
