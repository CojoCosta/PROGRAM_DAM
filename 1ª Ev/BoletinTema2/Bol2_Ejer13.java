import java.util.Scanner;

public class Bol2_Ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int acu = 0;
        int acu1 = 0;
        int acu2par = 0;
        int acu2impar = 0;

        System.out.print("Dime un numero: ");
        n = sc.nextInt();
        for (int cont = 0; cont <= n; cont = cont + 2) {
            acu = acu + cont;
        }
        System.out.printf("La suma de los numeros pares entre \"0\" y el numero que has elegido es: %d", acu);
        for (int cont1 = 1; cont1 <= n; cont1 = cont1 + 2) {
            acu1 = acu1 + cont1;
        }
        System.out.printf("\nLa suma de los numeros impares entre \"0\" y el numero que has elegido es: %d", acu1);
        for (int cont2 = 0; cont2 <= n; cont2++) {
            if (cont2 % 2 == 0) {
                acu2par = acu2par + cont2;
            } else{
                acu2impar = acu2impar + cont2;
            }
        }
        System.out.printf(
                "\nLa suma de los numeros pares e impares entre \"0\" y el numero que has elegido es: %d + %d = %d",
                acu2par, acu2impar, (acu2par + acu2impar));
    }
}