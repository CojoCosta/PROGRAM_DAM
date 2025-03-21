import java.util.Scanner;
public class Bol2_Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int n1;
        int maximo = -2147483648;//Integer.MIN_VALUE
        
        System.out.print("Cuanto numeros desea introducir: ");
        n = sc.nextInt();
        //ESTO HAY QUE VERLO A FONDO
        for (int cont = 0; cont < n; cont++)  {
            System.out.print("Introduzca un numero: ");
            n1 = sc.nextInt();
            if (maximo <= n1){//||cont==0){
                maximo = n1;
            }
        }
        
        System.out.printf("Maximo es: %d", maximo);
        
        sc.close();
    }
}
