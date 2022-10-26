//https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-java/
//Declara dos variables numéricas (con el valor que desees), muestra por
// consola la suma, resta, multiplicación, división y módulo (resto de la división).

package org.java.EjerciciosJava;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 5;

        System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println("La resta de " + num1 + " - " + num2 + " = " + (num1 - num2));

        System.out.println("La multiplicacion de " + num1 + " * " + num2 + " = " + (num1 * num2));

        System.out.println("La divicion de " + num1 + " / " + num2 + " = " + (num1 / num2));

        System.out.println("La modular de " + num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
