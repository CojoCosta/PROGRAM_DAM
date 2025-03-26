package excepciones.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3B {
    public static void pedirDato(String mensaje, double min, double max){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        double numeroUsuario;
        if (max - min < 2 || max < min || mensaje == "" || mensaje == null) {
            throw new IllegalArgumentException("Algo has hecho mal");
        } else{
            System.out.printf("Escribe un numero entre %d y %d: ", min, max);
            do {
                try {
                    numeroUsuario = sc.nextDouble();
                    while (numeroUsuario < min || numeroUsuario > max) {
                        System.out.print("Escribe un numero dentro del rango: ");
                        numeroUsuario = sc.nextDouble();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero: ");
                    sc.nextLine();
                    numeroUsuario = 0;
                }

            } while (numeroUsuario == 0 );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minimo;
        do {
            try {
                System.out.print("Dime el minimo: ");
                minimo = sc.nextInt();
                System.out.print("Dime el maximo: ");
                double maximo = sc.nextInt();
                System.out.print("Escribe un mensaje: ");
                String mensaje = sc.nextLine();
                System.out.println("Prueba");
                pedirDato(mensaje, minimo, maximo);
            } catch (IllegalArgumentException e) {
                System.out.println("Parametro inválido");
                minimo = 0;
            } catch (InputMismatchException e) {
                System.out.println("Parametro inválido");
                minimo = 0;
            }
        } while (minimo == 0);

    }
}