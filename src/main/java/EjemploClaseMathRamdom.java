public class EjemploClaseMathRamdom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "verde"};
        double ramdom = Math.random();
        System.out.println("ramdom = " + ramdom);
        ramdom *= colores.length;
        System.out.println("ramdom = " + ramdom);


    }
}
