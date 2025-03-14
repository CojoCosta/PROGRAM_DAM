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
package boletin5.ejercicio3;

import java.util.ArrayList;

public class ColeccionLetras {
    public static ArrayList<Integer> crearLista(int numero){
        ArrayList <Integer> listaNumeros = new ArrayList<>();
        for (int i = 0 ; i < numero ; i++) {
            listaNumeros.add((int) (Math.random() * 4001 + 1000));
        }
        return listaNumeros;
    }

    public static void mostrarLista(ArrayList<Integer> numeros){
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

    public static int numeroMayor(ArrayList<Integer> numeros){
        int numeroMayor = numeros.get(0);
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) > numeroMayor){
                numeroMayor = numeros.get(i);
            }
        }
        return numeroMayor;
    }

    public static int numeroMenor(ArrayList<Integer> numeros){//foreach
        int numeroMenor = numeros.get(0);
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) < numeroMenor){
                numeroMenor = numeros.get(i);
            }
        }
        return numeroMenor;
    }

    public static boolean intercambioPosiciones(ArrayList<Integer> numeros, int n1, int n2){
        int auxiliar;
        if (n1 >= numeros.size() || n2 >= numeros.size() || n1 < 0 || n2 < 0) {
            return false;
        } else{
            auxiliar = numeros.get(n1);
            numeros.set(n1, numeros.get(n2));
            numeros.set(n2, auxiliar);
        return true;
        }
    }

    public static void eliminarMayores(ArrayList<Integer> lista, int limite){
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i) >= limite){
                    lista.remove(i);
                    i--;      
                }
            }
            System.out.println(lista);
    }
    public static void main(String[] args) {
        ArrayList <Integer> lista = crearLista(10);
        mostrarLista(lista);
        System.out.println();
        System.out.printf("Numero mayor:  %d",numeroMayor(lista));
        System.out.println();
        System.out.printf("Numero menor:  %d",numeroMenor(lista));
        System.out.println();
        System.out.println(intercambioPosiciones(lista, 1, 2));
        System.out.println();
        eliminarMayores(lista, 2500);
    }
}
