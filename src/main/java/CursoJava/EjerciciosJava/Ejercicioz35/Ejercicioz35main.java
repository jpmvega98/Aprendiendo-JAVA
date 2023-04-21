package CursoJava.EjerciciosJava.Ejercicioz35;

import java.util.Scanner;

public class Ejercicioz35main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();

        DiaDeLaSemana diaS = DiaDeLaSemana.valueOf(dia.toUpperCase());
        switch (diaS) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia " + diaS.name().toLowerCase() + " es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia " + diaS + " no es laborable");
                break;

        }


    }
}
