package ejercicios_swing.ejercicio5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TragaPerra extends JFrame implements ActionListener {
    private JTextField textNumero1;
    private JTextField textNumero2;
    private JTextField textNumero3;
    private JButton boton;
    private JLabel etiquetaPremio;
    private JLabel etiquetaTemporizador;
    private Timer tiempo;

    public TragaPerra() {
        this.setTitle("LA TRAGA");
        this.setLayout(new FlowLayout());

        textNumero1 = new JTextField(10);
        textNumero1.setEditable(false);
        this.add(textNumero1);
        textNumero1.addActionListener(this);

        textNumero2 = new JTextField(10);
        textNumero2.setEditable(false);
        this.add(textNumero2);
        textNumero2.addActionListener(this);

        textNumero3 = new JTextField(10);
        textNumero3.setEditable(false);
        this.add(textNumero3);
        textNumero3.addActionListener(this);

        boton = new JButton("Jugar");
        this.add(boton);
        boton.addActionListener(this);

        etiquetaPremio = new JLabel();
        this.add(etiquetaPremio);

        etiquetaTemporizador = new JLabel("0");
        this.add(etiquetaTemporizador);
    }

    public int numeroAleatorio() {
        return (int) (Math.random() * 6 + 1);
    }

    public void temporizador() {
        tiempo = new Timer(1000, );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            textNumero1.setText(String.format("%d", numeroAleatorio()));
            textNumero2.setText(String.format("%d", numeroAleatorio()));
            textNumero3.setText(String.format("%d", numeroAleatorio()));
        }
        if (textNumero1.getText() == textNumero2.getText() && textNumero1.getText() == textNumero3.getText()) {
            etiquetaPremio.setText("PREMIO");
        } else {
            etiquetaPremio.setText("TRY AGAIN");
        }
        etiquetaTemporizador
    }
}
