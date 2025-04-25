package excepciones.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3B {
    public static void pedirDato(String mensaje, double min, double max){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        double numeroUsuario;
        boolean isChecked = true;
        if (mensaje == null||max - min < 2 ||  mensaje.equals("") ) {
            throw new IllegalArgumentException("Algo has hecho mal");
        } else {
            System.out.println(mensaje);
            System.out.printf("Escribe un numero entre %d y %d: ", min, max);
            do {
                try {
                    numeroUsuario = sc.nextInt();
                    while (numeroUsuario < min || numeroUsuario > max) {
                        System.out.print("Escribe un numero dentro del rango: ");
                        numeroUsuario = sc.nextInt();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero: ");
                    sc.nextLine();
                    isChecked = false;
                }

            } while (isChecked == false);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minimo;

        // pedirDato("hola", -5, 5);
        boolean isChecked = true;
        do {
            try {
                System.out.print("Dime el minimo: ");
                minimo = sc.nextInt();
                System.out.print("Dime el maximo: ");
                double maximo = sc.nextInt();
                sc.nextLine();
                System.out.print("Escribe un mensaje: ");
                String mensaje = sc.nextLine();
                System.out.println("Prueba");
                pedirDato(mensaje, minimo, maximo);
            } catch (IllegalArgumentException e) {
                System.out.println("Parametro inválido");
                isChecked = false;
            } catch (InputMismatchException e) {
                System.out.println("Parametro inválido");
                isChecked = false;
            }
        } while (isChecked == false);
    }
}
