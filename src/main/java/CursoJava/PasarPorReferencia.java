package CursoJava;

public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {12, 21, 33, 44, 51, 60};

        System.out.println("iniciamos el main con i = ");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("antes de llamar al metodo test");
        test(edad);
        System.out.println("despues de llamar al metodo test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("finaliza el metodo main");
    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println(" finaliza el metodo test con nuevo valor i");
    }
}
