/*
31) Mostrar la longitud de una cadena
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        System.out.println("la longitud de tu cadena es = " + frase.length());
    }
}




