package ejercicios_swing.ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Dado extends JFrame implements ActionListener {
    private JButton botondado;
    private JLabel etiqueta;
    private JTextField limite;

    public Dado() {
        // Propiedades Ventana
        this.setTitle("Juego del dado"); // Esto es una prpiedad de la ventana pero tienes que poner mas vamos al main

        // Propiedades boton QUE FALTA? JButton esta inicializado?
        botondado = new JButton("HOLA"); // Esto es un constructor ej:
        this.add(botondado);
        botondado.addActionListener(this);

        // Propiedades etiqueta
        etiqueta = new JLabel();
        this.add(etiqueta);

        // Propiedades JTextField
        limite = new JTextField(10);
        this.add(limite);
        limite.addActionListener(this);
    }

    public int numeroAleatorio(String limite) {
        int numero = 0;
        try {
            numero = Integer.parseInt(limite);
        } catch (IllegalArgumentException e) {
        } catch (InputMismatchException e){
        }
        if (numero < 1) {
            return (int) (Math.random() * 6) + 1;
        } else {
            return (int) (Math.random() * numero) + 1;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText(String.format("%d", numeroAleatorio(limite.getText())));
    }
}