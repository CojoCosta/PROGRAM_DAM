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
