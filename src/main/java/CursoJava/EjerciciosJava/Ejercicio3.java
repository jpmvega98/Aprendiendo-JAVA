//3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
// Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("Bienvenido " + nom);
    }
}
