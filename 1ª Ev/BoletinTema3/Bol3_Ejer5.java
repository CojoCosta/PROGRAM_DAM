package Programas.BoletinTema3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bol3_Ejer5 {
    /**
     * comprobar si un año es bisiesto y escribir los años bisiestos hasta la actualidad
     * @param año año a comprobar
     * @throws Exception
     */
    public static void escribirAñosFile(int año) throws Exception {
        PrintWriter f = new PrintWriter("./Programas/Tema3/BoletinTema3/Ej5.txt");
        if (Bol3_Ejer4.bisiesto(año)) {
            f.printf("EL %d es bisiesto", año);
        } else {
            f.printf("\nEl %d no es bisiesto", año);
        }
        for (int i = año; i <= 2024; i++) {
            if (Bol3_Ejer4.bisiesto(i)) {
                f.printf("\n%d", i);
            }
        }
        f.close();
    }
    /**
     * 
     * @param archivo Archivo donde se escribirán los años bisiestos y los que no lo son
     * @return String con los datos del archivo
     * @throws Exception
     */
    public static String leerAñosFile(String archivo) throws Exception{
        Scanner file = new Scanner(new File(archivo));
        String contenidoarchivo = ""; // Almacena los datos del archivo 
        file.nextLine(); // Salto de la primera línea para que no la lea
        while (file.hasNext()) { // Bucle que lee todas las líneas de archivo (Excepto la primera)
            contenidoarchivo = file.nextLine();
            System.out.printf("%6s;", contenidoarchivo);
        }
        System.out.println(); // Salto de línea
        file.close();
        return contenidoarchivo;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Introduce un año: ");
        año = sc.nextInt();
        escribirAñosFile(año);
        leerAñosFile("./Programas/Tema3/BoletinTema3/Ej5.txt");
    }
}

// **5. Haz un programa que realice las siguientes tareas:
// Pide un año al usuario y guarda en un archivo dicho año en la primera línea
// indicando si es o no bisiesto y a continuación todos los bisiestos desde ese año
// hasta el año actual (cada uno en una línea).
// Un ejemplo de como puede quedar el archivo:
// 2015 No es bisiesto.
// 2016
// 2020
// 2024
// A continuación lee el archivo y muestra en pantalla todos los años menos el
// primero. Debe estar separados por comas en la misma linea y ocupando 6
// caracteres.
// Si este programa lo tienes en la misma carpeta que el de bisiesto no es necesario
// que copies la función, puedes acceder a ella poniendo NombreClase.nombreFuncion.
// Por ejemplo:
// Bol3Ejer4.bisiesto(2024);