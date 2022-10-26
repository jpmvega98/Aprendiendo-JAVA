// Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
// Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
package org.java.EjerciciosJava;

public class Ejercicio2 {
    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 5;

        if (num1 == num2) {
            System.out.println("numero " + num1 + " es igual que numero " + num2);
        } else if (num1 > num2) {
            System.out.println("numero " + num1 + " es mayor que numero " + num2);
        } else {
            System.out.println("numero " + num1 + " es menor que numero " + num2);
        }
    }
}
