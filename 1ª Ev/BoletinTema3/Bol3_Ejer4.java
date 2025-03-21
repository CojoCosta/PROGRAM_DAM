package Programas.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer4 {
    /**
     * Programa para verificar si un año es bisiesto
     * @param año Año a comporbar
     * @return  si es true es bisiesto y si es false  no
     */
    public static boolean bisiesto(int año){
        return año % 400 == 0 ? true : año %100 == 0 ? false : año %4 == 0 ;      
    }
    public static void main(String[] args) {
        int pedirAño;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los años que quieras comprobar y mete el año 0 para no pedir mas");
        do {
            System.out.print("¿Que años quieres saber si son bisiestos? ");
            pedirAño = sc.nextInt();            
            if (bisiesto(pedirAño) == true) {
                System.out.println("Este año es bisiesto");
            } else {
                System.out.println("Este año no es bisiesto");
            }
        } while (pedirAño != 0);
    }
}
