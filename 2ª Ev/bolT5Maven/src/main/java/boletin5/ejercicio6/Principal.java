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
package boletin5.ejercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroFila;
        Matriz matriz = new Matriz(3);
        int n;
        do {
            do {
                System.out.println("\nElija una de las siguiente:");
                System.out.println("1.- Mostrar matriz.");
                System.out.println("2.- Mostrar suma de todos los elementos.");
                System.out.println("3.- Mostrar suma de la diagonal.");
                System.out.println("4.- Mostrar suma de los elementos salvo diagonal ");
                System.out.println("5.- Mostrar suma de elementos de una fila.");
                System.out.println("6.- Mostrar matriz sin una fila.");
                System.out.println("7.- Salir");
                System.out.print("Opcion: ");
                n = sc.nextInt();
            } while (n < 1 || n > 7);
            switch (n) {
                case 1:
                    matriz.mostrarMatriz(matriz.matriz);

                    break;
                case 2:
                    System.out.printf("Suma de todos los elementos: %d\n", matriz.sumaMatriz());

                    break;
                case 3:
                    System.out.printf("Suma de la diagonal: %d\n", matriz.sumaMatriz(true));

                    break;
                case 4:
                    System.out.printf("Suma de elementos menos la diagonal: %d\n", matriz.sumaMatriz(false));

                    break;
                case 5:
                    System.out.print("¿Que fila quieres sumar sus elementos?: ");
                    numeroFila = sc.nextInt();
                    System.out.printf("Suma de elementos de una fila: %d\n", matriz.sumaMatriz(numeroFila - 1));

                    break;
                case 6:
                    System.out.print("\n¿Que fila quieres eliminar de la matriz?: ");
                    numeroFila = sc.nextInt();
                    int[][] aux = matriz.borrarFila(numeroFila);
                    Matriz.mostrarMatriz(aux);

                    break;
                default:
                    System.out.println("Fin del programa");
                    break;
            }
        } while (n != 7);
        sc.close();
    }
}
