package ejerciciomerceria;

import java.util.Scanner;

public class EjercicioMerceria {

    public static void main(String[] args) {

        //mayorista
      
      
        //menos de 5 paquetes NO VENDE
        //entre 5 y 15 : 10 usd el envio
        //mas de 15 el envio ese gratis
        int cantPaquetes;
        //DECLARACION DE VARIABE¿LES
        double montoTotal, diferencia, descuento, totalDesc;

        Scanner tec = new Scanner(System.in);

        System.out.println("ingrese cantidad paquetes: ");
        cantPaquetes = tec.nextInt();

        if (cantPaquetes < 5 || cantPaquetes <0) {
            
                System.out.println("no se permite paquetes pequeños");
            

        } else {
            System.out.println("ingrese el monto total de la compra");
            tec = new Scanner(System.in);
            montoTotal = tec.nextDouble();
            if (cantPaquetes >= 5 && cantPaquetes <= 15) {
                System.out.println("El costo del envio es de 10 USD");
                montoTotal = montoTotal + 10;
               

            } else {
                System.out.println("Ud no pagara envio! ");

            }
            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("el monto es menor a 1000, necesita: " + diferencia + "usd para entrar a la promocion!! ");
            } else {
                if (montoTotal>=100 && montoTotal<=300) {
                    descuento = montoTotal * 0.05; // se pone asi porque es 5 div 100
                System.out.println("por su compra tiene un descuento del 5%");
                System.out.println("el descuento es: " + descuento);
                totalDesc = montoTotal - descuento;
                System.out.println("TOTAL A PAGAR FINAL : " + totalDesc);
                    System.out.println("GRACIAS POR SU COMPRA");
                }
                else{
                    descuento=montoTotal*0.10;
                    System.out.println("por su compra tiene un descuento del 10%");
                System.out.println("el descuento es: " + descuento);
                totalDesc = montoTotal - descuento;
                System.out.println("TOTAL A PAGAR FINAL : " + totalDesc);
                    System.out.println("GRACIAS POR SU COMPRA");
                    
                   
                }
            }

        }

    }
}
