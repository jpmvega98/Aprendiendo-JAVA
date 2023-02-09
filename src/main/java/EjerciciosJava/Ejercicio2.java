//2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
// Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

package EjerciciosJava;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 55;

        if (num1 == num2) {
            System.out.println(num1 + " es igual a " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " es mayor a " + num2);
        } else {
            System.out.println(num1 + " es menor a " + num2);
        }
    }
}
