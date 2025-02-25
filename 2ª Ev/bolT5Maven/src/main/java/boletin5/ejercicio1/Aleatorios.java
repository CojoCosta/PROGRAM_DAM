package boletin5.ejercicio1;


public class Aleatorios {
    public static int[] crearAleatorio(int n){
        int listaNumeros[] = new int[n];
        for (int i = 0; i < n; i++) {
            listaNumeros[i] = (int) (Math.random() * 4001 + 1000);
        }
        return listaNumeros;
    }

    public static void mostrarNumeros(int[] numeros){
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static int numeroMayor(int[] numeros){
        int auxiliar = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (auxiliar < numeros[i]) {
                auxiliar = numeros[i];
            }
        }
        return auxiliar;
    }

    public static int numeroMenor(int[] numeros){
        int auxiliar = numeros[0];
        for (int numero : numeros) {
            if (auxiliar > numero){
                auxiliar = numero;
            }
        }
        return auxiliar;
    }
    
    public static boolean intercambioPosiciones(int[] numeros, int n1, int n2){
        int auxiliar;
        if (n1 >= numeros.length || n2 >= numeros.length || n1 < 0 || n2 < 0) {
            return false;
        } else{
            auxiliar = numeros[n1];
            numeros[n1] = numeros[n2];
            numeros[n2] = auxiliar;
            return true;
        }
    }

    public static void main(String[] args) {
        int[] lista = crearAleatorio(10);
        mostrarNumeros(lista);
        System.out.println();
        System.out.println(numeroMayor(lista));
        System.out.println();
        System.out.println(numeroMenor(lista));
        System.out.println();
        System.out.println(intercambioPosiciones(lista, 2, 0));
    }
}

// e) Función a la que se le pasa como parámetros un vector cualquiera de enteros y
// dos índices (son dos números enteros) e intercambia los datos que hay en las
// posiciones indicadas por los índices. Si hay un error de rango devuelve false si no
// devuelve true. Por ejemplo si se le pasa (v, 2, 5) debe intercambiar los datos v [2]
// con v[5] siempre que existan dichas posiciones.
