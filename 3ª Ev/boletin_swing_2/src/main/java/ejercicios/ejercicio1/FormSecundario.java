package ejercicios.ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FormSecundario extends JFrame implements ActionListener, ItemListener{

    private JComboBox<String> cboArchivos;
    private JTextArea txtTamaño;

    public FormSecundario() {
        this.setTitle("Buscador de archivos");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        // lista archivos
        String directorio = System.getProperty("user.home");
        File archivos = new File(directorio);
        String[] conjuntoDirectorios = archivos.list();
        
        cboArchivos = new JComboBox<String>(conjuntoDirectorios);
        cboArchivos.setLocation(20, 20);
        cboArchivos.setSize(200, 30);
        this.add(cboArchivos);
        cboArchivos.addActionListener(this);
        cboArchivos.addItemListener(this);
        
        txtTamaño = new JTextArea();
        txtTamaño.setLocation(240, 20);
        txtTamaño.setSize(150, 30);
        this.add(txtTamaño);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (!txtTamaño.getText().trim().equals("")) {
            cboArchivos.addItem(txtTamaño.getText());
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        txtTamaño.setText(String.format("Tamaño: %s",cboArchivos));
    }
}
