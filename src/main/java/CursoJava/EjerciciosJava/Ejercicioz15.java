//15) Lee un número por teclado y comprueba que este numero es mayor o igual que
// cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("número a introducir");

        int i = 0;
        do {
            System.out.println("Introduce un numero mayor que 0");
            i = sc.nextInt();
        } while (i <= 0);
            System.out.println("Su numero es = " + i);
    }
}
