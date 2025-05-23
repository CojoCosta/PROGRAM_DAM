package ejercicios.ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MovilClase extends JFrame implements ActionListener{
    private String[] teclas = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "#", "0", "*" };

    public MovilClase() {
        this.setTitle("movil");
        this.setLayout(null);

        int x = 10, y = 10;
        for (int i = 0; i < teclas.length; i++) {
            JButton boton = new JButton(teclas[i]);
            boton.setSize(200, 30);
            boton.setLocation(x, y);
            boton.addActionListener(this);
            this.add(boton);
            if ((i + 1) % 3 == 0) { // Cada 3 botones cambia de “línea”
                x = 10;
                y += 40;
            } else {
                x += 210;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}