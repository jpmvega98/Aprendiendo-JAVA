//8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.

package org.java.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un caracter");

        char numero = scanner.next().charAt(0);

        int codigoAscii = (int) numero;
        System.out.println("El caracter " + " '" + numero + "' " + " pertenece en la tabla ASCII al codigo : " + codigoAscii);
    }
}
