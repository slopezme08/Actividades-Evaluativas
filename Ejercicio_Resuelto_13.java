/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la compra total, 
según el color de la bolita que el cliente saque al pagar en caja. Si la bolita es blanca no se le hará 
descuento alguno, si es verde se le hará un 10% de descuento, si es amarilla un 25%, si es azul un  50% 
y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un cliente deberá pagar por 
su compra. Se sabe que sólo hay bolitas de los colores mencionados
*/
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;

public class Ejercicio_Resuelto_13 {

    public static void main(String[] args) {
        Scanner bol = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la compra");
        double pre = bol.nextDouble();
        
        System.out.println("Ingrese el color de la bola seleccionada en mayúsculas");
        String bola = bol.next();
        
        double sal;
        
        switch(bola){
            case "VERDE":
                sal = pre * 0.9;
                break;
            
            case "AMARILLA":
                sal = pre*0.75;
                break;
            
            case "AZUL":
                sal = pre*0.5;
                break;
            
            case "ROJA":
                sal = 0;
                break;
            
            default:
                sal = pre;
            }
        
        System.out.println("El total del valor a pagar es " + sal);
    }    
}

