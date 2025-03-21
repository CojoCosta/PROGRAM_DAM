import java.util.Scanner;
public class Bol2_Ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int temp = 0;

        System.out.print("Dime un numero: ");
        n1 = sc.nextInt();
        System.out.print("Dime un numero: ");
        n2 = sc.nextInt();
        System.out.printf("Tu primer numero es %d y tu segundo es %d", n1, n2);
        temp = n1;
        n1 = n2;
        n2 = temp; 
        System.out.printf("\nTu primer numero es %d y tu segundo es %d", n1, n2); 

    }
}
