package Programas.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer1 {
    /**
     * deja lineas en blanco
     * @param n Nº de lineas en blanco
     */
    public static void lineasBlanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
    /**
     * Comprobador de par o impar
     * @param n Nº a comprobar
     * @return verdadero si es par falso si es impar
     */
    public static boolean par(int n) {
        return n % 2 == 0;
    }
    /**
     * Comprobador de positivo o negativo
     * @param n Nº a comprobar
     * @return P si es positivo y N si es negativo
     */
    public static char positivo(int n) {
        return n >= 0 ? 'P' : 'N';

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();
        lineasBlanco(10);
        System.out.print("Dime un numero: ");
        int numero = sc.nextInt();
        System.out.println("\nTu numero es: " + par(numero) + " y " + positivo(numero));
    }
}
