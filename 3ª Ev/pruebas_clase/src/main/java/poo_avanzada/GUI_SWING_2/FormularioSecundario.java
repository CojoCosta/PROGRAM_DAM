package poo_avanzada.GUI_SWING_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormularioSecundario  extends JDialog implements ActionListener {
    JLabel lblInfo;
    JLabel lblTitulo;
    JTextField txtTitulo;

    public FormularioSecundario(FormularioPrincipal f) {
        super(f, false); // Modal: true, No modal: false
        setLayout(new FlowLayout());
        setTitle("Ventana secundaria");
        lblInfo = new JLabel();
        add(lblInfo);
        lblTitulo = new JLabel("Título para el formulario principal");
        add(lblTitulo);
        txtTitulo = new JTextField(10);
        txtTitulo.addActionListener(this);
        add(txtTitulo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FormularioPrincipal f = (FormularioPrincipal) this.getOwner();
        f.setTitle(txtTitulo.getText());
    }

}
