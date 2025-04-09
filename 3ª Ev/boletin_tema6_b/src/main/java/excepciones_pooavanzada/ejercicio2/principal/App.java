package excepciones_pooavanzada.ejercicio2.principal;

import java.util.ArrayList;
import java.util.Scanner;

import excepciones_pooavanzada.ejercicio2.geomteria.Circunferencia;
import excepciones_pooavanzada.ejercicio2.geomteria.Figura;
import excepciones_pooavanzada.ejercicio2.geomteria.Linea;
import excepciones_pooavanzada.ejercicio2.geomteria.Poligono;
import excepciones_pooavanzada.ejercicio2.geomteria.Punto;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Figura>figuras = new ArrayList<Figura>();
        Punto punto = new Punto(0, 0);
        Punto punto2 = new Punto(1,1);

        figuras.add(new Linea(punto, punto2));
        figuras.add(new Poligono());
        figuras.add(new Poligono("Cuadrado", punto, 4));
        figuras.add(new Circunferencia(punto, 4));

        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i).getNombre().equals("Circunferencia")) {
                System.out.print(figuras.get(i).getNombre());
                System.out.println((((Circunferencia)figuras.get(i)).getRadio()));
            }
            System.out.print(figuras.get(i).getNombre());

        }

        System.out.printf("Que elemento de la colección de %d elementos quieres ver sus datos: ", figuras.size());
        int indice = sc.nextInt();
        // System.out.println(figuras.get(indice - 1));

        sc.close();
    }
}