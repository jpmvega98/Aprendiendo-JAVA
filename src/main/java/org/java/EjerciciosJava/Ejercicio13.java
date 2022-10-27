/*
13) Realiza una aplicación que nos pida un número de ventas a introducir,
 después nos pedirá tantas ventas por teclado como número
 de ventas se hayan indicado. Al final mostrara la suma de todas las ventas.
 Piensa que es lo que se repite y lo que no.
*/

package org.java.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de ventas ");
        int numeroVentas = scanner.nextInt();

        int sumaVentas = 0;

        for (int i = 0; i < numeroVentas; i++) {
            System.out.println("Ingrese ventas");
            int ventas = scanner.nextInt();
            sumaVentas += ventas;
        }
        System.out.println("Ventas totales = " + sumaVentas);
    }
}
