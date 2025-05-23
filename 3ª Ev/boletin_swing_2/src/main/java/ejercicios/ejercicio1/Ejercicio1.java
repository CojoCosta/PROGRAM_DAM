package ejercicios.ejercicio1;

import java.awt.Color;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio1 extends JFrame {
    private JButton boton1;
    private JButton boton2;
    private JLabel teclas;

    public Ejercicio1() {
        this.setTitle("Control de Raton");
        this.setLayout(null);
        this.getContentPane().addMouseMotionListener(new MouseEvent());
        this.getContentPane().addMouseListener(new MouseEvent());
        this.addKeyListener(new KeyEvent());
        this.setFocusable(true);

        boton1 = new JButton("Izquierda");
        boton1.setLocation(40, 20);
        boton1.setSize(100, 40);
        boton1.addMouseListener(new MouseEvent());
        boton1.addMouseMotionListener(new MouseEvent());
        boton1.addKeyListener(new KeyEvent());
        this.add(boton1);

        boton2 = new JButton("Derecha");
        boton2.setLocation(160, 20);
        boton2.setSize(100, 40);
        boton2.addMouseMotionListener(new MouseEvent());
        boton2.addMouseListener(new MouseEvent());
        boton2.addKeyListener(new KeyEvent());
        this.add(boton2);

        teclas = new JLabel("Teclas");
        teclas.setLocation(100, 80);
        teclas.setSize(200, 40);
        this.add(teclas);
    }

    private class MouseEvent extends MouseAdapter {
        @Override
        public void mouseMoved(java.awt.event.MouseEvent e) {
            if (e.getSource() == boton1 || e.getSource() == boton2) {
                teclas.setText(
                        String.format("Posición X:%d Y:%d ", e.getX() + boton1.getX(), e.getY() + boton1.getY()));
                System.err.println(boton1.getX());
                System.err.println(boton1.getY());
            } else {
                teclas.setText(String.format("Posición X:%d Y:%d ", e.getX(), e.getY()));
            }
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            Ejercicio1.this.setTitle("Fuera de coordenadas");
            System.err.println("FUERA");
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            System.err.println("DENTRO");
            Ejercicio1.this.setTitle("Control de Raton");

        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK) {
                boton1.setBackground(Color.GREEN);
                System.err.println("BOTON IZQUIERDO");
            } else if (e.getModifiersEx() == InputEvent.BUTTON3_DOWN_MASK) {
                boton2.setBackground(Color.YELLOW);
                System.err.println("BOTON DERECHO");
            }
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            boton1.setBackground(null);
            boton2.setBackground(null);
        }

    }

    private class KeyEvent extends KeyAdapter {
        @Override
        public void keyPressed(java.awt.event.KeyEvent e) {
            teclas.setText(String.format("Letra: %c y codigo %d ", e.getKeyChar(), e.getKeyCode()));
            if (java.awt.event.KeyEvent.VK_C == e.getKeyCode() && e.isControlDown()) {
                System.err.println("FUNCIONA");

                FormSecundario f2 = new FormSecundario(Ejercicio1.this);
                f2.setVisible(true);

                if (f2.isVisible()) {
                    JOptionPane.showMessageDialog(f2, e, "ERROR", ERROR);
                }
            }
        }
    }
}
