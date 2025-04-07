package poo_avanzada.GUI_SWING;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class HolaWin{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,
                "Welcome to the Java World",//mensaje 
                "Usando Swing",//titulo
                JOptionPane.INFORMATION_MESSAGE);//Icono en la ventana emergente

        System.out.println("Hellow world!");
    }
}
