package CursoJava;

public class PrimitivoBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico + "\n");

        double d = 98765.43e-3;//98.76543
        System.out.println("d = " + d + "\n");
        float f = 12345e2f;// 123.45
        System.out.println("f = " + f + "\n");

        datoLogico = (d > f);
        System.out.println("datoLogico = " + datoLogico);


        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
