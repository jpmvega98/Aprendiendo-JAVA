/*
27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1.
 Calcular el numero de números introducidos.
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int conteo = 0;
        do {
            num = scanner.nextInt();
            conteo++;

        } while (num != -1);
        System.out.println("conteo = " + conteo);
    }
}




