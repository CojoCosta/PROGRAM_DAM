import java.util.Scanner;

public class Bol2_Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.print("Dime un numero: ");
        n1 = sc.nextInt();
        System.out.print("Dime un numero: ");
        n2 = sc.nextInt();
        System.out.print("Dime un numero: ");
        n3 = sc.nextInt();

        if (n1 <= n2) {
            n1 = n2;
        }
        if (n1 <= n3) {
            n1 = n3;
        }
        if (n2 <= n3) {
            n1 = n3;
        }

        // System.out.printf("El numero mayor es: %d", Math.max(n1, Math.max(n2, n3)));

        System.out.printf("El numero mayor es: %d", n1);
    }
}