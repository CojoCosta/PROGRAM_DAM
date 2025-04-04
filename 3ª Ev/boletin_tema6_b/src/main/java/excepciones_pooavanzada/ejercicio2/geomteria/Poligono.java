package excepciones_pooavanzada.ejercicio2.geomteria;

import java.util.Scanner;

import excepciones_pooavanzada.ejercicio2.interfaz.Libreria;

public class Poligono extends Figura{
    public Punto[] puntos;

    public Poligono(String nombre, Punto origen, int tamañoDelArray){
        setNombre("triangulo");
        setOrigen(new Punto(0, 0));
        for (int i = 0; i < this.puntos.length; i++) {
            new Punto(Math.random(), Math.random());
        }
        
    }
    public Poligono(){
        this("Triangulo", new Punto(0,0),  3);
        new Punto(0, 0);
        new Punto(1, 1);
        new Punto(1, 0);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        double x;
        double y;
        for (int i = 0; i < puntos.length; i++) {
            System.out.print("Dame la x del punto");
            x = Libreria.pedirReal();
            System.out.print("Dame la y del punto");
            y = Libreria.pedirReal();
            puntos[i] = new Punto(x, y);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        for (int i = 0; i < puntos.length; i++) {
            System.out.println(puntos[i].toString());
        }
    }
}