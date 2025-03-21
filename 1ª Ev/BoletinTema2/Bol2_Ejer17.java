import java.util.Scanner;

public class Bol2_Ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int acu;
        int cont;
        do {
            acu = 0;
            System.out.print("\nDime un numero entre 1 y 50: ");
            n = sc.nextInt();
            cont = n;
            
            while (n < 0 || n > 50) {
                System.out.print("Recuerde que es entre 1 y 50.\nEscriba otro: ");
                n = sc.nextInt();
            }
            while ( cont<=100) {
                acu = acu + cont;
                System.out.printf("\nLos multiplos de " + n + " son: %d", cont);
                cont = cont + n;
            }
            System.out.printf("\nLa suma de los multiplos es: %d", acu);
            
            System.out.println("\nPulse el 0 si no quiere continuar. \nSi quiere probar con mas numeros pulse cualquier otro.");
            n = sc.nextInt();
        } while (n != 0);
    }
}
