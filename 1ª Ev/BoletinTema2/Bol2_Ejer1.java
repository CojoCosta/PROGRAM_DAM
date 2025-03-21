//package Tema 2.Boletin Tema 2;

public class Bol2_Ejer1 {
    public static void main(String[] args) {
        int cont = 1;
        int cont1 = 1;
        
        while (cont <= 20) {
            System.out.println("Cont: " + cont);
            cont++;

        }

        do {
            cont1++;
            System.out.println("Cont1: " + cont1);
        } while (cont1 < 20);

        for (int cont2=1; cont2<=20; cont2++){
            System.out.println("Cont2: " + cont2);
        }

        for (int cont3=0; cont3<=50; cont3=cont3+2){
            System.out.printf(" Pares %5d \n",cont3);
        }
    }
}