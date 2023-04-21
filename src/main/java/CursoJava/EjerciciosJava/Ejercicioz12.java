//12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
// Utiliza el bucle que desees.
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }

        }
    }
}
