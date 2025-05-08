package poo_avanzada.GUI_SWING_2;

import javax.swing.JFrame;

public class PruebaGUI {
    public static void main(String[] args) {
        EventosTeclado frame = new EventosTeclado();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }

}