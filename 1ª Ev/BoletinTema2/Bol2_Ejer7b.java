import java.util.Scanner;

public class Bol2_Ejer7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        double acu = 0;
        int cont = 0;
        System.out.println("A continuacion introduce todos los numeros de los que desea hacer la media. \nIntroduzca \"0\" para dejar de itroducir datos.");
        do {
            System.out.print("Dime un numero: ");
            n = sc.nextDouble();
            acu = acu + n;
            cont++;
        } while (n != 0);

        System.out.println("Ya no se admiten mas datos");

        System.out.printf("La media de los datos intrducidos es: %.3f", n / (cont - 1));

    }
}