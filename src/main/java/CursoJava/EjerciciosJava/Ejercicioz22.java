/*
22) Del siguiente String «
La lluvia en Sevilla es una maravilla» cuenta
 cuantas vocales hay en total (recorre el String con charAt).
*/
package CursoJava.EjerciciosJava;

public class Ejercicioz22 {
    public static void main(String[] args) {

        String cadena = "La lluvia en Sevilla es una maravilla";
        int vocales = 0;
        for (int n = 0; n < cadena.length(); n++) {
            char c = cadena.charAt(n);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        System.out.println("En la frase hay: " + vocales + " vocales");


    }
}


