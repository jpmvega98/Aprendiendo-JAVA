public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 3.0f;

        if (promedio >= 6.5) {
            System.out.println("felicitaciones");
        } else if (promedio >= 6.0) {
            System.out.println("buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("regular");
        } else if (promedio >= 4.0) {
            System.out.println("insuficiente");
        } else {
            System.out.println("reprobado");
        }
        System.out.println("tu promedio es " + promedio);
    }
}
