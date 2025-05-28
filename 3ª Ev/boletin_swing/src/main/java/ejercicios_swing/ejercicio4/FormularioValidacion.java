package ejercicios_swing.ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FormularioValidacion extends JFrame implements ActionListener {
    private JLabel etiquetaNombre;

    private JTextField txfNombre;
    private JLabel etiquetaEdad;
    private JTextField txfEdad;
    private JLabel etiquetaDireccion;
    private JTextField txfDireccion;
    private JButton btnGuardar;
    private JButton btnCargar;

    public FormularioValidacion() {
        this.setTitle("Formulario");
        this.setLayout(null);

        etiquetaNombre = new JLabel("Nombre");
        etiquetaNombre.setSize(100, 30);
        etiquetaNombre.setLocation(10, 0);
        this.add(etiquetaNombre);

        txfNombre = new JTextField();
        txfNombre.setSize(100, 30);
        txfNombre.setLocation(120, 0);
        this.add(txfNombre);

        etiquetaEdad = new JLabel("Edad");
        etiquetaEdad.setSize(100, 30);
        etiquetaEdad.setLocation(10, 40);
        this.add(etiquetaEdad);

        txfEdad = new JTextField();
        txfEdad.setSize(100, 30);
        txfEdad.setLocation(120, 40);
        this.add(txfEdad);

        etiquetaDireccion = new JLabel("Dirección");
        etiquetaDireccion.setSize(100, 30);
        etiquetaDireccion.setLocation(10, 80);
        this.add(etiquetaDireccion);

        txfDireccion = new JTextField();
        txfDireccion.setSize(100, 30);
        txfDireccion.setLocation(120, 80);
        this.add(txfDireccion);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setSize(100, 30);
        btnGuardar.setLocation(0, 120);
        this.add(btnGuardar);
        btnGuardar.addActionListener(this);

        btnCargar = new JButton("Cargar");
        btnCargar.setSize(100, 30);
        btnCargar.setLocation(120, 120);
        this.add(btnCargar);
        btnCargar.addActionListener(this);
    }

    public boolean validacionDeDatos(String nom, String ed, String dir) {
        String nombre = nom.trim();
        String edad = ed.trim();
        String direccion = dir.trim();
        int edadNumero = 0;
        try {
            edadNumero = Integer.parseInt(edad);
        } catch (NumberFormatException e) {
            System.out.println("Pon numeros");
        }

        if (nombre.isEmpty() || edad.isEmpty() || direccion.isEmpty() || edadNumero <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void escribirArchivo(String nombre, String edad, String direccion) throws IOException {
        FileWriter fw = new FileWriter("Archivo.txt");
        fw.write(nombre + ";" + edad + ";" + direccion);
        fw.close();
    }

    public String[] escanearArchivo() throws FileNotFoundException {
        String cadena = "";
        try {
            Scanner sc = new Scanner(new File("Archivo.txt"));
            while (sc.hasNext()) {
                String cadenaFinal = sc.nextLine();
                cadena += cadenaFinal.trim();
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        }
        return cadena.split(";");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {

            if (validacionDeDatos(txfNombre.getText(), txfEdad.getText(), txfDireccion.getText()) == false) {
                JOptionPane.showMessageDialog(this, "Datos inválidos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    escribirArchivo(txfNombre.getText(), txfEdad.getText(), txfDireccion.getText());
                } catch (IOException e1) {
                }
            }
        }

        if (e.getSource() == btnCargar) {
            try {
                int respuesta = 1;
                String[] lista = escanearArchivo();
                if (lista.length != 3) {
                    throw new FileNotFoundException();
                } else if (txfNombre.getText().trim().equals("") || txfEdad.getText().trim().equals("")
                        || txfDireccion.getText().trim().equals("")) {
                    txfNombre.setText(lista[0]);
                    txfEdad.setText(lista[1]);
                    txfDireccion.setText(lista[2]);
                } else {
                    respuesta = JOptionPane.showConfirmDialog(this, "Desea borrar los datos anteriores¿?", "ALERTA!",
                            JOptionPane.YES_NO_OPTION);
                }
                if (respuesta == JOptionPane.YES_OPTION) {
                    if (validacionDeDatos(txfNombre.getText(), txfEdad.getText(), txfDireccion.getText()) == false) {
                        JOptionPane.showMessageDialog(this, "Datos inválidos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        txfNombre.setText(lista[0]);
                        txfEdad.setText(lista[1]);
                        txfDireccion.setText(lista[2]);
                    }
                }
            } catch (FileNotFoundException e1) {
            }
        }
    }
}
