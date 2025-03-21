import java.util.Scanner;

public class Bol2_Ejer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int option;
        String espacio = " ";

        System.out.print("Cuantos asteriscos quieres? ");
        numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.print(" * ");
        }
        System.out.println(" ");
        do {
            System.out.println("1. Diagonal hacia la derecha");
            System.out.println("2. Diagonal hacia la izquierda");
            System.out.println("3. cerrar el programa");
            option = sc.nextInt();
            switch (option) {
                case 1:

                    for (int i = 0; i < numero; i++) {
                        System.out.println(" * ");
                        for (int b = 0; b <= i; b++) {
                            System.out.print(espacio);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < numero; i++) {
                        for (int b = numero + 1; b >= i; b--) {
                            System.out.print(espacio);
                        }
                        System.out.println(" * ");
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Gracias por venir");
                    break;

                default:
                    break;
            }

        } while (option != 3);
    }

}