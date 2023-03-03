/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1_4;
import java.util.Scanner;

public class Ejercicio_1_4 {

    public static void main(String[] args) {
        int eJ, eA, eAn, eM;
        
        System.out.println("Para saber la edad de todos necesitamos la edad de Juan");
        Scanner ingreso = new Scanner(System.in);
        eJ = ingreso.nextInt();
        
        eA = eJ * 2/3;
        eAn = eJ * 4/3;
        eM = eJ + eA + eAn;
        
        System.out.println("La edad de Juan es: " + eJ);
        System.out.println("La edad de Alberto es: " + eA);
        System.out.println("La edad de Ana es: " + eAn);
        System.out.println("La edad de la Mamá es: " + eM);
    }
}
