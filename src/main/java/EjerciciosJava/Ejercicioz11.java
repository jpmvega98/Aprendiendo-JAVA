//11) Haz el mismo ejercicio anterior con un bucle for.
package EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
