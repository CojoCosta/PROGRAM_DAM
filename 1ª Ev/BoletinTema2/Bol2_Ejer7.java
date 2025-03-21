import java.util.Scanner;

public class Bol2_Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        double n1 = 0;
        int option;

        do {
            for (int cont = 0; cont < 5; cont++) {
                System.out.print("Escribe un numero: ");
                n = sc.nextDouble();
                n1 = n1 + n;
                if (cont == 4) {
                    System.out.printf("La suma de los numeros introducidos es: %.3f", n1);
                    System.out.print("\nLa media de los numeros intrucidos es: " + n1 / 5);
                }
            }
            System.out.print("\nPulse 1 si quiere realizar otra operacion.\nPulse otro numero si quiere finalizar el programa.");
            option = sc.nextInt();
        } while (option == 1);

    }

}
