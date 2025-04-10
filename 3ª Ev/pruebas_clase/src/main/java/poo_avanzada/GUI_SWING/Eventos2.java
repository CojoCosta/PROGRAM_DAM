package poo_avanzada.GUI_SWING;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Eventos2 extends JFrame implements ActionListener {
    // Declaración de los componentes
    JLabel etiqueta1;
    JButton btnIncremento;
    JButton btnDecremento;
    int contador;

    // Constructor
    public Eventos2() {
        super("Controlando eventos II");
        this.setLayout(new FlowLayout());

        contador = 0;

        // Botón Incremento
        btnIncremento = new JButton("Incremento");
        btnIncremento.addActionListener(this);
        this.add(btnIncremento);

        // Botón Decremento
        btnDecremento = new JButton("Decremento");
        btnDecremento.addActionListener(this);
        this.add(btnDecremento);

        // Etiqueta
        etiqueta1 = new JLabel(contador + "");
        this.add(etiqueta1);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        // Comprobador de funcionamiento
        System.err.println("Pulsado: " + evento.getModifiers() + " " + evento.getActionCommand());
        System.err.println(Integer.toBinaryString(evento.getModifiers()));
        int salto = 1;
        
        // En el título del formulario ponemos el componente afectado
        this.setTitle(evento.getActionCommand());
        
        // Si se está pulsando SHIFT incrementa/decrementa en 10
        if ((evento.getModifiers() & ActionEvent.SHIFT_MASK) == ActionEvent.SHIFT_MASK) {
            salto = 10;
        }

        // Si se ha pulsado el botón incremento...
        if (evento.getSource() == btnIncremento) {
            contador += salto;
        }

        // Si se ha pulsado el botón decremento...
        if (evento.getSource() == btnDecremento) {
            contador -= salto;
        }
        
        // Actualizamos la etiqueta al nuevo valor
        etiqueta1.setText(String.format("%10d", contador));
    }
}