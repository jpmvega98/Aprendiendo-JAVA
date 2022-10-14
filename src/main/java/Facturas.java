import java.util.InputMismatchException;
import java.util.Scanner;

public class Facturas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del cliente:");
        String cliente = scanner.nextLine();

        System.out.println("Ingrese subtotal:");
        int subTotal = scanner.nextInt();

        int iva = (int) (subTotal * 0.19);
        int total = iva + subTotal;

        System.out.println("Cliente = " + cliente + "\n"
                + "Sub Total = " + subTotal + "\n"
                + "IVA = " + iva + "\n"
                + "Total = " + total);


    }
}
