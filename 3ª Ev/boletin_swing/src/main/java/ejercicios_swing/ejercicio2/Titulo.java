package ejercicios_swing.ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Titulo extends JFrame implements ActionListener {
    private JTextField texto;
    private JButton boton;
    private JOptionPane preguntaConfirmacion;
    private JCheckBox alReves;
    private JCheckBox habilitador;

    public Titulo() {
        this.setTitle("Tituloo");

        texto = new JTextField(10);
        this.add(texto);
        texto.addActionListener(this);

        boton = new JButton("CAMBIAR TEXTO");
        this.add(boton);
        boton.addActionListener(this);

        preguntaConfirmacion = new JOptionPane();

        alReves = new JCheckBox("Dar la vuelta");
        this.add(alReves);

        habilitador = new JCheckBox("Habilita el TextField");
        this.add(habilitador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (preguntaConfirmacion.showConfirmDialog(this,
                String.format("¿Quieres poner el título \"%s\"?", texto.getText())) == JOptionPane.OK_OPTION) {
            this.setTitle(texto.getText());
        }
        if (alReves.isSelected()) {
            String aux = "";
            for (int i = texto.getText().length() - 1; i >= 0; i--) {
                aux += texto.getText().charAt(i);
            }
            this.setTitle(aux);
        }
    }
}
