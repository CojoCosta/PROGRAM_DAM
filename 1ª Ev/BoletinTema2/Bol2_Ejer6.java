import java.util.Scanner;

public class Bol2_Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        double n;
        int n1;
        int n2;
        do {
            System.out.println("1. Cuadrado: ");
            System.out.println("2. Numero inverso: ");
            System.out.println("3. Raiz cuadrada: ");
            System.out.println("4. Operacion AND (Resultados Hexadecimal): ");
            System.out.println("5. Operacion OR (Resultado Hexadecimal): ");
            System.out.println("6. Salir del programa");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Dime un numero real: ");
                    n = sc.nextDouble();
                    System.out.printf("El cuadrado de %.3f es: %.2f\n", n, n * n);

                    break;
                case 2:

                    do {
                        System.out.print("Dime un numero real: ");
                        n = sc.nextDouble();
                        if (n==0){
                            System.out.println("Dame un numero que no sea 0");
                        }
                    } while (n == 0);  

                    System.out.printf("El inverso de %.6f es: %.4f\n", n, 1 / n);
                   
                    break;
                case 3:

                    System.out.print("Dime un numero real: ");
                    n = sc.nextDouble();
                    while (n < 0) {
                        System.out.println("Dame un numero mayor o igual que 0");
                        System.out.print("Dime un numero real: ");
                        n = sc.nextDouble();
                    }
                    System.out.printf("La raíz cuadrada de %.3f es: %.3f\n", n, Math.sqrt(n));

                    break;
                case 4:
                    System.out.print("Dime un numero entero: ");
                    n1 = sc.nextInt();
                    System.out.print("Dime un numero entero: ");
                    n2 = sc.nextInt();
                    System.out.printf("La operacion \"AND\" de %d  y %d es: %x\n", n1, n2, n1 & n2);

                    break;
                case 5:
                    System.out.print("Dime un numero entero: ");
                    n1 = sc.nextInt();
                    System.out.print("Dime un numero entero: ");
                    n2 = sc.nextInt();
                    System.out.printf("La operación \"OR\" de %d y %d es: %x\n", n1, n2, n1 | n2);

                    break;
                case 6:
                    System.out.println("Gracias por venir");
                    break;

                default:
                    break;
            }

        } while (option != 6);
    }
}
