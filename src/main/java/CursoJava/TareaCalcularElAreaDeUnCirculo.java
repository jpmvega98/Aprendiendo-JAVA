package CursoJava;

import java.util.Scanner;

public class TareaCalcularElAreaDeUnCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdusca el radio de un circulo ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio,2);
        System.out.println("area = " + area);

    }
}
