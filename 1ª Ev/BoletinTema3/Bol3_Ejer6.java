package Programas.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer6 {
    /**
     * Ejercicio de calcular el resultado de una potencia
     * @param base Base del numero a comprobar
     * @param exponente Exponente del numero a comprobar
     * @return resultado potencia
     */
    public static double potencia(double base, int exponente) {
        double acu = 1;
        if (exponente >= 0) {
            for (int i = 1; i <= exponente; i++) {
                acu = acu * base;
            } 
        }else {
            // base = 1/base;
            // exponente=-exponente;
                for (int i = 0; i > exponente; i--) {
                    acu = acu * (1/base);
            }
        }
        return acu;
    }
    /**
     * Muestra todas las potencias
     * @param n Base del numero a comprobar
     * @param a Exponente del numero a comprobar
     */
    public static void numeroPotencias(double n, int a){
        for(int i = 0; i < a ; i++){
            System.out.printf("\n%.2f\n", potencia(n, i) );
        }        
    }
    /**
     * Suma de las potencias
     * @param x Base del numero a comprobar
     * @param y Exponente del numero a comprobar
     * @return Suma de las potencias
     */
    public static double progresionGeometrica(double x, int y){
        double acu = 1;
        for(int i = 1; i <= y ; i++){ 
            acu = acu + potencia(x, i);
        }
        return acu ;
    }

        public static void main(String[] args) {

        /** apartado a */
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la base: ");
        double base = sc.nextDouble();
        System.out.print("Dime el exponente: ");
        int exponente = sc.nextInt();
        System.out.printf("\nEl resultado es: %.2f\n", potencia(base, exponente));

        /** Apartado b */
        numeroPotencias(base, exponente);

        /**Apartado c */
        System.out.println(progresionGeometrica(base, exponente));
        
    }
}