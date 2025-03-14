/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2025 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
package boletin5.ejercicio2;

public class MatrizAleatoria {
    public static char[][] letrasAleatorias(int n, int m) {
        char[][] listaLetras = new char[n][m];
        for (int i = 0; i < listaLetras.length; i++) {
            for (int j = 0; j < listaLetras[0].length; j++) {
                listaLetras[i][j] = (char) (Math.random() * 26 + 65);
            }
        }
        return listaLetras;
    }

    public static void mostrarMatriz(char[][] matrices) {
        System.out.print("   ");
        for (int i = 0; i < matrices[0].length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        int numero = 0;
        for (char[] fila : matrices) {
            System.out.printf("%3d", numero);
            numero++;
            for (char letra : fila) {
                System.out.printf("%3S", letra);
            }
            System.out.println();
        }
    }

    public static boolean intercambioPosiciones(char[][] letras, int n1, int n2, int n3, int n4) {
        char auxiliar;
        if (n1 >= letras.length || n3 >= letras.length || n1 < 0 || n3 < 0 || n2 >= letras[0].length || n4 >= letras[0].length
                || n2 < 0 || n4 < 0) {
                                return false;
        } else {
            auxiliar = letras[n1][n2];
            letras[n1][n2] = letras[n3][n4];
            letras[n3][n4] = auxiliar;
            return true;
        }
    }

    public static char letraMayor(char[][] letras) {
        char auxiliar = letras[0][0];
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[0].length; j++) {
                if (auxiliar < letras[i][j]) {
                    auxiliar = letras[i][j];
                }
            }
        }
        return auxiliar;
    }

    public static char letraMenor(char[][] letras) {
        char auxiliar = letras[0][0];
        for (char[] fila : letras) {
            for (char letra : fila) {
                if (auxiliar > letra) {
                    auxiliar = letra;
                }
            }
        }
        return auxiliar;
    }

    public static void main(String[] args) {
        char[][] matriz1 = letrasAleatorias(3, 4);
        char[][] matriz2 = letrasAleatorias(3, 4);

        mostrarMatriz(matriz1);
        System.out.println();
        mostrarMatriz(matriz2);
        System.out.println();
        System.out.println(intercambioPosiciones(matriz1, 0, 2, 0, 2));
        System.out.println();
        System.out.println(intercambioPosiciones(matriz1, 1, 2, 0, 0));

    }
}
