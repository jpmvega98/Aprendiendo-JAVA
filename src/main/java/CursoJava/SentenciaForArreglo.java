package CursoJava;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Andres", "pepe", "Mariad", "Paco", "Jose"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].toLowerCase().contains("Andres") ||
                    nombres[i].equalsIgnoreCase("jose")) {
                continue;
            }
            System.out.println("nombres = " + nombres[i]);

        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].toLowerCase().contains(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no exciste");
        }
    }
}
