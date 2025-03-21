package Programas.BoletinTema3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;

public class Bol3_Ejer7 { 
    /**
     * lee el archivo y devuelve su contenido
     * @param archivo Nombre o ruta del archivo
     * @return Contenido del archivo
     */
    public static String readFile(String archivo) throws Exception {
        Scanner f = new Scanner(new File(archivo));
        String contentFile = "";
        while (f.hasNext()) {
            contentFile = contentFile + f.nextLine();
            // System.out.println(contentFile);
        }
        f.close();
        return contentFile;
    }

    /**
     * Añade cierto texto a un archivo
     * @param archivo escribe el contenido en el archivo
     * @param msg mensaje a añadir
     */
    public static void appendFile(String archivo, String msg) throws Exception { 
        PrintWriter fwritter = new PrintWriter(archivo);
        String content = readFile(archivo) + "\n" + msg; // Leer contenido y añadir el msg
        fwritter.print(content + msg); // Reescribir el archivo
        fwritter.close();
    }
    /**
     * 
     * @param archivo archivo donde se añadirá el mensaje
     * @param añadirMsg mensaje a añadir
     * @throws Exception
     */
    public static void appendFile2(String archivo, String añadirMsg) throws Exception {
        PrintWriter f = new PrintWriter(new FileWriter(archivo, true));
        f.println();
        f.println(añadirMsg);
        f.close();
    }

    public static void main(String[] args) throws Exception { 
        System.out.println(readFile("./Programas/Tema3/BoletinTema3/Ej7.txt"));
        Scanner sc = new Scanner(System.in);
        String msg; // Almacena mensaje del user
        System.out.print("Introduce un mensaje: ");
        msg = sc.nextLine();
        System.out.println(readFile("./Programas/Tema3/BoletinTema3/Ej7.txt"));
        appendFile("./Programas/Tema3/BoletinTema3/Ej7.txt", "hola");
        System.out.println(readFile("./Programas/Tema3/BoletinTema3/Ej7.txt"));
        appendFile2("./Programas/Tema3/BoletinTema3/Ej7.txt", "adios");
        System.out.println(readFile("./Programas/Tema3/BoletinTema3/Ej7.txt"));
    }
}