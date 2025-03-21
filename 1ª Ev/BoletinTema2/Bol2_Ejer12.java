
public class Bol2_Ejer12 {
    public static void main(String[] args) {
        
        System.out.println("Apartado \"A\"");
        for (int cont = 1; cont <= 50; cont++){
            System.out.printf("%4d", cont);
        }
        System.out.println("\nApartado \"B\"");
        for (int cont1 = 50; cont1 >= 1; cont1--){
            System.out.printf("%4d", cont1);            
        }
        System.out.println("\nApartado \"C\"");
        for (int cont2 = 2; cont2 < 20; cont2 = cont2 + 2){
            System.out.printf("%4d", cont2);
        }          
        System.out.println("\nApartado \"D\"");
        for (int cont3 = 91 ; cont3 <= 130; cont3 = cont3 + 2){
            System.out.printf("%4d", cont3);
        }
        System.out.println("\nApartado \"E\"");
        for (int cont4 = 70 ; cont4 >= 25; cont4 = cont4 - 5){
            System.out.printf("%4d", cont4);
        }
    }
}