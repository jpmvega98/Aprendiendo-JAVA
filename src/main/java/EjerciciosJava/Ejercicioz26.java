/*
26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
*/
package EjerciciosJava;

public class Ejercicioz26 {
    public static void main(String[] args) {
        String cadena = "La lluvia en Sevilla es una maravilla";

        for (int i = 0; i < cadena.length(); i++) {
            //Hacemos un casting para convertir el char a int
            System.out.print((int) cadena.charAt(i) + " ");
        }
    }
}


