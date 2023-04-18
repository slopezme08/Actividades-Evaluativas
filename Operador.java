/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_resueltos_actividad3;

public class Operador {
 public static double salarioBruto(double horas, double precioHora){
     double SB = horas * precioHora;    
     return SB;
 }
 public static double salarioNeto(double salarioBruto, double porcentaje){
     double SN = salarioBruto*(1 - (porcentaje/100));     
     return SN;
 }
 public static double alturaTriangulo(double lado){
     double AT = Math.sqrt((Math.pow(lado, 2) - Math.pow(lado/2, 2)));
     return AT;
 }
 public static double perimetroTriangulo(double lado){
     double PT = lado * 3;     
     return PT;
 }
 public static double areaTriangulo(double lado, double altura){
     double ATR = lado * altura/2;
     return ATR;
 }
 
 public static String Es(double a, double b){
     String E;
     if (a > b){E = "mayor";}
     else if(a < b){E = "menor";}
     else{E = "igual";}
     return E;
 }
 public static double precioMatricula(double patrimonio, double estrato){
     double PM = 50000;
     if (patrimonio > 2000000 && estrato > 3){
     PM += PM*1.03;}
     return PM;
 }
 public static String salarioBasico(double salarioHora, double numeroHoras, String nombre){
     String SB;
     double salarioBasico = salarioHora * numeroHoras;
     if (salarioBasico > 450000){
     SB = nombre + " gana: " + salarioBasico;}
     else{SB = nombre;}
     return SB;
 }
 public static String solucionesEcuacion(double A, double B, double C){
     String SE;
     double discriminante = Math.pow(B, 2) - 4*A*C;
     double S1, S2;
     
     if (discriminante >= 0){         
         S1 = (-B + discriminante)/2*A;
         S2 = (-B - discriminante)/2*A;
        if (S1 == S2){
         SE = "La ecuación tiene una solución: " + S1;}
        else {
         SE = "La ecuación tiene dos soluciones: S1 = " + S1 + " y S2 = " + S2;
        }        
     }
     else{
         SE = "La ecuación no tiene soluciones posibles";}
     return SE;
 }
 public static double raizCuadrada(double numero){
     double RC = Math.sqrt(numero);
     return RC;
 }
 public static double cuadradoNumero(double numero){
     double CN = Math.pow(numero, 2);
     return CN;
 }
 public static double cuboNumero(double numero){
     double CUN = Math.pow(numero, 3);
     return CUN;
    }
 public static double mayorNumero(double[] lista){
     double MN = lista[0]; 
     double largo = lista.length - 1;
     
     for(int i = 0; i < largo; i++){
         if (lista[i] > MN){
         MN = lista[i];
         }      
     }
     return MN;
}
 public static double perimetroCirculo(double radio){
     double PC = Math.PI * Math.pow(radio, 2);
     return PC;
 }
 public static double areaCirculo(double radio){
     double AC = 2* Math.PI * radio;
     return AC;
 }
 public static double perimetroRectangulo(double base, double altura){
     double PR = (2*base) + (2*altura);
     return PR;
 }
 public static double areaRectangulo(double base, double altura){
     double AR = base * altura;
     return AR;
 }
 public static double perimetroCuadrado(double lado){
     double PC = 4 * lado;
     return PC;
 }
 public static double areaCuadrado(double lado){
     double AC = Math.pow(lado, 2);
     return AC;
 }
 public static double perimetroTriangulix(double base, double altura){
     double lado3 = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
     double PM = altura + lado3 + base;
     return PM;
 }
 public static double areaTriangulix(double base, double altura){    
     double AT = altura* base/2;
     return AT;
 }
 public static String identificadorTriangulix(double base, double altura){
     double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
     String queeh;
        if (base == altura && altura == hipotenusa){
            queeh =  "Equilatero";
        }else if((base != altura) && (altura != hipotenusa) && (hipotenusa != altura )){
            queeh = "Escaleno";
        }else{queeh = "Isóceles";}
        return queeh;
 }
}
