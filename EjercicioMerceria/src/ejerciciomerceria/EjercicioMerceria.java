

package ejerciciomerceria;

import java.util.Scanner;


public class EjercicioMerceria {

   
    public static void main(String[] args) {
     
        //mayorista 
        //menos de 5 paquetes NO VENDE
        //entre 5 y 15 : 10 usd el envio
        //mas de 15 el envio ese gratis
        int cantPaquetes;
        double montoTotal;
        
        Scanner tec= new Scanner(System.in);
        
        
        System.out.println("ingrese cantidad paquetes: ");
        cantPaquetes=tec.nextInt();
       
        if (cantPaquetes<5) {
            System.out.println("no vende");
        }
        else{
            if (cantPaquetes>=5&&cantPaquetes<=15) {
                System.out.println("10 dolares el envio");
                 System.out.println("ingrese el monto total de la compra");
        montoTotal= tec.nextDouble();
            }
            else{
               
                    System.out.println("el envio gratis");
                    
                    
                    
                
            }
            
        }
        
        
       
        
        
        
        
        
        
    }
}
