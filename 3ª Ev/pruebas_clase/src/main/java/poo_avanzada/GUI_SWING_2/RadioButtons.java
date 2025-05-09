package poo_avanzada.GUI_SWING_2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtons extends JFrame implements ItemListener {
    JLabel lbl;
    JRadioButton rbNegro;
    JRadioButton rbRojo;
    JRadioButton rbArial;
    JRadioButton rbSerif;
    ButtonGroup grupoColor;
    ButtonGroup grupoFont;

    public RadioButtons() {
        super("Botones de estado");
        setLayout(new FlowLayout());
        lbl = new JLabel("Etiqueta de prueba");
        lbl.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lbl);

        rbNegro = new JRadioButton("Negro");
        rbNegro.setForeground(Color.BLACK);
        rbNegro.addItemListener(this);
        add(rbNegro);

        rbRojo = new JRadioButton("Rojo");
        rbRojo.setForeground(Color.RED);
        rbRojo.addItemListener(this);
        add(rbRojo);

        rbArial = new JRadioButton("Arial");
        rbArial.setFont(new Font("Arial", Font.PLAIN, 14));
        rbArial.addItemListener(this);
        add(rbArial);

        rbSerif = new JRadioButton("Serif");
        rbSerif.setFont(new Font("Serif", Font.PLAIN, 14));
        rbSerif.addItemListener(this);
        add(rbSerif);

        grupoColor = new ButtonGroup();
        grupoColor.add(rbNegro);
        grupoColor.add(rbRojo);

        grupoFont = new ButtonGroup();
        grupoFont.add(rbArial);
        grupoFont.add(rbSerif);

        rbNegro.setSelected(true);
        rbArial.setSelected(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton rb = (JRadioButton) e.getSource();
        if (rb == rbNegro || rb == rbRojo) {
            lbl.setForeground(rb.getForeground());
        } else {
            lbl.setFont(rb.getFont());
        }
    }
}
