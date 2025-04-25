package ejercicios_swing.ejercicio1;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Dado dado1 = new Dado(); 
        
        dado1.setVisible(true);
        dado1.setSize(500,500);
        dado1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dado1.setLayout(new FlowLayout()); 

    }
}
