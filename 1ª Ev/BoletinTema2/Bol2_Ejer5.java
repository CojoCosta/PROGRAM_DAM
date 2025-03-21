import java.util.Scanner;

public class Bol2_Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n;
        int option;
        do {
            System.out.print("Que temperatura hace hoy: ");
            n = sc.nextDouble();
            System.out.println("1. Farenheit: ");
            System.out.println("2. Kelvin: ");
            System.out.println("3. Salir ");
            System.out.println("Elige una de las anteriores opciones");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ferenheit: " + (n + 273.15)); // Cambio de conversion
                    break;
                case 2:
                    System.out.println("Kelvin: " + (1.8 * n + 32));
                    break;
                case 3:
                    System.out.println("Gracias por venir");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 3);
    }
}
