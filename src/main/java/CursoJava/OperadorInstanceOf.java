package CursoJava;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase string ... que tal!";

        Integer num = 7;

        boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("b1 = " + b1);

        b1 = num instanceof Number;
        System.out.println("b1 = " + b1);

        b1 = num instanceof Object;
        System.out.println("b1 = " + b1);

        Double decimal =45.50;
        b1 = decimal instanceof Number;
        System.out.println("decimal = " + decimal);




    }
}
