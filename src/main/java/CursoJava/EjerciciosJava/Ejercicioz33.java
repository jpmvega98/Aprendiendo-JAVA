/*
33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese primera palabra");
        String frase1 = scanner.nextLine();

        String extraccion = frase1.substring(3,5);
        System.out.println("extraccion = " + extraccion);
    }
}




