package CursoJava;

import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void main(String[] args) {
        String texto = "hola que tal";

        Class strClass = texto.getClass();
        System.out.println("strClass.ge = " + strClass.getName());
        System.out.println("strClass.ge = " + strClass.getSimpleName());
        System.out.println("strClass.ge = " + strClass.getPackageName());

        for (Method metodo : strClass.getMethods()) {
            System.out.println("metodo = " + metodo.getName());
        }
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());

    }
}
