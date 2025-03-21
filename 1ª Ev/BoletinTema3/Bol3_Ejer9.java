package Programas.BoletinTema3;

import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class Bol3_Ejer9 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int option;
        int numero;
        String archivo;
        do {
            System.out.println("1.- Mostrar primos menores que uno dado: ");
            System.out.println("2.- Primos en archivo: ");
            System.out.println("3.- Archivo con primos:  ");
            System.out.println("4.- Salir.  ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Dime un numero mayor que 2:");
                    numero = sc.nextInt();
                    Bol3_Ejer8.numerosPrimos(numero);
                    break;
                case 2:
                    archivo = "./Programas/Tema3/BoletinTema3/Ej9.txt";
                    Scanner scannerArchivo = new Scanner(new File(archivo));
                    int nPrimos;
                    while (scannerArchivo.hasNext()) {
                        nPrimos = scannerArchivo.nextInt();
                        if (Bol3_Ejer8.primo(nPrimos)) {
                            System.out.println(nPrimos + " es primo");
                        } else {
                            System.out.println(nPrimos + " no es primo");
                        }
                    }
                    scannerArchivo.close();
                    break;
                case 3:
                    System.out.print("Dime un numero mayor que 2: ");
                    numero = sc.nextInt();
                    PrintWriter escribirWriter = new PrintWriter(new File("./Programas/Tema3/BoletinTema3/Ej9.txt"));
                    for(int i = 2; i <= numero; i++){
                        if(Bol3_Ejer8.primo(i)){
                            escribirWriter.print(i + ";");
                        }
                    }
                    escribirWriter.close();
                    break;
                case 4:
                    System.out.println("Adiós");
                default:
                    break;
            }
        } while (option != 4);
        sc.close();
    }
}
// 9. Modifica el ejercicio anterior de los números primos (solo el main) de
// forma
// que hagas un menú clásico con estas opciones:
// 1. Mostrar primos menores que uno dado: Esto es lo que ya estaba del
// ejercicio previo.
// 2. Primos en archivo: Pide el nombre de un archivo que debe contener
// números, cada uno en una línea. Lee dicho archivo y muestra dichos números
// en pantalla diciendo si son o no primos.
// 3. Archivo con primos: Similar a 1, se le pide un número mayor que 2 al
// usuario y guarda en un archivo todos los primos desde 2 hasta el que meta el
// usuario. Estarán todos en la misma línea separados por punto y coma (;).
// 4 Salir: El programa solo finaliza si se selecciona esta opción.