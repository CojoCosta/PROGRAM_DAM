package poo_avanzada.GUI_SWING_2;

import javax.swing.JFrame;

public class PruebaGUI {
    public static void main(String[] args) {
        FormularioPrincipal frame = new FormularioPrincipal();
        frame.setSize(900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }

}