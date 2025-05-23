package ejercicios_swing.ejercicio5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class TragaPerra extends JFrame implements ActionListener { 
    private JTextField textNumero1;
    private JTextField textNumero2;
    private JTextField textNumero3;
    private JButton boton;
    private JLabel etiquetaPremio;
    private JLabel etiquetaTemporizador;
    private Timer tiempo;
    private int cont;
    private int minutos;
    private int segundos;

    public TragaPerra() {
        this.setTitle("LA TRAGA");
        this.setLayout(new FlowLayout());

        textNumero1 = new JTextField(10);
        textNumero1.setEditable(false);
        this.add(textNumero1);

        textNumero2 = new JTextField(10);
        textNumero2.setEditable(false);
        this.add(textNumero2);

        textNumero3 = new JTextField(10);
        textNumero3.setEditable(false);
        this.add(textNumero3);

        boton = new JButton("Jugar");
        this.add(boton);
        boton.addActionListener(this);

        etiquetaPremio = new JLabel();
        this.add(etiquetaPremio);

        etiquetaTemporizador = new JLabel("0");
        add(etiquetaTemporizador);

        cont = 0;
        tiempo = new Timer(1000, this);
        tiempo.start();
    }

    public int numeroAleatorio() {
        return (int) (Math.random() * 3 + 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton) {
            textNumero1.setText(String.format("%d", numeroAleatorio()));
            textNumero2.setText(String.format("%d", numeroAleatorio()));
            textNumero3.setText(String.format("%d", numeroAleatorio()));
            if (textNumero1.getText().equals(textNumero2.getText())
                    && textNumero1.getText().equals(textNumero3.getText())) {
                etiquetaPremio.setText("PREMIO");
            } else {
                etiquetaPremio.setText("TRY AGAIN");
            }
        }
        if (e.getSource() == tiempo) {
            cont++;
            minutos = cont / 60;
            segundos = cont % 60;
            etiquetaTemporizador.setText(String.format("%02d : %02d", minutos, segundos));
        }

    }
}