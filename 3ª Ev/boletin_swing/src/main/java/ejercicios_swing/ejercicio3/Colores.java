package ejercicios_swing.ejercicio3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Colores extends JFrame implements ActionListener{
    private JButton botonAmarillo;
    private JButton botonAzul;
    private JButton botonAleatorio;
    
    public Colores(){
        this.setTitle("Colores");
        this.setLayout(null);
        
        botonAmarillo = new JButton("Amarillo");
        botonAmarillo.setSize(100, 50);
        botonAmarillo.setLocation(0, 0);
        this.add(botonAmarillo);
        botonAmarillo.addActionListener(this);
        
        
        botonAzul = new JButton("Azul");
        botonAzul.setSize(100, 50);
        botonAzul.setLocation(105, 0);
        this.add(botonAzul);
        botonAzul.addActionListener(this);
        
        botonAleatorio = new JButton("Aleatorio");
        botonAleatorio.setSize(100, 50);
        botonAleatorio.setLocation(210, 0);
        this.add(botonAleatorio);
        botonAleatorio.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // System.err.println(e.getModifiers());
        if (e.getSource() == botonAmarillo) {
            this.getContentPane().setBackground(Color.YELLOW);
        } else if (e.getSource() == botonAzul) {
            this.getContentPane().setBackground(Color.BLUE);
        } else if(e.getSource() == botonAleatorio && (e.getModifiers() & e.SHIFT_MASK) == e.SHIFT_MASK){
            botonAleatorio.setLocation((int)(Math.random() * 400 + 1),(int)(Math.random() * 600+ 1));
        } else if (e.getSource() == botonAleatorio) {
            this.setLocation(((int)(Math.random() * 400) + 1), (int)(Math.random() * 600 + 1));
        }
    }
}
