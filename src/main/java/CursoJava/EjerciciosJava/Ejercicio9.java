//9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
// calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese precio de producto");
        double numero = sc.nextDouble();

        double iva = numero * 0.21;
        System.out.println("iva = " + iva);
    }

}
