/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;
        
public class Ejercicio_ClasesSobreFigurasGeometricas {

    public static void main(String[] args) {
        double CA, CP, RA, RP, CUA, CUP, TA, TP;
        double CR, RB, RAA, CL, TL, TB, TH;
        Scanner a = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del círculo");
        CR = a.nextDouble();       
        Circulo circulix = new Circulo(CR);        
        CA = circulix.areaCirculo();
        CP = circulix.perimetroCirculo();
        
        System.out.println("Ingrese la base del rectángulo");
        RB = a.nextDouble();       
        System.out.println("Ingrese la altura del rectángulo");
        RAA = a.nextDouble();       
        Rectangulo rectangulix = new Rectangulo(RB, RAA);        
        RA = rectangulix.areaRectangulo();
        RP = rectangulix.perimetroRectangulo();
        
        System.out.println("Ingrese el lado del cuadrado");
        CL = a.nextDouble();       
        Cuadrado cuadradix = new Cuadrado(CL);        
        CUA = cuadradix.areaCuadrado();
        CUP = cuadradix.perimetroCuadrado();
        
        System.out.println("Ingrese la base del triángulo");
        TB = a.nextDouble();       
        System.out.println("Ingrese la altura del triángulo");
        TL = a.nextDouble();      
        Triangulo triangulix = new Triangulo(TB, TL);        
        TA = triangulix.areaTriangulo();
        TP = triangulix.perimetroTriangulo();
        String tipoT = triangulix.tipoTriangulo();

        System.out.println("El área del círculo de radio " + CR + " es: " + CA + ". Y su perímetro: "
        + CP);
        System.out.println("El área del rectángulo de base " + RB + " y altura " + RAA + " es: " + RA +
        ". Y su perímetro: " + RP);
        System.out.println("El área del cuadrado de lado " + CL + " es: " + CUA +
        ". Y su perímetro: " + CUP);
        System.out.println("El área del triangulo de base " + TB + " y altura " + TL + " es: " + TA +
        ". Y su perímetro: " + TP + ". Además es un triángulo " + tipoT);
    }
    
}
