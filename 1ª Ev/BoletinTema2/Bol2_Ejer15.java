import java.util.Scanner;

public class Bol2_Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double euro;
        do {
            System.out.println("\n1. Introduce la cantidad de euros que quieres pasar a libras.");
            System.out.println("2. Introduce la cantidad de libras que quieres pasar a euros.");
            System.out.println("3. Salir.");
            System.out.println();
            n = sc.nextInt();
            switch (n) {
                case 1: // € a libra 1*0.83

                    System.out.print("Cuantos euros quieres pasar a libras: "); // Comprobación de valor positivo
                    euro = sc.nextDouble();
                    while (euro < 0) {
                        System.out.println("Debes introducir un valor positivo");
                        System.out.print("Cuantos euros quieres pasar a libras: "); // Comprobación de valor positivo
                        euro = sc.nextDouble();
                    }
                    euro = euro * 0.83;
                    System.out.printf("Son %.2f libras", euro);

                    break;
                case 2: // libra a € 1/0.83
                    System.out.print("Cuantas libras quieres pasar a euros: "); // Comprobación de valor positivo
                    euro = sc.nextDouble();
                    while (euro < 0) {
                        System.out.println("Debes introducir un valor positivo");
                        System.out.print("Cuantas libras quieres pasar a euros: "); // Comprobación de valor positivo
                        euro = sc.nextDouble();
                    }
                    euro = euro / 0.83;
                    System.out.printf("Son %.2f euros", euro);

                    break;
                case 3:
                    System.out.println("Gracias por venir ");

                    break;

                default:
                    break;
            }

        } while (n != 3);
    }
}
