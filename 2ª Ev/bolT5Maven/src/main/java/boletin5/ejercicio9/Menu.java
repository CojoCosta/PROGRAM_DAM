package boletin5.ejercicio9;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1.- Ver tabla de notas: ");
            System.out.println("2.- Ver notas de un alumno: ");
            System.out.println("3.- Ver notas de una materia: ");
            System.out.println("4.- Calcular media de notas global: ");
            System.out.println("5.- Media de un alumno: ");
            System.out.println("6.- Media de una materia: ");
            System.out.println("7.- Nota máxima y mínima de una asignuta: ");
            System.out.println("8.- Modificar una nota: ");
            System.out.println("9.- Salir.");
            System.out.print("Elige una opcion:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                case 6:
                    ;
                case 7:
                    ;
                case 8:
                    ;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 9);
    }
}
