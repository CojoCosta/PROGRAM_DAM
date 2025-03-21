import java.util.Scanner;

public class Bol2_Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int acu = 0;

        System.out.print("Dime un numero: ");
        n = sc.nextInt();

        if (n > 0) {
            for (int cont = 0; cont <= n; cont++) {

               // System.out.println("Cont: " + cont);
                acu = acu + cont;
            }
            System.out.println(acu);
        }
        sc.close();
    }
}
