package poo_avanzada.GUI_SWING;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FrmPrincipal extends JFrame {
    //Declaramos siempre asi
    private JLabel etiquetas;
    JLabel etiqueta;
    private JButton botones;
    JButton boton;


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
        etiqueta1.setLocation(0, 0);
        etiqueta1.setSize(100, 20);
        // etiqueta1.setBounds(0,0, 10, 20);//lo de arriba simplificado
        this.add(etiqueta1, BorderLayout.NORTH);
        
        JLabel etiqueta2 = new JLabel("Etiqueta Dos");
        etiqueta2.setLocation(100, 0);
        etiqueta2.setSize(100, 0);
        this.add(etiqueta2, BorderLayout.SOUTH);
        
        JButton boton1 = new JButton("Aceptar");
        boton1.setLocation(0, 100);
        boton1.setSize(0, 100);
        this.add(boton1, BorderLayout.EAST);
        
        JButton boton2 = new JButton("Cancelar");
        boton2.setLocation(100, 100);
        boton2.setSize(100, 100);
        this.add(boton2, BorderLayout.WEST);
        
        setLayout(null); //Con null TAMAÑO Y POSICIÓN
        
        //1º POSICIÓN Y 2º TAMAÑO
        etiqueta1.setBounds(100,100,100,100);
        
        
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
    }
}