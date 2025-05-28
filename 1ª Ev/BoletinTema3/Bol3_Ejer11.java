package Programas.BoletinTema3;

import java.util.Scanner;

/**
 * Coseno de un ángulo aproximado por Taylor
 */
public class Bol3_Ejer11 {
    public static double factorial(int n) {
        return n == 0 || n == 1 ? 1 : n * factorial(n - 1);
    }
    /**
     * Calcula la potencia de un número 
     * X es el número al que se calcula la potencia
     * n es el exponente y el factorial de ese número
     */
    public static double cosenoTaylor(double x, int n) {
        double resultado = 0;
        for (int i = 0; i <= n; i = i+2) {
            resultado = 1 - (Bol3_Ejer6.potencia(x, i) / factorial(i));//Alterna resta y suma
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number;
        System.out.print("Introduce un numero: ");
        number = sc.nextDouble();
        for (double i = 0.1; i <= 1; i = i+0.1) {
            number = cosenoTaylor(i, 4);
            System.out.print(i + " " +number);
            System.out.printf("\nCoseno de %f es %f\n\n",i, Math.cos(i));
        }
        sc.close(); 
    }
}
// 11. a) Realizar una función que devuelva el factorial de un número seg ún se
// definió en el boletín anterior (recuerda que 0!=1). Hazlo con parámetro int pero
// que devuelva double o long.

// b) El cálculo del coseno de un ángulo se puede aproximar por el siguiente cálculo
// (aproximación de Taylor):
// Realizar un método que realice y devuelva dicho cálculo (hazlo al menos hasta el
// termino de potencia 4. Si quiere mete más). Debes usar la función factorial hecha
// en el apartado anterior y la de potencia hecha en un ejercicio previo.

// c) Realizar un programa que muestre por pantalla los cosenos de los ángulos de 0.1
// , 0.2, y hasta 1 radian. Además en cada línea mostrará el resultado del coseno
// según tu función y el error absoluto obtenido de restarlo de la función Math.cos().
// Usa 5 decimales de aproximación para todo y que los valores ocupen 8 posiciones.
