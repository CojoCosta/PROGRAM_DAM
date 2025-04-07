package poo_avanzada.GUI_SWING;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FrmPrincipal extends JFrame {

    // Inicializamos la interfaz de usuario en el constructor
    public FrmPrincipal() {

        // // Llamando a super podemos inicializar el título de la ventana
        // super("The Sultans of Swing");
        // // Creamos una “Etiqueta de texto” y especificamos su toolTip
        // JLabel label = new JLabel("La aplicación perfecta");
        // label.setToolTipText("Esto es un componente JLabel");
        // // Incluímos la JLabel en la colección de componentes de la ventana
        // this.add(label);
        JLabel etiqueta1 = new JLabel("Etiqueta Uno");
        JLabel etiqueta2 = new JLabel("Etiqueta Dos");
        JButton boton1 = new JButton("Aceptar");
        JButton boton2 = new JButton("Cancelar");

        setLayout(null); //Con null TAMAÑO Y POSICIÓN
        etiqueta1.setLocation(0, 0);
        etiqueta2.setLocation(100, 0);
        boton1.setLocation(0, 100);
        boton2.setLocation(100, 100);
        etiqueta1.setSize(0, 0);
        etiqueta2.setSize(100, 0);
        boton1.setSize(0, 100);
        boton2.setSize(100, 100);
        
        setLayout(new FlowLayout());//CON FLOW SOLO POSICIÓN
        etiqueta1.setLocation(0, 0);
        etiqueta2.setLocation(100, 0);
        boton1.setLocation(0, 100);
        boton2.setLocation(100, 100);

        //.add sin colocar se sobre escriben uno encima del otro y solo se ve el ultimo
        // this.add(etiqueta1);
        // this.add(etiqueta2);
        // this.add(boton1);
        // this.add(boton2);

        //.add con distribución para que se vean todos
        this.add(etiqueta1, BorderLayout.NORTH);
        this.add(etiqueta2, BorderLayout.SOUTH);
        this.add(boton1, BorderLayout.EAST);
        this.add(boton2, BorderLayout.WEST);
    }
}