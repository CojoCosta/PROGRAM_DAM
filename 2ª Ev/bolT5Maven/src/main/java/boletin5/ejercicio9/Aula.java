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
        for (int i = 0; i < nombres; i++) {
            for (int j = 0; j < materias; j++) {
                matrizNotas[i][j] = (int)(Math.random() * 11);
            }
        }
    }
    //#endregion

    //#region FUNCIONES
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
    //#endregion
}
