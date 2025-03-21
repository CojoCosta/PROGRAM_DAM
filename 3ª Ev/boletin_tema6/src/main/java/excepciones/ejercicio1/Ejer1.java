package excepciones.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euro;
        int n;
        do {
            try {
                System.out.println("\n1. Introduce la cantidad de euros que quieres pasar a libras.");
                System.out.println("2. Introduce la cantidad de libras que quieres pasar a euros.");
                System.out.println("3. Salir.");
                n = sc.nextInt();
                switch (n) {
                    case 1: // € a libra 1*0.83
                    try {
                        System.out.print("Cuantos euros quieres pasar a libras: "); // Comprobación de valor positivo
                        euro = sc.nextDouble();
                        while (euro < 0) {
                            System.out.println("Debes introducir un valor positivo");
                            System.out.print("Cuantos euros quieres pasar a libras: "); // Comprobación de valor positivo
                            euro = sc.nextDouble();
                        }
                        euro = euro * 0.83;
                        System.out.printf("Son %.2f libras", euro);
                    } catch (InputMismatchException e) {
                        System.out.println("Introduce un valor númerico");
                    }
                    
                    break;
                    case 2: // libra a € 1/0.83
                    
                        System.out.print("Cuantas libras quieres pasar a euros: "); // Comprobación de valor positivo
                        euro = sc.nextDouble();
                        while (euro < 0) {
                            System.out.println("Debes introducir un valor positivo");
                            System.out.print("Cuantas libras quieres pasar a euros: "); // Comprobación de valor positivo
                            euro = sc.nextDouble();
                        }
                        euro = euro / 0.83;
                        System.out.printf("Son %.2f euros", euro);
                    
                    break;
                    case 3:
                    System.out.println("Gracias por venir ");
                    
                    break;
                    
                    default:
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un valor númerico");
                sc.nextLine();
                n = 0;
            }
                
            } while (n != 3);
        }
    }
