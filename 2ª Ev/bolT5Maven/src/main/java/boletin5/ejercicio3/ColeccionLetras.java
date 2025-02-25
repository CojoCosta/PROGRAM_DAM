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
