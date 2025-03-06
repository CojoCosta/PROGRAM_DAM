package costapereira_diego2ev.ejercicio1;

import java.io.File;
import java.io.PrintWriter;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Matriz matriz1 = new Matriz(4, 3, "Matriz de Datos");
        System.out.println("Nombre completo de la matriz");
        System.out.println(matriz1.getNombre());
        System.out.println("Nombre con la sobrecarga del get");
        System.out.println(matriz1.getNombre(4));
        matriz1.visualizarTabla();
        System.out.println();
        System.out.printf("Numero maximo de la fila %d es: %d",4,matriz1.maximo(4));
        System.out.printf("\nNumero maximo de la fila %d es: %d",0,matriz1.maximo(0));

        File file = new File("examen.txt");
        PrintWriter escribir = new PrintWriter(file);
        escribir.print(matriz1.getNombre()+"\n");
        for (int i = 0; i < matriz1.getTabla().length; i++) {
            for (int j = 0; j < matriz1.getTabla()[i].length; j++) {
                escribir.printf("%4d ;",matriz1.getTabla()[i][j]);
            }
        }
        escribir.close();
    }
}
