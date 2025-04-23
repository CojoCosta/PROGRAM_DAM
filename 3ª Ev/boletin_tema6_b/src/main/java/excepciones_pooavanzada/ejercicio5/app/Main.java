package excepciones_pooavanzada.ejercicio5.app;

import java.util.ArrayList;
import java.util.Scanner;

import excepciones_pooavanzada.ejercicio5.clases.Astro;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> satelites = new ArrayList<Astro>();
        int option = 0;
        do {
            System.out.println("1. Añadir planeta."); //: Pregunta si es gaseoso y pide el nombre y radio. También pregunta cantidad de lunas y se introducirán sus nombres y radios.
            System.out.println("2. Añade otro astro.");//: Pide su nombre y radio.
            System.out.println("3. Mostrar datos.");// Muestra toda la colección detectando si es Astro o Planeta para mostrar todos sus datos. En el caso de Astro simplemente llama a toString() y lo muestra, en el caso de Planetas muestra todos los datos y en particular llamando a getNombre con parámetro ‘.’
            System.out.println("4. Elimina repetidos");//Busca Astros/Planetas iguales (aprovecha el equals/indexOf/lastIndexOf ) y elimina todas las apariciones menos la primera.
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;

                default:
                    System.out.println("Elige una opción del 1 al 4 y si quieres salir del programa 5.");
                    break;
            }
        } while (option != 5);
        sc.close();
    }
}
