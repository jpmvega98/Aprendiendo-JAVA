//19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
// Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
// Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.

package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero a calcular sus cifras");
        int c = sc.nextInt();
        int num = c;
        int cifras = 0;
        for (int i = 1; num != 0; i++) {
            num = num / 10;
            cifras = i;
        }
        if (cifras == 1) {
            System.out.println("El numero " + c + " tiene " + cifras + " cifra");
        } else {
            System.out.println("El numero " + c + " tiene " + cifras + " cifras");
        }
    }
}


