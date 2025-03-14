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
package boletin5.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class LoteriaPrimitiva {
    /**
     * Funcion que rellena un arrayList con 6 numeros aleatorios entre 1 y 49
     * @param numerosLoteria arrayList vacio para rellenar 
     * @return un ArrayList con 6 numeros
     */
    public static void rellenaCol(ArrayList<Integer> numerosLoteria) {
        numerosLoteria.clear();
        int numero;
        for (int i = 0; i < 6; i++) {
            numero = ((int) (Math.random() * 49 + 1)); 
            if (numerosLoteria.contains(numero)) {
                i--;
            } else {
                numerosLoteria.add(numero);
            }
        }
      //  System.err.println(numerosLoteria.size());
        //return numerosLoteria;
    }

    /**
     * funcion que compara si hay alguna coincidencia entre los numeros que componen 2 arrayList
     * @param numerosUsuario ArrayList con 6 numeros que elige el usuario 
     * @param numerosLoteria ArrayList con 6 aleatorios (por la funcion anterior)
     * @return cantidad de aciertos que hay entre los numeros de ¡l usuario y los de la loteria (entre 0 y 6)
     */
    public static int compara(ArrayList<Integer> numerosUsuario, ArrayList<Integer> numerosLoteria) {
        int acumulador = 0;
        for (int i = 0; i < numerosLoteria.size(); i++) {
            for (int j = 0; j < numerosUsuario.size(); j++) {
                if (numerosLoteria.get(i) == numerosUsuario.get(j)) {
                    acumulador ++;
                }
            }
        }
        return acumulador;
    }
    public static ArrayList<Integer> pedirNumeros(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeroUsuario = new ArrayList<>();
        boolean isComprobado = false;
        while (!isComprobado) {
            numeroUsuario = new ArrayList<>();
            System.out.println("Introduce seis números separados por comas: ");
            String numeros = sc.nextLine();
            String[] numerosSeparados = numeros.split(",");

            try {
                for (String numero : numerosSeparados) {
                    numeroUsuario.add(Integer.parseInt(numero));
                }
                isComprobado = validarNumeros(numeroUsuario);
                if (!isComprobado) {
                    System.out.println("Los números no son válidos.");
                }
            } catch (Exception e) {
                System.out.println("Introduce solo números separados por comas.");
            }
        }
        return numeroUsuario;
    }
    public static boolean validarNumeros(ArrayList<Integer> numerosUsuario){
        if (numerosUsuario.size() != 6) {
            return false;
        }
        for (int i = 0; i < numerosUsuario.size(); i++) {
            int num = numerosUsuario.get(i);

            if (num < 1 || num > 49) {
                return false;
            }

            for (int j = i + 1; j < numerosUsuario.size(); j++) {
                if (num == numerosUsuario.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {//TODO meter 6 nº separados por comas con las comprobaciones pertinentas
        ArrayList<Integer> numerosUsuario = new ArrayList<>();
        ArrayList<Integer> numerosLoteria = new ArrayList<>();
        int[] numeroAciertos = new int[7];
        Scanner sc = new Scanner(System.in);
        numerosUsuario = pedirNumeros();
        for (int i = 0; i < 1000000; i++) {
            rellenaCol(numerosLoteria);
            int resultado = compara(numerosUsuario,numerosLoteria );
            numeroAciertos[resultado]++;
        }
        System.out.println("Resultados");
        for (int i = 0; i < numeroAciertos.length; i++) {
            System.out.printf("%d aciertos: %2d\n", i, numeroAciertos[i]);
            
        }
        sc.close();
    }
}
