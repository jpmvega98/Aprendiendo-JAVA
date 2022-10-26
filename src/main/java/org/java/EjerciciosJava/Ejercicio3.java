//3) Declara un String que contenga tu nombre, después muestra un mensaje
// de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

package org.java.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre porfavor");
        String nombre = scanner.nextLine();

        System.out.println("Bienvenido " + nombre);
    }
}
