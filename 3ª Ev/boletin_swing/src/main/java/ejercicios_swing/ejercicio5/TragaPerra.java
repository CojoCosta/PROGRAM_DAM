package ejercicios_swing.ejercicio5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TragaPerra extends JFrame implements ActionListener{
    private JTextField textNumero1;
    private JTextField textNumero2;
    private JTextField textNumero3;
    private JButton boton;
    private JLabel etiquetaPremio;
    private JLabel etiquetaTemporizador;

    public TragaPerra(){
        this.setTitle("LA TRAGA");
        this.setLayout(new FlowLayout());

        textNumero1 = new JTextField(10);
        this.add(textNumero1);
        textNumero1.addActionListener(this);
        
        textNumero2 = new JTextField(10);
        this.add(textNumero2);
        textNumero2.addActionListener(this);
        
        
        textNumero3 = new JTextField(10);
        this.add(textNumero3);
        textNumero3.addActionListener(this);
        
        
        boton = new JButton("Jugar");
        this.add(boton);
        boton.addActionListener(this);
        
        
        etiquetaPremio = new JLabel();
        
        
        
        etiquetaTemporizador = new JLabel();
        
        
    }
    public int numeroAleatorio(){
        return (int)(Math.random() * 6 + 1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String.format("%d", numeroAleatorio());
    }
}
