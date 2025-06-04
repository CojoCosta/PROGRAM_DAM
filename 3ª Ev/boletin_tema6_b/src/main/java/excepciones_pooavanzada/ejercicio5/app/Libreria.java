package excepciones_pooavanzada.ejercicio5.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {
    public static int pedirEntero(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int numero = 0;
        System.out.print("Escribe un numero entero: ");
        do {
            try {
                numero = sc.nextInt();
            } catch (IllegalArgumentException e) {
                System.out.print("Escribe un numero entero: ");
                sc.nextLine();
                flag = false;
            }
        } while (flag == false);
        
        return numero;
    }

    public static double pedirReal(){
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        boolean flag = true;
        System.out.print("Escribe un numero: ");
        do {
            try {
                numero = sc.nextDouble();
            } catch (IllegalArgumentException e) {
                System.out.print("Escribe un numero: ");
                sc.nextLine();
                flag = false;
            }
        } while (flag == false);
        
        return numero;
    }
        public static void pedirString(String cadena) { 
        System.err.println(cadena);
        ArrayList<Character> cadenaConTrim = new ArrayList<Character>();
        for (int j = 0; j < cadena.length(); j++) {
            cadenaConTrim.add(cadena.charAt(j));
        }
        while (cadenaConTrim.get(0) == ' ') {
            cadenaConTrim.remove(0);
        }
        while (cadenaConTrim.get(cadenaConTrim.size() - 1) == ' ') {
            cadenaConTrim.remove(cadenaConTrim.size() - 1);
        }
        this.cadena = cadenaConTrim; 
        System.err.print(cadenaConTrim);

    }
}