package CursoJava;

public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;

        System.out.println("iniciamos el main con i = " + i);
        test(i);
        System.out.println("finaliza el main con i = " + i);
    }

    public static void test(int i) {
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println(" finaliza el metodo test con nuevo valor i = " + i);
    }
}
