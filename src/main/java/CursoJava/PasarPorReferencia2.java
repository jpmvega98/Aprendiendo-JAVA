package CursoJava;

class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String mostrarNombre() {
        return this.nombre;
    }

}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("andres");

        System.out.println("iniciamos el main");
        System.out.println("persona. = " + persona.mostrarNombre());
        System.out.println("antes de llamar al metodo test");
        test(persona);
        System.out.println("despues de llamar al metodo test");
        System.out.println("persona.mostrarNombre() = " + persona.mostrarNombre());
        System.out.println("finaliza el metodo main");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("pepe");
        System.out.println(" finaliza el metodo test con nuevo valor i");
    }
}
