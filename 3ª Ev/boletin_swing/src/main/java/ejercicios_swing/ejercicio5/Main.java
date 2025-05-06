package ejercicios_swing.ejercicio5;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        TragaPerra traga = new TragaPerra();
        traga.setSize(600, 600);
        traga.setVisible(true);
        traga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
