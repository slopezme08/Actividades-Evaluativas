/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una diferente. 
Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor o menor peso
*/
package com.mycompany.ejercicios_resueltos_actividad2;

import java.util.Scanner;

public class Ejercicio_Resuelto_15 {

    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int [] al;
        al = new int[4];
        String vale;
        String [] let = {"A", "B", "C", "D"};
        System.out.println("Escriba a continuación los valores de las cuatro esferas, cada valor seguido de un ENTER");
        for (int i = 0; i < 4; i++){
           al[i] = a.nextInt();
        }
        int ban = 0, igual = al[0];
        for (int i = 0; i < 4; i++){
          if (al[i] != igual){
            ban = ban + i;
            }
        }
        if (ban > 4){
            ban = 0;
            if (al[ban] < al[ban+1]){
            vale = "menor";
            }
            else{
            vale = "mayor";
            }
        } else{
            if (al[ban] < al[ban-1]){
                vale = "menor";
            }
            else{
                vale = "mayor";
          }
        }
        System.out.println(let[ban] + " es la esfera diferente y es el " + vale + " peso");
    }
    
}