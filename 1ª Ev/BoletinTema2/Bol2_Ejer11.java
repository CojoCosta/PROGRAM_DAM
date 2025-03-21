public class Bol2_Ejer11 {
    public static void main(String[] args) {

        int acu = 0;
        int cont = 0;
    
            while (acu < 10000) {
                cont++;
                acu = acu + cont;
            }
        System.out.printf("El valor de \"N\"es: %d", cont);
    }

}