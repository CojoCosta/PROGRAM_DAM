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

public class Aula {
    private int[][] notas;
    private String[] nombres;
    private String[] materias;

    // #region SET Y GET
    public int[][] getNotas() {
        return notas;
    }

    public void setNotas(int[][] notas) {
        this.notas = notas;
    }

    public void setNotas(int fila, int columna, int valor) {
        int[][] matrizNotas = new int[fila][columna];
        for (int i = 0; i < matrizNotas.length; i++) {
            for (int j = 0; j < matrizNotas[i].length; j++) {
                matrizNotas[i][j] = valor;
            }
        }
        this.notas = matrizNotas;
    }

    public String[] getNombres() {
        return nombres;
    }

    public String[] getMaterias() {
        return materias;
    }

    // #endregion
    // #region CONSTRUCTORES
    public Aula(String[] nombres, String[] materias) {
        this.nombres = nombres;
        this.materias = materias;
        int[][] matrizNotas = new int[nombres.length][materias.length];
        setNotas(matrizNotas);
        for (int i = 0; i < matrizNotas.length; i++) {
            for (int j = 0; j < matrizNotas[i].length; j++) {
                matrizNotas[i][j] = (int) (Math.random() * 11);
            }
        }
    }
    public Aula(int nombres, int materias){
        int[][] matrizNotas = new int [nombres][materias]; 
        setNotas(matrizNotas);
        for (int i = 1; i <= nombres; i++) {
            for (int j = 0; j < materias; j++) {
                matrizNotas[i][j] = (int)(Math.random() * 11);
            }
        }
    }
    //#endregion

    //#region FUNCIONES
    public void verTabla(int[][]notas){
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%4d",notas[i][j]);
            }
        }
    }
    public int media(int[][] notas){
        int acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                acumulador += notas[i][j];
            }
        }
        return acumulador / (notas.length * notas[0].length);
    }

    public int mediaAlumno(int [][] notas, int alumno){
        int acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (i == alumno){
                    acumulador += notas[i][j];
                }
            }
        }
        return acumulador / notas[alumno].length;
    }

    public int mediaMateria(int [][] notas, int materia){
        int acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (j == materia){
                    acumulador += notas[i][j];
                }
            }
        }
        return acumulador / notas.length;
    }

    public int notaMaxima(int[][] notas){
        int notaMaxima = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > notaMaxima) {
                    notaMaxima = notas[i][j];
                }
            }
        }
        return notaMaxima;
    }
    //#endregion
}
