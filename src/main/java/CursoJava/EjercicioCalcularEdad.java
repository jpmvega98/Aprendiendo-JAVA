package CursoJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EjercicioCalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha de nacimiento (yyyy-MM-dd): ");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);

        int edad = periodo.getYears();
        int edadMeses = periodo.getMonths();
        int edadDias = periodo.getDays();

        System.out.println("La edad de la persona es: " + edad + " años." + " Meses: " + edadMeses + " Dias: " + edadDias);


    }
}

