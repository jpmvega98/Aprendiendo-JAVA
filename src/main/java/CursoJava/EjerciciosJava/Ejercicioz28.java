/*
28) Eliminar los espacios de una frase pasada por consola por el usuario.
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "hola juan";
        String sinEspacios = "";
        for (int n = 0; n < nombre.length(); n++) {
            char c = nombre.charAt(n);
            if (c != ' ') {
                sinEspacios += String.valueOf(c);
            }
        }
        System.out.println(sinEspacios);
    }
}




