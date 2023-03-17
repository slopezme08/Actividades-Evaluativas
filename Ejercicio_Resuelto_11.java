/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
  Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ello
*/
package com.mycompany.ejercicios_resueltos_actividad2;
import java.util.Scanner;

public class Ejercicio_Resuelto_11 {

    public static void main(String[] args) {
       double uno, dos, tres, mayor;
       Scanner a = new Scanner(System.in);
       System.out.println("Ingrese el primer número");
       uno = a.nextDouble();
       
       System.out.println("Ingrese el segundo número");
       dos = a.nextDouble();
       
       System.out.println("Ingrese el tercer número");
       tres = a.nextDouble();
       
       mayor = uno;
       
       if(dos > mayor || tres > mayor){
        if (dos > tres){
            mayor = dos;
        }
        else{
            mayor = tres;
        }     
       }
       System.out.println("El mayor de los tres números es " + mayor);
    }   
}