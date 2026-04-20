/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1, num2, suma;

        System.out.println(" ing 1er num");
        num1 = teclado.nextDouble();
        System.out.println(" ing 2do num");
        num2 = teclado.nextDouble();
        suma = num1 + num2;
        System.out.println("lA SUMA TOTAL ES: " + suma);
        //si es por codigo va con punto
        //si lo tengo configurado en el programa en los mensajes me aparecen en coma
        //si esta con system.in,esto va a tomar como esta configurado mi programa.
        if (num1 >18 ) {

            System.out.println("ayor a  18 ");

        } else {
            System.out.println("no es 3 segui intentando ");
        }
    }

}
