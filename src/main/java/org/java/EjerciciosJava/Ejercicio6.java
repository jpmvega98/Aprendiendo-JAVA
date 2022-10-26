//6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

package org.java.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
           System.out.println("El numero " + numero + " es divisible entre 2");
        } else {
            System.out.println("El numero " + numero + " NO es divisible entre 2");
        }

    }
}
