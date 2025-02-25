package boletin5.ejercicio6;

public class Matriz {
    public int[][] matriz;

    // #region CONSTRUCTORES
    /**
     * Inicializa la propiedad de la matriz del tamaño indicado por el parametro y compuesta por numeros aleatorios del 0 al 10
     * @param numero tamaño de la matriz de filas y columnas
     */
    public Matriz(int numero) {
        this.matriz = new int[numero][numero];
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                this.matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    // #endregion

    // #region METODOS
    /**
     * Funcion que muestra una matriz a traves de un array bidimensional con sus respectivos índices
     * @param tabla array bidimensional
     */
    public static void mostrarMatriz(int[][] tabla) {
        String espacio = " ";
        System.out.printf("%4s", espacio);
        for (int i = 0; i < tabla[0].length; i++) {
            System.out.printf("%4d", i+1);
        }
        System.out.println();
        int k = 1;
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%4d", k);
            k++;
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Funcion que suma los elemtos de la matriz
     * @return devuelve el resultado de la suma
     */
    public int sumaMatriz() {
        int acu = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                acu += matriz[i][j];
            }
        }
        return acu;
    }

    /**
     * funcion sobrecargada que devuelve la suma de la diagonal de la matriz o del resto de los elementos
     * @param flag parametro que si es true calcula la diagonal y si es false el resto
     * @return devuelve el resultado de la suma de la diagonal o el resultado de la suma del resto de los elementos
     */
    public int sumaMatriz(boolean flag) {
        int acuDiagonal = 0;
        if (flag == true) {
            for (int i = 0; i < this.matriz.length; i++) {
                acuDiagonal += this.matriz[i][i];
            }
            return acuDiagonal;
        } else {//TODO sin bucles
            return  sumaMatriz() - sumaMatriz(true);

        }
    }

    /**
     * funcion sobrecargada que calcula la suma de los elementos de una fila
     * @param numeroDeFila indica la fila de la matriz que queremos calcular la suma
     * @return el resultados de la suma de los elemntos de la fila indicada y devuelve -1 si la fila de la matriz es incorrecta
     */
    public int sumaMatriz(int numeroDeFila){
        if (numeroDeFila < this.matriz.length && numeroDeFila >= 0) {
            int acu = 0;
            for (int i = 0; i < this.matriz[numeroDeFila].length; i++) {
                    acu += this.matriz[numeroDeFila][i];
            }
            return acu;
        } else {
            return -1;
        }
    }
    
    /**
     * funcion que recoge una matriz y elimina una de sus filas
     * @param numeroDeFila indica la fila de la matriz que queremos eliminar
     * @return devuelve una matriz de una fila menos y si el numero de fila es incorrecto devuelve la matriz original
     */
    public int[][] borrarFila(int numeroDeFila){
        int[][] nuevaMatriz = new int[this.matriz.length-1][this.matriz.length];
        int k = 0;
        if (numeroDeFila > this.matriz.length || numeroDeFila < 0) {
        return this.matriz;
        } else{
            for (int i = 0; i < this.matriz.length; i++) {
                if (i == numeroDeFila-1) {
                
                } else {

                    for (int j = 0; j < this.matriz[i].length; j++) {
                        nuevaMatriz[k][j]= this.matriz[i][j];
                    }
                    k++;
                }
            }
            return nuevaMatriz;
        }
    }
}
    // #endregion

