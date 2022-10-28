public class sentenciaSwitchCase {
    public static void main(String[] args) {

        int mes = 4;
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "Ennero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            default:
                System.out.println("Mes o existe");
        }
    }
}
