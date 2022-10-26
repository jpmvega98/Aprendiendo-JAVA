//Lee un número por teclado y muestra por consola,
// el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

package org.java.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        char numeroASCII = (char) numero;
        System.out.println("El numero " + numero + " pertenece en la tabla ASCII al carácter : " + numeroASCII);
    }
}
