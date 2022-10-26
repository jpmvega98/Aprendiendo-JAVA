//12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
package org.java.EjerciciosJava;

public class Ejercicio12 {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);

            }
        }
    }
}
