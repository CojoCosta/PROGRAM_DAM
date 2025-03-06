package costapereira_diego2ev.ejercicio1;

public class Matriz {
    private int[][] tabla;
    private String nombre;

    public int[][] getTabla() {
        return tabla;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNombre(int numeroEntero) {
        String nombreFinal = "";
        for (int i = 0; i <= numeroEntero; i++) {
            nombreFinal += nombre.substring(i, i + 1);
            nombreFinal += " ";
        }
        return nombreFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }


    public Matriz(int filas, int columnas, String nombreTabla) {
        setNombre(nombreTabla);
        if (filas < 3 || columnas < 3) {
            filas = 3;
            columnas = 3;
        }
        tabla = new int[filas][columnas];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * 16 + 5);
            }
            if (i == tabla.length - 1) {
                for (int j = 0; j < tabla[i].length; j++) {
                    tabla[i][j] = 1;
                }

            }
        }
    }

    public void visualizarTabla() {
        // ASCII EMPIEZA 'A' EN 65
        System.out.println(getNombre());
        String espacio = "";
        System.out.printf("%4s", espacio);
        int k = 1;
        for (int i = 0; i < tabla[0].length; i++) {
            System.out.printf("%4d", k);
            k++;
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%4d", i + 1);
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        }
    }

    public int maximo(int fila) {
        int numeroMaximo = 0;
        if (fila > 0 && fila <= tabla.length) {
            for (int i = 0; i < tabla.length; i++) {
                if (i == fila - 1) {
                    for (int j = 0; j < tabla[i].length; j++) {
                        if (numeroMaximo < tabla[i][j]) {
                            numeroMaximo = tabla[i][j];
                        } 
                    }
                    
                }
            } return numeroMaximo;
            } else {
        return -1;
        }
    }
}