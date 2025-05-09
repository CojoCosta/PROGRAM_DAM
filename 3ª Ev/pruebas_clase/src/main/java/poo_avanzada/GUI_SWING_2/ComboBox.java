package poo_avanzada.GUI_SWING_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComboBox extends JFrame implements ItemListener, ActionListener {
    JComboBox<String> cbMarcas;
    JButton btnAnadir;
    JTextField txtMarca;
    JLabel lblSeleccion;
    String[] marcasInfo = { "AMD", "Apple", "Canonical", "IBM",
            "Microsoft", "Novell", "Oracle" };

    public ComboBox() {
        super("Lista desplegable");
        setLayout(new FlowLayout());

        cbMarcas = new JComboBox<String>(marcasInfo);
        cbMarcas.setMaximumRowCount(8);
        cbMarcas.setSelectedIndex(3);
        cbMarcas.addItemListener(this);
        add(cbMarcas);

        txtMarca = new JTextField(20);
        txtMarca.addActionListener(this);
        add(txtMarca);

        btnAnadir = new JButton("Añadir");
        btnAnadir.addActionListener(this);
        add(btnAnadir);

        lblSeleccion = new JLabel(String.format("Elemento seleccionado: %s, Índice: %d", cbMarcas.getSelectedItem(), cbMarcas.getSelectedIndex()));
        add(lblSeleccion);
        
    }

    @Override
    public void itemStateChanged(ItemEvent arg0) {
        lblSeleccion.setText(String.format(
                "Elemento seleccionado: %s, Índice: %d",
                cbMarcas.getSelectedItem(), cbMarcas.getSelectedIndex()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!txtMarca.getText().trim().equals("")) {
            cbMarcas.addItem(txtMarca.getText());
        }
    }
}
