/**
 * @author Daw120
 * 
 * 6. Solicita al usuario tres distancias:
 
    • La primera, en milímetros.
    • La segunda, en centímetros.
    • La tercera, en metros.
    
     Diseña un programa que muestre la suma de las tres longitudes introducidas 
     (medidas en centímetros).

 */
package com.solomongo.ejercicio6_hoja3;
import javax.swing.JOptionPane;
public class Ejercicio6_Hoja3 {
    public static void main(String[] args) {
        
        String metros, centimetros, milimetros;  // el string lo que escribe user
        // variables: si el valor pinta decimal se pone este tipo double..
        double  sumametros;
        double  sumacentimetros;
        double  sumamilimetros;
        double  resultado;
        metros=JOptionPane.showInputDialog("Meter distancia, en metros:");
        sumametros=Double.parseDouble(metros); // aqui es donde se aplica el metodo, en el caso Double..
        System.out.print("\n\tDistancia en metros es: "+metros+"\n"); // se aplican MASCARAS
        
        centimetros=JOptionPane.showInputDialog("Meter distancia, en centimetros:");
        sumacentimetros=Double.parseDouble(centimetros); 
        System.out.print("\tDistancia en centimetros es: "+centimetros+"\n"); 
        
        milimetros=JOptionPane.showInputDialog("Meter distancia, en milimetros:");
        sumamilimetros=Double.parseDouble(milimetros); 
        System.out.print("\tDistancia en milimetros es: "+milimetros+"\n"); 
      
        resultado=(sumametros*100)+(sumacentimetros)+(sumamilimetros/10);
        System.out.printf("\n- TOTAL SUMA en cms: %,.2f",resultado);
        System.out.print("\n");
    }
}
