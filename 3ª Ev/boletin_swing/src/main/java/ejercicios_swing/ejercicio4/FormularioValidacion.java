package ejercicios_swing.ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioValidacion extends JFrame implements ActionListener{
    private JTextField txfNombre;
    private JTextField txfEdad;
    private JTextField txfDireccion;
    private JButton btnGuardar;
    private JButton btnCargar;

    public FormularioValidacion(){
        this.setTitle("Formulario");
        this.setLayout(null);

        txfNombre = new JTextField();
        txfNombre.setSize(100, 30);
        txfNombre.setLocation(0, 0);
        this.add(txfNombre);        
        
        txfEdad = new JTextField();
        txfEdad.setSize(100, 30);
        txfNombre.setLocation(120, 0);
        this.add(txfEdad);        
        
        txfDireccion = new JTextField();
        txfDireccion.setSize(100, 30);
        txfDireccion.setLocation(240, 0);
        this.add(txfDireccion);
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.setSize(100, 30);
        btnGuardar.setLocation(0, 40);
        this.add(btnGuardar);
        btnGuardar.addActionListener(this);
        
        
        btnCargar = new JButton("Cargar");
        btnCargar.setSize(100, 30);
        btnCargar.setLocation(120, 40);
        this.add(btnCargar);
        btnCargar.addActionListener(this);
    }

    public boolean validacionDeDatos(String nom, String ed, String dir){
        String nombre = nom.trim();
        String edad = ed.trim();
        String direccion = dir.trim();
        int edadNumero = 0;
        try {
            edadNumero = Integer.parseInt(edad);
        } catch (NumberFormatException e) {
            System.out.println("Pon numeros gilipollas");
        }

        if (nombre.isEmpty() ||edad.isEmpty() || direccion.isEmpty() || edadNumero <= 0){
            return false;
        }else {            
            return true;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (validacionDeDatos(txfNombre.getText(), txfEdad.getText(), txfDireccion.getText()) == false){
            JOptionPane.showConfirmDialog(this, "Datos inválidos");
        } else{
            
        }

        }
    

}
