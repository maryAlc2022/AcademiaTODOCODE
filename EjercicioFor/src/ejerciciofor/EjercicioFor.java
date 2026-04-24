
package ejerciciofor;


public class EjercicioFor {

    //realiza un bucle una determinada cant de veces, se lo puede considerar principalmente 
    //controlado por contador dado que posee su pripia variable contador...
    
    public static void main(String[] args) {
       
        int suma=0;
        //esta compuesta por 3 partes: inicio de variable, condicion de fin del ciclo,modificacion de la variable 
        for (int i = 0; i < 10; i++) {
            System.out.println("estoy en la vuelta numero: "+ (i+1));
            suma=5+i;
            
            if (suma>=5) {
                i=11;
            }
            
        }
        
        
    }
    
}
