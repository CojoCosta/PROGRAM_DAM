package ejercicios.ejercicio2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MovilClase extends JFrame implements ActionListener {
    private String[] teclas = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "#", "0", "*" };
    private JTextField txtNumerosPulsados; 
    String datos = "";
    public MovilClase() {
        this.setTitle("movil");
        this.setLayout(null);

        int x = 10, y = 10;
        
        for (int i = 0; i < teclas.length; i++) {
            JButton boton = new JButton(teclas[i]);
            boton.setSize(200, 30);
            boton.setLocation(x, y);
            boton.addActionListener(this);
            boton.addMouseListener(new MouseEvent());
            boton.addMouseMotionListener(new MouseEvent());
            boton.addKeyListener(new EventoTeclado());
            this.add(boton);
            if ((i + 1) % 3 == 0) { // Cada 3 botones cambia de “línea”
                x = 10;
                y += 40;
            } else {
                x += 210;
            }
        }

        txtNumerosPulsados = new JTextField();
        txtNumerosPulsados.setSize(200, 30);
        txtNumerosPulsados.setLocation(10, 180);
        txtNumerosPulsados.setEnabled(false);
        txtNumerosPulsados.addActionListener(this);
        this.add(txtNumerosPulsados);
    }
    
    private class MouseEvent extends MouseAdapter {        
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
                ((JButton) e.getSource()).setBackground(Color.YELLOW);
                System.err.println("Boton pulsado");
                datos += ((JButton)e.getSource()).getText();
                txtNumerosPulsados.setText(datos);

        }
        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            if (((JButton) e.getSource()).getBackground() == Color.YELLOW) {
            } else{
                ((JButton) e.getSource()).setBackground(Color.GREEN);                        
            }
        }
        
        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            if (((JButton) e.getSource()).getBackground() == Color.YELLOW) {
            } else{
                ((JButton) e.getSource()).setBackground(null);
            }
        }
    }
    private class EventoTeclado extends KeyAdapter{
        @Override
        public void keyPressed (KeyEvent e){
                datos += ((JButton)e.getSource()).getText();
                txtNumerosPulsados.setText(datos);
            

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    

}