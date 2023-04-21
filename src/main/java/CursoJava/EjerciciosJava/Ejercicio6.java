//6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
// Si no lo es, también debemos indicarlo.

package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " es divisible entre 2");
        }else {
            System.out.println(num + " no es divisible entre 2");
        }
    }
}
