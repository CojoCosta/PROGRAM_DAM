package boletin5.ejercicio8;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego> videojuegos;

    public Coleccion() {
        this.videojuegos = new ArrayList<>();
    }

    public void setVideojuegos(ArrayList<Videojuego> coleccionVideojuegos) {
        this.videojuegos = coleccionVideojuegos;
    }

    public ArrayList<Videojuego> getVideojuegos() {

        return videojuegos;
    }

    public static String formatearString(String cadenaFormateada) {
        if (cadenaFormateada.length() > 23) {
            return cadenaFormateada.substring(0, 19) + "...";
        } else {
            return cadenaFormateada;
        }
    }

    public ArrayList<Videojuego> comienzoDeJuego(String letrasComienzo) {
        ArrayList<Videojuego> juegosEncontrados = new ArrayList<>();
        for (Videojuego videojuego : getVideojuegos()) {
            for (int i = 0; i < 3; i++) {
                if (videojuego.getTitulo().startsWith(letrasComienzo)) {
                    juegosEncontrados.add(videojuego);
                }
            }
        }
        return juegosEncontrados;
    }

    public void menu() throws Exception {
        Scanner sc = new Scanner(System.in);
        Videojuego nuevoVideojuego = new Videojuego(2020, "Diego");
        int option;
        do {
            System.out.println("1.- Añadir nuevo videojuego");
            System.out.println("2.- Visualizar la lista videojuegos");
            System.out.println("3.- Buscar videojuegos");
            System.out.println("4.- Eliminar videojuegos eligiendo una posición");
            System.out.println("5.- Borrar videojuego según el año");
            System.out.println("6.- Salir");
            System.out.print("Introduce una opción: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    boolean isCheck = false;
                    String nombreVideojuego;
                    String posicionVideojuego;

                    do {
                        nuevoVideojuego = new Videojuego(2020, "Diego");
                        System.out.print("Introduce el nombre del videojuego: ");
                        nombreVideojuego = sc.nextLine();
                        nuevoVideojuego.setTitulo(nombreVideojuego);

                        System.out.print("Lo quieres añadir al principio o al final (P (Principio) / F (Final)): ");
                        posicionVideojuego = sc.nextLine().toLowerCase();

                        if (posicionVideojuego.equals("p")) {
                            this.videojuegos.add(0, nuevoVideojuego);
                            isCheck = true;
                        } else if (posicionVideojuego.equals("f")) {
                            this.videojuegos.add(nuevoVideojuego);
                            isCheck = true;
                        } else {
                            System.out.println("Introduce \"p\" o \"f\" en minúscula");
                        }
                    } while (!isCheck);
                    break;
                case 2:
                    int indice = 1;
                    System.out.printf("%-4s %-23s %-23s %-4s","", "Titulo", "Fabricante", "Año" );
                    for (Videojuego videojuego : this.videojuegos) {
                        System.out.printf("\n%-4d %-23s %-23s %4d \n", indice,
                                formatearString(videojuego.getTitulo()), formatearString(videojuego.getFabricante()),
                                videojuego.getAño());
                        indice++;
                    }
                    break;
                case 3:
                    String letrasJuego = "";
                    do {
                        System.out.println("Introduce las tres primeras letras del título del juego: ");
                        letrasJuego = sc.nextLine().toLowerCase();
                        for (Videojuego videojuego : comienzoDeJuego(letrasJuego)) {
                            System.out.println(videojuego);
                        }
                    } while (letrasJuego.length() > 3 || letrasJuego.length() < 1);
                    break;
                case 4:
                    int posicion;
                    do {
                        System.out.print("Introduce la posición del videojuego que quieres eliminar: ");
                        posicion = sc.nextInt();
                        if (posicion < 1 || posicion > this.videojuegos.size()) {
                            System.out.println("Introduce una posición válida");
                        } else{
                            this.videojuegos.remove(posicion -1);
                        }
                    } while (posicion < 1 || posicion > this.videojuegos.size());
                    break;
                case 5:
                    int año;
                    System.out.print("Elige el año del videojuego que quieres borrar: ");
                    año = sc.nextInt();
                    for (Videojuego videojuego : videojuegos) {
                        if (año == videojuego.getAño()) {
                            videojuegos.remove(videojuego);
                        }
                    }
                    break;
                case 6:
                File file = new File("videojuegos.txt");
                PrintWriter write = new PrintWriter(file);
                if (file.exists()) {
                    
                }


                    break;
            }

        } while (option != 6);
    }
}