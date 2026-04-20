
package operadoraternario;

import java.util.Scanner;


public class OperadoraTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programa que dependiendo del promedio de un alumno,nos diga si aprobo o no 
        
        Scanner tec= new Scanner(System.in);
        double promedio;
        String conndicionFinal;
        //pedir al usuario que ingrese el promedio por teclado
        
        System.out.println("ingrese  el promedio: ");
        promedio=tec.nextDouble();
        
        conndicionFinal=(promedio)>=6 ? "aprobado": "desaprobado";
        
        System.out.println("la condicion es "+conndicionFinal);
        
        
        
        
        
        
        
    }
    
}
