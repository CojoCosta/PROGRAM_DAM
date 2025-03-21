import java.util.Scanner;

public class Bol2_Ejer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        String asterisco = "*";
        String espacio = " ";

        System.out.print("Cuantos filas de asteriscos quieres? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int b = 0; b < i; b++) {
                System.out.print(asterisco);
            }
            System.out.println(asterisco);
        }
        System.out.println();
        // TODO como hacer la pirámide
        System.out.println("Ahora lo haremos en piramide");

        
        for (int filas = 1; filas <= n; filas++) {// contador de filas
            for (int espacios = 0; espacios < n - filas; espacios++) {
                System.out.print(espacio);
                // n es 5 y fila 1 pues 4 espacios
                // n es 5 y fila 2 pues 3 espacios... y asi hast completar las filas
            }
            for (int asteriscos = 0; asteriscos < (2 * filas - 1); asteriscos++) {
                System.out.print(asterisco);
                // 2 * fila 1 es 2 y - 1, pues 1 asterisco
                // 2 * fila 2 es 4 y - 1, pues 3 asteriscos...y asi hasta completar las filas
            }
            // System.out.println(asterisco);
            // asterisco=asterisco+"**";
            System.out.println();
            // para saltar a siguiente fila
        }
        System.out.println();
    }
}