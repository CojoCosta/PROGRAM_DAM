package Programas.BoletinTema3;

import java.util.Scanner;

//un numero aleatorio entre 1 y 3 sin usar math.ceil 
public class Bol3_Ejer12 {
    public static char generarQuiniela() {
        int numeroAleatorio = (int) (Math.random() * 3);
        return numeroAleatorio == 1 ? '1' : numeroAleatorio == 2 ? '2' : 'X';
    }

    public static char quinielaPonderada() {
        int numeroAleatorio = (int) (Math.random() * 100);
        return numeroAleatorio <= 59 ? '1' : numeroAleatorio > 60 && numeroAleatorio < 84 ? 'X' : '2';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int cont;
        do {
            System.out.println("1.-Quiniela normal.");
            System.out.println("2.-Quiniela ponderada.");
            System.out.println("3.-Salir.");
            System.out.print("Elige la Quiniela que quieras jugar:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                cont=0;
                for (int i = 0; i<14 ; i++){
                    cont = cont+1;
                    System.out.printf("El resultado del partido %2d es %s\n", cont, generarQuiniela());
                }
                break;
                case 2:
                cont = 0;
                for (int i = 0; i < 14; i++) {
                    cont = cont+1;
                    System.out.printf("El resultado del partido %2d es %s\n", cont, quinielaPonderada());                    }
                        break;
                case 3:
                    System.out.println("Gracias por venir");
                        break;
                default:
                    System.out.println("Opcion no valida");
                        break;
            }
        } while (option !=3);
        sc.close();
    }
}
// 12. a) Codificar un programa que genere una quiniela aleatoria. Es decir, se
// deben
// dar 14 resultados aleatorios como 1, X ó 2 indicando delante el número de
// partido
// y los resultados alineados en una columna (no uses \t, si no ajuste con
// printf ). Se
// debe realizar al menos una función que devuelva un 1 una X o un 2 (char o
// String)
// aleatorio.
// b) Realizar la quiniela ponderada, es decir, haz otra función que devuelva 1,
// X o 2
// pero que la probabilidad de sacar 1 sea del 60%, la de sacar X sea 25% y la
// de
// sacar un 2 sea un 15%.
// Enel main debes dar a elegir quiniela normal o ponderada.
// Pista: Sacar un numero aleatorio entre 1 y 100. Si el resultado es menor o
// igual
// que 60, se asigna un 1 al resultado, si es entre 61 y 85 (60+25) se le asigna
// una X
// y si es entre 86 y 100 se le asigna un 2.
