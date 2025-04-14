package excepciones_pooavanzada.ejercicio2.principal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones_pooavanzada.ejercicio2.geomteria.Circunferencia;
import excepciones_pooavanzada.ejercicio2.geomteria.Figura;
import excepciones_pooavanzada.ejercicio2.geomteria.Linea;
import excepciones_pooavanzada.ejercicio2.geomteria.Poligono;
import excepciones_pooavanzada.ejercicio2.geomteria.Punto;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        Punto punto = new Punto(0, 0);
        Punto punto2 = new Punto(1, 1);
        int option = 0;
        int option2 = 0;
        do {
            System.out.println("1. Insertar una línea, un triángulo un cuadrado o una circunferencia.");
            System.out.println("2. Mostrar los elementos de la colección.");
            System.out.println("3. Mostrar los datos de un elemento de la colección.");
            System.out.println("4. Borrar elementos de un tipo.");
            System.out.println("5. Salir.");
            try {
                option = sc.nextInt();
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Parametro inválido");
                sc.nextLine();
                option = 6;
            } catch (InputMismatchException e) {
                System.out.println("Parametro inválido");
                sc.nextLine();
                option = 6;
            }
            switch (option) {
                case 1:
                    do {
                        System.out.println("1. Linea");
                        System.out.println("2. Triangulo");
                        System.out.println("3. Cuadrado");
                        System.out.println("4. Circunfererencia");
                        System.out.print("¿Que elemento quiere añadir? ");
                        try {
                            option2 = sc.nextInt();
                            sc.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.out.println("Parametro inválido");
                            sc.nextLine();
                            option2 = 5;
                        } catch (InputMismatchException e) {
                            System.out.println("Parametro inválido");
                            sc.nextLine();
                            option2 = 5;
                        }
                        switch (option2) {
                            case 1:
                                figuras.add(new Linea(punto, punto2));
                                break;
                            case 2:
                                figuras.add(new Poligono());
                                break;
                            case 3:
                                figuras.add(new Poligono("Cuadrado", punto, 4));
                                break;
                            case 4:
                                figuras.add(new Circunferencia(punto, 4));
                                break;
                            default:
                                System.out.println("Elija una opción del 1 al 4");
                        }
                    } while (option2 < 1 || option2 > 4);
                    break;

                case 2:
                    if (figuras.size() == 0) {
                        System.out.println("No hay datos que mostrar.");
                    } else {
                        for (int i = 0; i < figuras.size(); i++) {
                            if (figuras.get(i).getNombre().equals("CIRCUNFERENCIA")) {
                                System.out.printf("%d: Nombre: %s ", i + 1, figuras.get(i).getNombre());
                                System.out.printf("y radio: %.2f\n", (((Circunferencia) figuras.get(i)).getRadio()));
                            } else {
                                System.out.printf("%d: Nombre: %s\n", i + 1, figuras.get(i).getNombre());
                            }
                        }
                    }
                    break;

                case 3:
                    int indice = 0;
                    System.out.printf("Que elemento de la colección de %d elementos quieres ver sus datos: ", figuras.size());
                    try {
                        indice = sc.nextInt();
                        sc.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Parametro inválido");
                        sc.nextLine();
                        option2 = 5;
                    } catch (InputMismatchException e) {
                        System.out.println("Parametro inválido");
                        sc.nextLine();
                        option2 = 5;
                    }
                    for (int i = 0; i < figuras.size(); i++) {
                        if (i == (indice - 1)) {
                            System.out.printf("%d: Nombre: %s\n", i + 1, figuras.get(i).getNombre());
                        } else if (figuras.get(i).equals("CIRCUNFERENCIA")) {
                            System.out.printf("%d: Nombre: %s ", i + 1, figuras.get(i).getNombre());
                            System.out.printf("y radio: %.2f\n", (((Circunferencia) figuras.get(i)).getRadio()));
                        }
                    }
                    break;

                case 4: 
                    do {
                        System.out.println("1. Linea");
                        System.out.println("2. Poligono(Triangulo y cuadrado)");
                        System.out.println("3. Circunfererencia");
                        System.out.print("¿Que elementos quieres eliminar? ");
                        switch (option2) {
                            case 1:
                                for (int i = 0; i < figuras.size(); i++) {
                                    if (figuras.get(i).equals("LINEA")) {
                                        figuras.remove(i);
                                    }
                                }
                                break;
                                case 2:
                                for (int i = 0; i < figuras.size(); i++) {
                                    if (figuras.get(i).equals("TRIANGULO") || figuras.get(i).equals("CUADRADO")) {
                                        figuras.remove(i);
                                    }
                                }
                                
                                break;
                                case 3:
                                for (int i = 0; i < figuras.size(); i++) {
                                    if (figuras.get(i).equals("CIRCUNFERENCIA")) {
                                        figuras.remove(i);
                                    }
                                }
                                break;

                            default:
                                System.out.println("Elija una opción del 1 al 4");
                                break;
                        }
                    } while (option2 < 1 || option2 > 3);
                    break;

                case 5:
                    System.out.println("Gracias por usar este programa");
                    break;
            }
        } while (option != 5);
        sc.close();
    }
}