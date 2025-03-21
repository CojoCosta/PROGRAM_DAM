package Programas.BoletinTema3;

public class CosasdePiramides {


    public static void piramide(){
        int numero = 10;
        String espacio = "  ";
        String asterisco = " * ";
        for (int i = 0; i < numero; i++) {
            for (int b = numero + 1; b >= i; b--) {
                System.out.print(espacio);
            }
            System.out.println(asterisco);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        piramide();
    }
}
