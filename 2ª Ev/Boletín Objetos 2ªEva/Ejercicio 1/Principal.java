import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        System.out.print("Introduce la base: ");
        base = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();
        Geometria rectangulo;
        rectangulo = new Geometria(true, 20,23);
        System.out.printf("Es un rectangulo \"%s\" de altura %.2f, base %.2f, diagonal %.2f, de area %.2f y perimetro de %.2f", rectangulo.getFigura(),rectangulo.getAltura(),rectangulo.getBase(), rectangulo.diagonal(), rectangulo.area(), rectangulo.perimetro());
        Geometria triangulo;
        triangulo = new Geometria();
        triangulo.setBase(base);
        triangulo.setAltura(altura);
        System.out.printf("\nEs un triangulo \"%s\" de base = %.2f, altura = %.2f, hipotenusa = %.2f, area = %.2f y perimetro = %.2f", triangulo.getFigura(),triangulo.getBase(), triangulo.getAltura(), triangulo.diagonal(), triangulo.area(), triangulo.perimetro());

        sc.close();
    }
}