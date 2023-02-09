package CursoJava;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = "juan";
        String nombre2 = "nora";
        String nombre3 = "chichi";

        int cantNombre1 = nombre1.length();
        int cantNombre2 = nombre2.length();
        int cantNombre3 = nombre3.length();

        if (cantNombre1 > cantNombre2 && cantNombre1 > cantNombre3) {
            System.out.println(nombre1);
        } else if (cantNombre2 > cantNombre1 && cantNombre2 > cantNombre3) {
            System.out.println(nombre2);
        } else {
            System.out.println(nombre3);
        }
    }
}

