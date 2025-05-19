package ejercicios.ejercicio1;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Ejercicio1 ej1 = new Ejercicio1();
        ej1.setSize(500, 500);
        ej1.setVisible(true);
        ej1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(System.getProperty("user.home"));
    }
}
