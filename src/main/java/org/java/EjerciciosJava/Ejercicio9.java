//9) Lee un número por teclado que pida el precio de un producto (puede tener decimales)
// y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

package org.java.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Precio del producto");
        double precio = scanner.nextDouble();

        double IVA = precio * 0.21;
        double precioFinal = precio + IVA;
        System.out.println("precioFinal = " + precioFinal);
    }
}
