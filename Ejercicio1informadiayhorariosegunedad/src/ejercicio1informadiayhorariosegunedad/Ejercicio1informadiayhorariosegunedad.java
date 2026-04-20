
package ejercicio1informadiayhorariosegunedad;

import java.util.Scanner;

/**
 *
 * @author alsin1
 */
public class Ejercicio1informadiayhorariosegunedad {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);

        int edadAlumno;

        System.out.println("Ingrese la edad del alumno");

        edadAlumno = tec.nextInt();

        if (edadAlumno >= 4 && edadAlumno <= 6) {
            System.out.println("   kinder lunes y miercoles   ");
        } else {
            if (edadAlumno >= 7 && edadAlumno < 8) {
                System.out.println("grupo 1 st martes y jueves 16  a 17");
            } else {
                if (edadAlumno >= 9 && edadAlumno <= 10) {
                    System.out.println("grpo 2 nd martes jueves 17y30 a 19");
                }
            }
            if (edadAlumno >= 11 && edadAlumno <= 13) {
                System.out.println("grupo 3 nt lunes y miercoles 123 ");
            } else {
                System.out.println("edad incorrecta");
            }

        }

    }

}
