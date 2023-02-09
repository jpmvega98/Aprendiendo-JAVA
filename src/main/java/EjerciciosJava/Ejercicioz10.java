//10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
package EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero a contar");
        int num = sc.nextInt();

        int control = 1;

        while (control <= num) {
            System.out.println(control);
            control++;
        }
    }
}
