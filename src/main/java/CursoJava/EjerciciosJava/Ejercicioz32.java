/*
32) Pedir dos palabras por teclado, indicar si son iguales.
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese primera palabra");
        String frase1 = scanner.nextLine();
        System.out.println("Ingrese segunda palabra");
        String frase2 = scanner.nextLine();

        if (frase1.equals(frase2)) {
            System.out.println("Estas dos palabras son iguales");
        }else{
            System.out.println("Estas dos palabras no son iguales");
        }
    }
}




