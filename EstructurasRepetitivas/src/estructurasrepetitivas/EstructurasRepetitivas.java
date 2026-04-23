
package estructurasrepetitivas;

import java.util.Scanner;


public class EstructurasRepetitivas {

   
    public static void main(String[] args) {
        
        //contador y centinella
        
       
        //estructuras repetitivas: permiten ejecutar una cierta porcion de codigo
        //por una determinada cantidad de veces (x)
        //esta ejecicion repetitiva se conoce como BUCLE.
        
        // 2 TIPOS DE BUCLES: CONTROLADOS POR CONTADOR Y POR CENTINELLA
        
        //CONTADOR: REPITE UN BLOQUE DE CODIGO CON UN NUMERO FIJO Y CONOCIDO DE VECES
        //CENTINELLA: NO TIENE UN NUMERO DE REPETICIONES FIJAS, SE REPITE HASTA QUE SE ENCEUNTRA UN VALOR ESPECIAL
        Scanner tec= new Scanner(System.in);
        
        int contador =0;
        do {            
            System.out.println("estoy en la vuelta n° : "+ (contador +1));
            contador++;
        } while (contador<10);
//while y do while

        // BULCE DO WHILE:PERIMITE LLEVAR A CABO UNA DETERMINADA ACCION DE FORMA REPETITITVA
        //DE IGUAL MANERA QUE EL WHILE, LA CONDICION SE EVALUA SIEMPRE AL FINAL DEL CIBLO/BUCLE
        //POR LO QUE LA PORCION DE CODIGO SE EJECUTA POR LO MENOS 1 VEZ
        
        // DO WHILE ES HACER MIENTRAS ; REPITE CANT DE VECES SIEMPRE QUE LA CONDCION SE EVALUE AL FINAL , NO AL PRINCIPIO
        
        
        //while (mientras) : permite ejecutar un bloque de codigo de forma repetitiva mientras, se cumpla una determinada accion. 
        
       //la condicion se evalua siempre al principio del codigo.
       //si la condicion es valida ingresa al bucle y ejecuta el codigo
       //cuando deja de cumplirse la condicion, el programa sale del bucle y continua con el resto del programa.
       
       
       
        
        
        
        
        
        
        
       
    }
    
}
