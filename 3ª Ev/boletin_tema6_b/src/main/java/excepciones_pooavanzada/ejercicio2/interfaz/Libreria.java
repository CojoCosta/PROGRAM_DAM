package excepciones_pooavanzada.ejercicio2.interfaz;

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
        sc.close();
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
        sc.close();
        return numero;
    }
}