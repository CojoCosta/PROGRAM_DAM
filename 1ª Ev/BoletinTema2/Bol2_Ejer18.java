import java.util.Scanner;

public class Bol2_Ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long acu = 1;
        long cont;
        System.out.print("Dime el numero del que quieras saber su factorial: ");
        n = sc.nextInt();
        for (cont = 1; cont <= n; cont++) {
            acu = acu * cont;
        }
        System.out.printf("El numero factorial de %d es: %d", n, acu);
        
        System.out.println("\n");
        
        acu = 1;
        cont = 1;
        do {
            acu = acu * cont;
            cont++;            
        } while (cont <= n);
        System.out.printf("El numero factorial de %d es %d", n, acu);
        
        System.out.println("\n");
        
        acu = 1;
        cont = 1;
        while (cont <= n) {
            acu = acu * cont;
            cont++;
        }
        System.out.printf("El numero factorial de %d es %d", n, acu);
    }
}