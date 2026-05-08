
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

   //realizar un programa que muestre en pantalla palabras
    //que sean ingresadas por teclaDO , HASTA Q SE INGRESE LA PALABRA SALIR
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String palabra;
        
        System.out.println("ingrese la palabra q quiera mostrar: ");
        palabra=teclado.next();
        
        while (palabra.equalsIgnoreCase("salir")) {            
            System.out.println("la palabra es: " + palabra);
        }
        
    }
    
}
