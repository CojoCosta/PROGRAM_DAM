package poo_avanzada.GUI_SWING;

import javax.swing.*;
//FORMA RUDIMENTARIA E INCORRECTA

//GUI graphic User Interface
public class PruebaGUI {
    public static void main(String[] args) {
        // Creamos la ventana con un título a través del constructor
        JFrame frame = new JFrame("The Sultans of Swing");
        //Si usamos un constructor new Jframe sin titulo (sin parametro)
        frame.setTitle("Aqui el título");

        // Creamos una “Etiqueta de texto” y especificamos su toolTip
        JLabel lbl = new JLabel("Que texto meto en el primer JLabel");
        lbl.setToolTipText("Esto es un componente JLabel");
        frame.add(lbl);//meto el texto del nuevo objeto
        lbl.setToolTipText("Esto es un ejemplo de tooltip");
        
        // Indica que si se le da al botón de cierre lo que se cierra es
        // la aplicación, no sólo la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tamaño de la ventana
        frame.setSize(300, 200);
        // la hacemos visible y se queda a la espera de eventos
        frame.setVisible(true);
    }
}