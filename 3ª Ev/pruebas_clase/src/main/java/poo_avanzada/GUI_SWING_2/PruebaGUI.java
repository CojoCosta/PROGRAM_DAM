package poo_avanzada.GUI_SWING_2;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;

public class PruebaGUI {
    public static void main(String[] args) {
        // ComboBox frame = new ComboBox();
        // frame.setSize(900, 900);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLocationRelativeTo(null);
        // frame.setVisible(true);

        Scanner sc = new Scanner(System.in);
        String path;
        System.out.printf("Introduce path de archivo o directorio: ");
        path = sc.nextLine();
        File f = new File(path);
        if (f.exists()) {
            System.out.printf(
                    "%s existe\n%s un archivo\nTamaño %d bytes\n",
                    f.getName(), f.isFile() ? "Es" : "No es", f.length());
            System.out.printf("La ruta completa es %s\n", f.getPath());
        } else {
            System.out.println("El fichero/directorio no existe");
        }
    }

}