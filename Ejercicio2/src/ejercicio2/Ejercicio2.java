
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    //realice un programa que dado por el teclado un numero limite 
    //muestre en pantalla todos los numero hasta ese limite (por ejemplo.Hasta 100
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec= new Scanner(System.in);
        int numero;
        System.out.println("ingrese por teclado el  numero limite:");
        
        //Entonces antes de usar nextInt() le preguntamos:
//“che… lo que escribió el usuario es un número?”
//y eso se logra usando hasNextInt();
        if (tec.hasNextInt()) {
            //SI ESTO QUE ENTRO POR TECLADO REALMENTE ES UN NUMERO, ENTONCES A NUMERO RECIEN LE ASIGONO NEXTINT(9;
            
            numero=tec.nextInt();
       
        for (int i = 0; i < numero; i++) {
            System.out.println("estas en el numero: "+ (i+1));
        }
        }
        else{
            System.out.println("no se permite letras , agregue solo numeros!!");
        }
    }

    
    
    //EJECUCCION DE PROCESO
    
}
