// Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
package org.java.EjerciciosJava;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] arg) {

        String nombre = JOptionPane.showInputDialog("Ingrse su nombre por favor");

        //System.out.println("Bienvenido " + nombre);
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }
}
