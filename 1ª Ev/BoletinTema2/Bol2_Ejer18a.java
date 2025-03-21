import java.util.Scanner;

public class Bol2_Ejer18a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long n1;
        long n2;
        long acu = 1;
        long acu1 = 1;
        long acu2 = 1;
        long cont1 = 1;
        long cont2 = 1;
        
        System.out.print("Dime el numero del que quieras saber su factorial: ");
        n = sc.nextInt();
        for (long cont = 1; cont <= n; cont++) {
            acu = acu * cont;
        }
        System.out.printf("El numero factorial de %d es: %d", n, acu);
        
        System.out.println("\n");
        
        System.out.print("Dime el numero del que quieras saber su factorial: ");
        n1 = sc.nextInt();
        do {
            acu1 = acu1 * cont1;
            cont1++;            
        } while (cont1 <= n1);
        System.out.printf("El numero factorial de %d es %d", n1, acu1);
        
        System.out.println("\n");
        
        System.out.print("Dime el numero del que quieras saber su factorial: ");
        n2 = sc.nextInt();
        while (cont2 <= n2) {
            acu2 = acu2 * cont2;
            cont2++;
        }
        System.out.printf("El numero factorial de %d es %d", n2, acu2);            
    }
}
// 18.Realizar un programa que calcule el factorial de un número (usar tipo long
// o real) introducido por el usuario (haz sólo un programa que realice 3 veces
// el cálculo). No se permite el uso de sentencias if:
// a) Con un bucle for.
// b) Con un bucle do-while
// c) Con un bucle while
