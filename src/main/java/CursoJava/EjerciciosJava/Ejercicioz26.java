/*
26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int n = 0;
        if (numero > 1) {
            for (int i = 1; i <= numero; i++) {
                n = n + i;
            }
            System.out.println("Suma total de los numeros del 1 al " + numero + " es de : " + n);
        } else {
            System.out.println("Ingrse un numero mayor que 1");
        }
    }
}



