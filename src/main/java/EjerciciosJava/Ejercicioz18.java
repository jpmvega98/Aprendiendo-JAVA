//18) Pide por teclado dos número y genera 10 números aleatorios entre esos números.
// Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).

package EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int range = num2 - num1 + 1;
        System.out.println("range = " + range);

        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + num1;
            System.out.println(rand);
        }
    }
}

