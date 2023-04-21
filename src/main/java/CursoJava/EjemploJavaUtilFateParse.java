package CursoJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilFateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fecha = formato.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("formato = " + formato.format(fecha));

            Date fecha2 = new Date();
            if (fecha.after(fecha2)) {
                System.out.println("fecha 1 del usuario es despues de fecha 2");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha 2 del usuario es despues de fecha 1");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Las fechas son iguales");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
