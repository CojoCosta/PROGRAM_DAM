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
package boletin5.ejercicio9;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        Aula aula1 = new Aula(3, 3);
        int option;
        do {
            System.out.println("1.- Ver tabla de notas: ");
            System.out.println("2.- Ver notas de un alumno: ");
            System.out.println("3.- Ver notas de una materia: ");
            System.out.println("4.- Calcular media de notas global: ");
            System.out.println("5.- Media de un alumno: ");
            System.out.println("6.- Media de una materia: ");
            System.out.println("7.- Nota máxima y mínima de una asignuta: ");
            System.out.println("8.- Modificar una nota: ");
            System.out.println("9.- Salir.");
            System.out.print("Elige una opcion: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                case 6:
                    ;
                case 7:
                int[][] matrizPrueba = new int[4][4];
                    System.out.println(aula1.notaMaxima(matrizPrueba));
                case 8:
                    ;
                    break;
                case 9:
                    System.out.println("Gracias por usar el programa");;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 9);
    }
}
