import java.util.Scanner;

public class Bol2_Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.print("Dame un numero: ");
        n1 = sc.nextInt();

        System.out.print("Dame otro numero: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            if (n1 < n2) {
                System.out.println(n2 + " es mayor que " + n1);
            } else {
                System.out.println(n1 + " es igual que " + n2);
            }
        }    
        
        if (n1 % n2 == 0 || n2 % n1 ==0 ) {
                System.out.println(n1 + " Son multiplos");
            } 
            sc.close();
    }
}