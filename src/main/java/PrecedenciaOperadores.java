public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

         promedio = i + j + k / 3d * 10; // primero divide , depues multiplica y por ultimo hace la suma
        System.out.println("promedio = " + promedio);

         promedio = ++i + j-- + k / 3d * 10;// (15 + 8) + 66.6
        System.out.println("promedio = " + promedio);
    }
}
