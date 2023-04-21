/*
25) Crea una aplicación llamada CalculadoraPolacaInversaApp,
nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizara la operación correspondiente.
Al final mostrara el resultado en un cuadro de dialogo.Los signos aritméticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.
*/
package CursoJava.EjerciciosJava;

import java.util.Scanner;

public class Ejercicioz25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar numero 1");
        int num1 = scanner.nextInt();

        System.out.println("Ingresar signo aritmetico");
        String signoAritmetico = scanner.next();

        System.out.println("Ingresar numero 2");
        int num2 = scanner.nextInt();

        int resultado = 0;
        switch (signoAritmetico) {
            case "+":
                resultado = num1 + num2;
                System.out.println("resultado = " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("resultado = " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("resultado = " + resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println("resultado = " + resultado);
                break;
            case "^":
                double resultadoD = Math.pow(num1, num2);
                System.out.println("resultado = " + resultadoD);
                break;
            case "%":
                resultado = num1 % num2;
                System.out.println("resultado = " + resultado);
                break;
            default:
                System.out.println("Porfavor ingresar un signo correctamente");
        }

    }
}



