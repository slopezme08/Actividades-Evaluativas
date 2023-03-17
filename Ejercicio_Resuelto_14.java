/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
Una empresa con tres departamentos tiene establecido un plan de incentivos para sus vendedores. 
Al final del período, a cada departamento se le pide el importe global de las ventas. A los departamentos 
que excedan el 33% de las ventas totales se les adiciona al salario de los vendedores un porcentaje equivalente 
al 20% del salario mensual. Las nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos: 
• Ventas del departamento 1 
• Ventas del departamento 2 
• Ventas del departamento 3  
• Salario de los vendedores de cada departamento 
Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento al finalizar el período
*/
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;

public class Ejercicio_Resuelto_14 {

    public static void main(String[] args) {
        Scanner tol = new Scanner(System.in);
        double uno, dos, tres, sala1, sala2, sala3, trein, sala;
        
        System.out.println("Ingrese las ventas del departamento 1");
        uno = tol.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 2");
        dos = tol.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 3");
        tres = tol.nextDouble();
        
        System.out.println("Ingrese el salario de los vendedores");
        sala = tol.nextDouble();        
        
        trein = (uno + dos + tres)*33/100;
        sala1 = sala2 = sala3 = sala;             
        
        if(uno > trein){
            sala1 = sala*1.2;
        }
        if(dos > trein){
            sala2 = sala*1.2;
        }
        if(tres > trein){
            sala3 = sala*1.2;
        }
                
           System.out.println("El salario correspondiente a los departamentos 1, 2 y 3 es: " 
                   + sala1 + ", " + sala2 + " y " + sala3 + " en el mismo orden");
    } 
}