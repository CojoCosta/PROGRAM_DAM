import java.util.Scanner;

public class Bol2_Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double n1;

        System.out.print("Dime un numero entero: ");
        n = sc.nextInt();
        System.out.print("Dime un numero decimal: ");
        n1 = sc.nextDouble();

        System.out.printf("Decimal: %d \nOctal: %05o \nHexadecimal: %X", n, n, n);
        System.out.printf("Numero real: %7.3f ", n1);
        sc.close();
    }
}