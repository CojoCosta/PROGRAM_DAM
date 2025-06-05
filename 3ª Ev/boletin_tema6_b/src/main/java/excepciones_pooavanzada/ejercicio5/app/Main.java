package excepciones_pooavanzada.ejercicio5.app;

import java.util.ArrayList;
import java.util.Scanner;

import excepciones_pooavanzada.ejercicio5.clases.Astro;
import excepciones_pooavanzada.ejercicio5.clases.Planeta;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> coleccionAstros = new ArrayList<Astro>();
        String nombrePlaneta = "";
        String nombreLuna = "";
        String nombreAstro = "";
        Double radio = 0.0;
        int numeroLunas = 0;
        int option = 0;
        int option2 = 0;
        Planeta planeta = null;

        do {
            System.out.println("1. Añadir planeta.");
            System.out.println("2. Añade otro astro.");
            System.out.println("3. Mostrar datos.");
            System.out.println("4. Elimina repetidos");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            option = Libreria.pedirEntero();
            switch (option) {
                case 1:
                    System.out.println("Como se llama el planeta¿?");
                    nombrePlaneta = sc.nextLine();
                    System.out.println("Cual es su radio¿?");
                    radio = Libreria.pedirReal();
                    do {
                        System.out.println("¿Es gaseoso?");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No, siguiente pregunta");
                        option2 = Libreria.pedirEntero();
                        planeta = new Planeta(nombrePlaneta, radio, option2 == 1);
                        coleccionAstros.add(planeta);
                    } while (option2 != 1 && option2 != 2);
                    System.out.println("Cuantas lunas tiene¿?");
                    numeroLunas = Libreria.pedirEntero();
                    for (int i = 0; i < numeroLunas; i++) {
                        System.out.println("Nombre de la luna");
                        nombreLuna = sc.nextLine();
                        System.out.println("y su radio¿?");
                        radio = Libreria.pedirReal();
                        planeta.satelites.add(new Astro(nombreLuna, radio));
                    }

                    break;

                case 2:
                    System.out.println("Como se llama el astro¿?");
                    nombreAstro = sc.nextLine();
                    System.out.println("Cual es su radio¿?");
                    radio = Libreria.pedirReal();
                    coleccionAstros.add(new Astro(nombreAstro, radio));
                    break;

                case 3:
                    for (int i = 0; i < coleccionAstros.size(); i++) {
                        if (coleccionAstros.get(i).getClass() == Planeta.class) {
                                System.out.printf("%s, radio: %.2f, gaseoso: %b \n", coleccionAstros.get(i).getNombre(),coleccionAstros.get(i).getRadio(), ((Planeta) coleccionAstros.get(i)).getGaseoso() == true);
                            for (int j = 0; j < planeta.satelites.size(); j++) {
                                System.out.println(planeta.satelites.get(j).toString());
                            }
                        } else {
                            System.out.println(coleccionAstros.get(i).toString());
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < coleccionAstros.size(); i++) {
                        for (int j = 0; j < coleccionAstros.size(); j++) {
                            if (coleccionAstros.get(i).equals(coleccionAstros.get(j))) {
                                coleccionAstros.remove(j);
                                j--;
                            }
                        }
                    }
                    for (int i = 0; i < planeta.satelites.size(); i++) {
                        for (int j = 0; j < planeta.satelites.size(); j++) {
                            if (planeta.satelites.get(i).equals(planeta.satelites.get(j))) {
                                planeta.satelites.remove(j);
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;

                default:
                    System.out.println("Elige una opción del 1 al 4 y si quieres salir del programa 5.");
                    break;
            }
        } while (option != 5);
    }
}
