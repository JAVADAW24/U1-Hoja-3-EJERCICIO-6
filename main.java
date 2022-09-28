/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoja3.hoja3;

import java.util.Scanner;

    public class Ejercicio6 {
    public static void main(String[] args) {
        
     /*6. Solicita al usuario tres distancias:
• La primera, en milímetros.
• La segunda, en centímetros.
• La tercera, en metros.
Diseña un programa que muestre la suma de las tres longitudes introducidas
(medidas en centímetros).*/   
        
     Scanner entrada=new Scanner(System.in);
     System.out.println("Introduce los milimetros a sumar: ");
     double mm=entrada.nextDouble();
     
     System.out.println("Introduces los centimetros a sumar: ");
     double cm=entrada.nextDouble();
     
     System.out.println("Introduce los metros a sumar: ");
     double m=entrada.nextDouble();
     
     double mmc=mm/10;
     double mc=m*100;
     
     double suma= mmc+mc+cm;
     
     System.out.println("El resultado total es: "+suma+"cm");
   
     
        
    }
    
}


