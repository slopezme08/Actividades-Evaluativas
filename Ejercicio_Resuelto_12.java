/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas semanales trabajadas 
en una empresa, sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera horas extras 
y se pagan al doble de una hora normal, cuando no exceden de 8; si las horas extras exceden de 8, se pagan 
las primeras 8 al doble de lo que se paga una hora normal y el resto al triple. Del trabajador se conocen 
los siguientes datos:  nombres, número de horas trabajadas en la semana y valor recibido por una hora normal 
de trabajo. 
*/
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;

public class Ejercicio_Resuelto_12 {

    public static void main(String[] args) {
        double ho, val, sal, e, e2;
        
        Scanner ol = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador");
        String nam = ol.next();
        
        System.out.println("Ingrese las horas realizadas por el trabajador");
        ho = ol.nextDouble();
        
        System.out.println("Ingrese el valor por hora que recibe el trabajador");
        val = ol.nextDouble();
        
        e2 = ho - 48;
        e = ho - 40;
        if (ho > 40){
            if (e2 > 0){
            sal = e2*3*val + 16*val + 40*val;}
            else {           
            sal = e*2*val + 40*val;
            }
        } 
        else{
            sal = ho*val;
        }
        System.out.println("El trabajador " + nam + " debe recibir por sus horas trabajadas la cantidad de "
    + sal);
    }    
}
