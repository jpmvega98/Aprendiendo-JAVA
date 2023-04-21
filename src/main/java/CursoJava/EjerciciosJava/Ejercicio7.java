//7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
// Por ejemplo: si introduzco un 97, me muestre una a.

package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un codigo de la tabla ASCII");
        String texto = sc.nextLine();//JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        int codigo = Integer.parseInt(texto);
        char caracter = (char) codigo;

        System.out.println(caracter);

    }
}
