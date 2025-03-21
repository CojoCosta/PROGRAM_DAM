import java.util.Scanner;

public class Bol2_Ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int incognita;
        int acierto;
        int intentos;
        int salir;        

        do {
            intentos=4;

            System.out.println("Bienvenido a la diversion, si quiere jugar escriba un numero entre el 1 y el 100 ");

            incognita = sc.nextInt();
            while (incognita < 1 || incognita > 100) {
                System.out.print("No te olvides de escoger un numero entre 1 y 100: ");
                incognita = sc.nextInt();
            }
            for (int espacio = 0; espacio < 50; espacio++) {
                System.out.println();
            }
            do {
                System.out.print("\nJugador 2: Elige un numero entre 1 y 100: ");
                acierto = sc.nextInt();
                while (acierto < 1 || acierto > 100) {
                    System.out.print("No te olvides de escoger un numero entre 1 y 100: ");
                    acierto = sc.nextInt();
                }
                if (acierto != incognita) {
                    if (acierto < incognita) {
                        System.out.println("Piense en un numero mas alto");
                    } else {
                        System.out.println("Piense en un numero mas bajo");
                    }
                    System.out.printf("Te quedan %d intentos.", intentos);
                    intentos--;

                }

            } while (acierto != incognita && intentos >-1);

            if (acierto == incognita) {
                System.out.println("Victoria");
            } else {
                System.err.printf("\nHas perdido el nº era el %d\n", incognita);

            }
            System.out.println("Desea seguir jugando pulse 1");
            System.out.println("Desea salir del juego pulse 2");
            salir = sc.nextInt();
            while (salir <1 || salir > 2) {
                System.out.println("Elija entre 1 y 2");
                salir = sc.nextInt();
            }
        } while (salir!=2);

    }
}