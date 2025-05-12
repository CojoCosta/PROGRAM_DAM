package ejercicios.ejercicio1;

import java.awt.FlowLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio1 extends JFrame {
    private JButton boton1;
    private JButton boton2;
    private JLabel teclas;

    public Ejercicio1() {
        this.setTitle("Control de Raton");
        this.setLayout(new FlowLayout());
        this.getContentPane().addMouseMotionListener(new MouseEvent());
        
        
        boton1 = new JButton("Izquierda");
        this.add(boton1);

        boton2 = new JButton("Derecha");
        this.add(boton2);

        teclas = new JLabel("Teclas");
        this.add(teclas);
    }

    private class MouseEvent implements MouseListener, MouseMotionListener {
        @Override
        public void mouseMoved(java.awt.event.MouseEvent e) {
            if (e.getX() ==  e.MOUSE_EXITED) {
                Ejercicio1.this.setTitle("Fuera de coordenadas");
            } else {
                teclas.setText(String.format("Posición X:%d Y:%d ", e.getX(), e.getY()));
            }

        }

        @Override
        public void mouseDragged(java.awt.event.MouseEvent e) {

        }


        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            // teclas.setText(String.format("Posición X:%d Y:%d ", e.getX(), e.getY()));    
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {

        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {

        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {

        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {

        }

    }
}
