//8) Modifica el ejercicio anterior, para que en lugar de pedir un número,
// pida un carácter (char) y muestre su código en la tabla ASCII.
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII");

        int codigo = (int) sc.next().charAt(0);

        System.out.println(codigo);

    }
}
