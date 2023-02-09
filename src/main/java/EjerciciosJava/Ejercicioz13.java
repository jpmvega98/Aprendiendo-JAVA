//13) Realiza una aplicación que nos pida un número de ventas a introducir,
// después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
// Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
package EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("número de ventas a introducir");
        int numVentas = sc.nextInt();

        int almacen = 0;
        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Ingrse venta numero: " + i);
            int ventas = sc.nextInt();
            almacen = ventas + almacen;
        }
        System.out.println("Suma total de las ventas: " + almacen);
    }
}
