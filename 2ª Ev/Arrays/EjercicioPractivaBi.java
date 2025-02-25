public class EjercicioPractivaBi {
    public static double[][] tabla(int filas, int columnas) {
        double[][] tabla1 = new double[filas][columnas];
        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1[0].length; j++) {
                tabla1[i][j] = (Math.random() * 10 + 20);
            }
        }
        return tabla1;
    }

    public static void pintarTabla(double[][] tabla) {

        for (int i = 0; i < tabla[0].length; i++) {
            System.out.printf("%6d",i);
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(i);
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.printf("%7.2f", tabla[i][j]);
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] array1 = tabla(4, 3);
        pintarTabla(array1);

        System.out.println();

        double[][] array2 = tabla(3, 4);
        pintarTabla(array2);

    }
}