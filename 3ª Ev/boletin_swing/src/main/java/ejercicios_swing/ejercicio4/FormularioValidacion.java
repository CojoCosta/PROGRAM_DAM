package ejercicios_swing.ejercicio4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FormularioValidacion extends JFrame{
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
        
        validacionDeDatos(txfNombre, txfEdad, txfDireccion);
        btnGuardar = new JButton();
        btnGuardar.setSize(100, 30);
        btnGuardar.setLocation(0, 40);
        this.add(btnGuardar);
        
        
        btnCargar = new JButton();
        btnCargar.setSize(100, 30);
        btnCargar.setLocation(120, 40);
        this.add(btnCargar);
    }

    public boolean validacionDeDatos(JTextField nombre, JTextField edad, JTextField direccion){
        if (nombre.isEmpty()) {
            
        }
        return true;
    }
    
}
