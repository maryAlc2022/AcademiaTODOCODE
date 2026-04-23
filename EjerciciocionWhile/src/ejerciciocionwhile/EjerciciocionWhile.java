
package ejerciciocionwhile;

import java.util.Scanner;


public class EjerciciocionWhile {


    public static void main(String[] args) {
         
        //while (mientras) : permite ejecutar un bloque de codigo de forma repetitiva mientras, se cumpla una determinada accion. 
        
       //la condicion se evalua siempre al principio del codigo.
       //si la condicion es valida ingresa al bucle y ejecuta el codigo
       //cuando deja de cumplirse la condicion, el programa sale del bucle y continua con el resto del programa.
       
        Scanner tec= new Scanner(System.in);
        //ejemplo bucle controlado por contador
        
      /*  int contador =0;
        
        while (contador<10) {            
            System.out.println("estoy en la vuelta numero: "+ contador);
            contador++;
        }
   */
        
//EJEMPLO CONTROLADO POR CENTINELLA

boolean bandera =true;
String resp;
        while (bandera==true) {   
            System.out.println("el valor de mi bandera es: "+ bandera);
            System.out.println("estas actualmente suscripto: " + bandera);
            System.out.println("queres seguir en todocode?");
          resp=tec.nextLine();
          //si quiero comparar un texto es igual a otro se usa equals
          //y para ignorar mayuscula de minisculas ( touper, tulowers)
          
          
            if (resp.equalsIgnoreCase("si")) {
                bandera=false;
            }     
            System.out.println("************************");
        }




        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
