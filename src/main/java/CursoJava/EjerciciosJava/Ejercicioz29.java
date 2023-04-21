/*
28) Eliminar los espacios de una frase pasada por consola por el usuario.
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num;
        String cadeCompleta = " ";
        do {
            num = scanner.nextLine();
            cadeCompleta += num;

        } while (!num.isEmpty());
        System.out.println("cadeCompleta = " + cadeCompleta);
    }
}




