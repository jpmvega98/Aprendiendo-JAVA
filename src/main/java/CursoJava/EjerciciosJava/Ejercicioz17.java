//17) Crea una aplicación que nos pida un día de la semana
// y que nos diga si es un dia laboral o no. Usa un switch para ello.

package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dia = sc.next();
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Dia laboral.");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Dia no laboral.");
            default:
                System.out.println("Introduce un dia de la semana.");

        }
    }
}

