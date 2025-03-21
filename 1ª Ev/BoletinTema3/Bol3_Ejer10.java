package Programas.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer10 {
    /**
     * funcion calcular el area de un cuadrado, rectangulo o triangulo
     * @param base dato de la base de la figura
     * @param altura dato de la altura de la figura
     * @param flag true para calcular rect y false para tri 
     * @return El area de la figura
     */
    public static double calcularArea(double base, double altura, boolean flag) {
        return flag ? (base * altura) : (base * altura / 2);
    }


    /**
     * funcion para calcular el area del circulo
     * @param radio El radio del circulo
     * @return El area del circulo
     */
    public static double calcularAreaCirculo(double radio) {//
        return Math.PI * (radio * radio);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        double base, altura;
        double area;
        double radio;

        do {
            System.out.println("1.- Area de un triangulo");
            System.out.println("2.- Area de un rectangulo");
            System.out.println("3.- Area de un cuadrado");
            System.out.println("4.- Area de un circulo");
            System.out.println("5.- Salir.");
            System.out.print("Dime de que quieres calcular el area: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Dime la base del triangulo: ");
                    base = sc.nextDouble();
                    System.out.print("Dime la altura del triangulo: ");
                    altura = sc.nextDouble();
                    area = calcularArea(base, altura, false);
                    break;
                case 2:
                    System.out.print("Dime la base del rectangulo: ");
                    base = sc.nextDouble();
                    System.out.print("Dime la altura del rectangulo: ");
                    altura = sc.nextDouble();
                    area = calcularArea(base, altura, true);
                    break;
                case 3:
                    System.out.print("Dime el lado del cuadrado: ");
                    base = sc.nextDouble();
                    area = calcularArea(base, base, true);
                    break;
                case 4:
                    System.out.println("Area de un círculo");
                    System.out.print("Indica el tamaño del radio: ");
                    radio = sc.nextDouble();
                    System.out.println(calcularAreaCirculo(radio));
                    break;

                case 5:
                    System.out.println("Gracias por venir");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 5);
    sc.close();
    }
}

// 10. a) Realizar un método que permita hallar el área de un rectángulo o de un
// triángulo rectángulo a partir de la base, la altura y un parámetro booleano
// (denominado bandera, flag (()o interruptor) para decidir si se trata de un
// rectángulo o
// un triángulo. Es decir, si se pasa como parámetro true hace el cálculo del
// área de
// un rectángulo, si se pasa false calcula el del triángulo.
// Devuelve el área. Parámetros del método: base, altura y la bandera.
// b) En el main codificar un menú clásico con las siguientes opciones:
// • Area de un triángulo (base*altura/2)
// • Area de un rectángulo (base*altura)
// • Area de un cuadrado (lado*lado)
// • Area de un círculo (Pi*radio 2)
// • Salir
// Las tres primeras opciones deben realizarse utilizando el método creado en el
// apartado anterior (por supuesto, sin modificarlo). Para la cuarta debe
// crearse
// un nuevo método con parámetro radio.