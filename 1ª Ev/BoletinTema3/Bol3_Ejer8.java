package Programas.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer8 {
    /**
     * Programa para saber si un numero es primo
     * 
     * @param n numero a comprobar
     * @return si es primo o no
     */
    public static boolean primo(int n) { 
        if (n <= 1) {
            return false; // Si es menor que uno no es primo
        }
        if (n == 2 || n == 3) {

            return true; // Si es 2 / 3 es primo
        }
        if (n % 2 == 0 || n % 3 == 0) {

            return false; // Si es divisible entre 2 / 3 no es primo
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){

                return false;
            }
        }
        return true;
    }

    /**
     * escribe los numeros primos desde el 2 hasta al numero introducido
     * 
     * @param n numero introducido
     */
    public static void numerosPrimos(int n) {
        for (int i = 2; i <= n; i++) {
            if (primo(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {  
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero mayor que 2: ");
        numero = sc.nextInt();
        System.out.println(primo(numero));
        numerosPrimos(numero);
    }
}
