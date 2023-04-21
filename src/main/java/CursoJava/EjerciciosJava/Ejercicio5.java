//5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
// (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese radio del circulo a calcular");
        double radio = scanner.nextDouble();
        System.out.println("Area de un circulo = " + (Math.PI * Math.pow(radio,2)));

    }
}
