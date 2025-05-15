package ejercicios.ejercicio1;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FormSecundario extends JFrame{
    
    private JComboBox<String> cboArchivos;
    private JTextArea txtTamaño;
    public FormSecundario(){
        this.setTitle("Buscador de archivos");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        cboArchivos = new JComboBox<String>();
        cboArchivos.setLocation(20, 20);
        cboArchivos.setSize(200, 30);
        this.add(cboArchivos);
        
        txtTamaño = new JTextArea();
        txtTamaño.setLocation(240, 20);
        txtTamaño.setSize(30, 30);
        this.add(txtTamaño);
    }

    
}
