package CursoJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020, 0, 16, 19,03,00);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 16);

        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 05);


        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy 'Hora: 'HH:mm a");
        String fechaFormato = formato.format(fecha);
        System.out.println("fechaFormato = " + fechaFormato);
    }
}
