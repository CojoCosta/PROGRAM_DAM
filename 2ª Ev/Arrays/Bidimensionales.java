public class Bidimensionales {
    public static void main(String[] args) {
        int [][] temp = new int [7][4];
/*----------------Como ver filas y columnas----------------------- */
        System.out.println("Nº de filas: " + temp.length);
        System.out.println("Nº de columnas: " + temp[0].length);
/*---------------------------------------------------------------- */
/*-------------Bucle para hacer la tabla de datos----------------- */
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                temp[i][j] = (int) (Math.random() * 40 - 10);
                System.out.printf("%3d", temp[i][j]);
            }
            System.out.println();
        }
/*---------------------------------------------------------------- */
    }
}
