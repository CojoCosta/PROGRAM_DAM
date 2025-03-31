package excepciones_pooavanzada.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    // #region B)
    /**
     * Función que devuelve una cantidad de caracteres desde una determinada
     * posición
     * 
     * @param frase              cadena principal
     * @param posicionInicio     posición de la cadena donde empezamos a devolver
     *                           caracteres
     * @param cantidadCaracteres nº de caracteres que devolvemos
     * @return La subcadena especificada
     */
    public static String subCadena(String frase, int posicionInicio, int cantidadCaracteres) {
        String cadenaFinal = "";
        if (posicionInicio < 0 || posicionInicio > frase.length()
                || (posicionInicio + cantidadCaracteres) > frase.length()) {
            throw new IllegalArgumentException("Has hecho algo mal");
        } else {
            for (int i = posicionInicio; i < cantidadCaracteres + posicionInicio; i++) {
                cadenaFinal += frase.charAt(i);
            }
        }
        return cadenaFinal;
    }
    // #endregion

    // #region C)
    /**
     * Función que muestra una cadena centrada en un nargen de 80 caracteres
     * 
     * @param frase cadena que pasamos
     */
    public static void muestraCentrado(String frase) {
        if (frase.length() > 80) {
            throw new InputMismatchException("El String es demasiado largo, se pasa de 80 caracteres");
        }
        int mitadDeAncho = 80 / 2;
        int largoDeCadena = frase.length() / 2;
        int centrado = mitadDeAncho - largoDeCadena;
        String espacios = " ";
        for (int i = 0; i < centrado; i++) {
            System.out.print(espacios);
        }
        System.out.println(frase);
    }

    // #endregion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        do {
            System.out.print("Escribe algo: ");
            try {
                frase = sc.nextLine();
                System.out.println("--------------------------------------------");
                System.out.println(subCadena(frase, 4, 10));
                System.out.println("--------------------------------------------");
                muestraCentrado(frase);
            } catch (IllegalArgumentException e) {
                System.out.println("");
                frase = "";
            }
        } while (frase == "");
    }
}
