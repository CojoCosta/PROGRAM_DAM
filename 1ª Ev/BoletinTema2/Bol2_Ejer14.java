import java.util.Scanner;

public class Bol2_Ejer14 {
    public static void main(String[] args) {  //contar totales
        Scanner sc = new Scanner(System.in);

        int n;
        int cont = 0;
        int cont1 = 0;
        System.out.println("Dime numeros positivos o negativos. \nCuando no quieras meter mas numeros introduce \"0\".");
        do {
            System.out.print("Dime un numero: ");
            n = sc.nextInt();
            cont1 ++;
            if (n < 0){
                cont = cont +1; 
            }
        } while (n != 0);
        System.out.printf("Has introducido %d veces numeros negativos en un total de %d numeros introducidos sin contar el \"0\" final.", cont, (cont1-1));
    }
}
