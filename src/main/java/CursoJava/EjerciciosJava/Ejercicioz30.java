/*
30) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario
lo pida y mostraremos el resultado por pantalla.
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();

        System.out.println("1. Convertir la frase a mayúsculas \n"
                + "2. Convertir la frase a minúsculas \n"
                + "Elija una opcion");
        int num = scanner.nextInt();
        switch (num) {
            case 1: {
                String fraseMinuscula = frase.toLowerCase();
                System.out.println("frase en Minuscula = " + fraseMinuscula);
                break;
            }
            case 2: {
                String fraseMayuscula = frase.toUpperCase();
                System.out.println("Frase en Mayuscula = " + fraseMayuscula);
                break;
            }
        }

    }
}




