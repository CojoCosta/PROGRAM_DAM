package ejercicios_swing.ejercicio2;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo();
        titulo1.setSize(500, 500);
        titulo1.setVisible(true);
        titulo1.setLayout(new FlowLayout());
        titulo1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
