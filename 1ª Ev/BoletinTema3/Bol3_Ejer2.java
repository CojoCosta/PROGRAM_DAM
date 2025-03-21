package Programas.BoletinTema3;
import java.util.Scanner;
import java.io.PrintWriter;
public class Bol3_Ejer2 {
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

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        PrintWriter f = new PrintWriter("./Programas/Tema3/BoletinTema3/Ej1.txt");
        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();
        lineasBlanco(10);
        System.out.print("Dime un numero: ");
        int numero = sc.nextInt();
        System.out.println("\nTu numero es: " + par(numero) + " y " + positivo(numero));
        f.println(nombre);
        f.println(numero);
        f.print("Tu numero es: " + (par(numero)?"bi":"no bi") + " y " + positivo(numero));

        f.close();
    }
}