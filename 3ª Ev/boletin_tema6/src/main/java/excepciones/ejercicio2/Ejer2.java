package excepciones.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometria rectangulo;
        rectangulo = new Geometria(true, 20, 23);
        System.out.printf(
                "Es un rectangulo \"%s\" de altura %.2f, base %.2f, diagonal %.2f, de area %.2f y perimetro de %.2f",
                rectangulo.getFigura(), rectangulo.getAltura(), rectangulo.getBase(), rectangulo.diagonal(),
                rectangulo.area(), rectangulo.perimetro());
        try {
            Geometria triangulo;
            triangulo = new Geometria();
            System.out.print("\nIntroduce la base: ");
            triangulo.setBase(sc.nextDouble());
            System.out.print("Introduce la altura: ");
            triangulo.setAltura(sc.nextDouble());
            System.out.printf(
                    "\nEs un triangulo \"%s\" de base = %.2f, altura = %.2f, hipotenusa = %.2f, area = %.2f y perimetro = %.2f",
                    triangulo.getFigura(), triangulo.getBase(), triangulo.getAltura(), triangulo.diagonal(),
                    triangulo.area(), triangulo.perimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Mete un numero positivo");
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Caracter erróneo");
            sc.nextLine();
        }
        sc.close();
    }
}
