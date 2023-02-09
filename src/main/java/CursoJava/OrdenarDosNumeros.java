package CursoJava;

import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese segundo numero");
        int num2 = sc.nextInt();

        int numeroMayor = 0;
        int numeroMenor = 0;

        numeroMayor = num1 > num2 ? num1 : num2;
        numeroMenor = num1 < num2 ? num1 : num2;

        System.out.println("Ordenados de mayor a menos = " + numeroMayor + " " + numeroMenor);

    }
}
