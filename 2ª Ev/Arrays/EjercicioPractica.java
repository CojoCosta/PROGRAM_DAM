import java.util.Scanner;
public class EjercicioPractica {
    public static double media(int[] vector){
        double acu = 0;
        for (int i = 0; i < vector.length; i++) {
            acu = acu + vector[i];
        }
        return acu/vector.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int [] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un numero: ");
            numeros[i] = sc.nextInt();
        }
/*--------------------------------------------------------------- */
        // double acu = 0;
        // for (int i = 0; i < numeros.length; i++) {
        //     acu = acu + numeros[i];
        // }
        // double media = acu/numeros.length;
        // for (int numero : numeros) {
        //     acu = acu + numero;
        // }
        // double media = acu/numeros.length;
/*---------------------------------------------------------------- */
        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.println(numeros[i]);
        // }
        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println(media(numeros));
        sc.close();
    }
}
