/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploswitch;

import java.util.Scanner;

/**
 *
 * @author alsin1
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner tec= new Scanner(System.in );
   
            
            
int dia;
String nombreDia;
        System.out.println("ingrese el num de lote 000001 AL 00007 ");
        dia=tec.nextInt();
        
        
        switch(dia){
        
            case 1: nombreDia="Lunes";
             break;
             case 2: nombreDia="Martes";
             break;
             
            case 3: nombreDia="Miercoles";
             break;
              case 4: nombreDia="Jueves";
             break;
             case 5: nombreDia="Viernes";
             break;
             case 6: nombreDia="Sabado";
             break;
             case 7: nombreDia="Domingo";
             break;
           //le avisa por msj q esta mal l ingresado con default
             default:nombreDia="dia incorrecto";
             
             
        }
        System.out.println("el dia de la semana elegido es: "+nombreDia);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
   

    
    
}
