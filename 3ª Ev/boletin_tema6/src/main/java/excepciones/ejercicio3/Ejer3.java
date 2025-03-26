package excepciones.ejercicio3;

import java.util.Scanner;

public class Ejer3 {
    public static void pedirdato(String mensaje, int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int numeroUsuario;
        System.out.printf("Escribe un numero entre %d y %d: ", min, max);
        if (min - max < 2 || max < min || mensaje == "" || mensaje == null) {
            throw new IllegalArgumentException("Algo has hecho mal");
        } else{
            System.out.println("Introduce un número entero");
            do {
                try {
                    numeroUsuario = sc.nextInt();
                    while (numeroUsuario < min || numeroUsuario > max) {
                        System.out.println();
                    }
                } catch (Exception e) {
                    
                }

            } while (numeroUsuario < min );
        }
    }
    public static void main(String[] args) {
        
    }
}
