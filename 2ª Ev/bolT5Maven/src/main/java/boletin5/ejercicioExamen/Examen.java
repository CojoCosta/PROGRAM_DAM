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
package boletin5.ejercicioExamen;

import java.util.Scanner;

public class Examen {
    public static int[][] creaMatriz(int numeroMagos){
        int[][] matriz = new int[numeroMagos][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 5 + 1); 
            }
        }
        return matriz;
    }

    public static void muestraMatriz(int[][] matriz){
        if (matriz != null ) {
            System.out.printf("%4s%4S%4S%4S%4S\n","", "A", "F", "E", "W");
            for (int i = 0; i < matriz.length; i++) {
                System.out.printf("%4d", i +1);
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%4d", matriz[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static int poderDeMago(int [][] matriz, int fila){
        int acumulador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == fila -1) {
                    acumulador += matriz[i][j];
                }
            }
        }
        return acumulador;
    }

    public static void intercambioDePoder(int [][] matriz, int fila1, int fila2) throws Exception{
        if (fila1 < 0 || fila1 > matriz.length || fila2 < 0 || fila2 > matriz.length ) {
            throw new IllegalArgumentException("Valor incorrecto");
        } else{

            int[]auxiliar = matriz[fila1 - 1];
            matriz[fila1 - 1] = matriz[fila2 - 1];
            matriz[fila2 - 1] = auxiliar;
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        int [][] matriz = creaMatriz(11);
        int fila;
        System.out.println("Matriz:");
        muestraMatriz(matriz);
        System.out.println();
        System.out.print("Dime el numero de un mago: ");
        fila = sc.nextInt();
        System.out.printf("El Mago numero %d tiene %d de poder.",fila ,poderDeMago(matriz, fila));
        try {
            intercambioDePoder(matriz, 1, 12);
        } catch (Exception e) {
            System.out.println("\nValor incorrecto");
        }
        System.out.println("Nueva matriz:");
        muestraMatriz(matriz);
    }
}
