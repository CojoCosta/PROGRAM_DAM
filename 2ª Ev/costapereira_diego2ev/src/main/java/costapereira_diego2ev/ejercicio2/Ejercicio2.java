package costapereira_diego2ev.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static int eliminarCadenas(ArrayList<String> coleccion, String cadena) {
        int acu = 0;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.contains(cadena)) {
                coleccion.remove(cadena);
                acu++;
            }
            return acu;
        }
        return 0;
    }

    public static void muestraPersona(Persona[] persona) {

        for (int i = 0; i < persona.length; i++) {
            System.out.printf("%10s: %4d\n", persona[i].getNombre(), persona[i].getEdad());
        }
    }

    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> coleccion1 = new ArrayList<>();
        do {
            System.out.println("1.- Añadir");
            System.out.println("2.- Eliminar");
            System.out.println("3.- Finalizar programa");
            System.out.print("Elije la opcion deseada: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    String nombre;
                    System.out.print("Nombre a introducir: ");
                    nombre = sc.nextLine();
                    coleccion1.add(nombre);
                    break;
                case 2:
                    String nombreEliminar;
                    System.out.print("¿Que nombre quiere eliminar?: ");
                    nombreEliminar = sc.nextLine();
                    eliminarCadenas(coleccion1, nombreEliminar);
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa");
                    break;

                default:
                    System.out.println("\nOpción no válida\n");
                    break;
            }
        } while (option != 3);
        Persona[] personas = new Persona[coleccion1.size()];
        for (int i = 0; i < personas.length; i++) {
            int edad = (int) (Math.random() * 11 + 20);
            personas[i] = new Persona(coleccion1.get(i), edad);
        }
        muestraPersona(personas);
        System.out.println();
        int acu = 0;
        for (int i = 0; i < personas.length; i++) {
            acu += personas[i].getEdad();
        }
        double media = acu / personas.length;
        System.out.printf("La media de las edades es: %.2f", media);
    }
}