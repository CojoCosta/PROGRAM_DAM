
package boletin5.ejercicio5;

import java.time.LocalDate;


public class Ventas {
    public int[] ventasDelMes = new int[12];

    private int año;

    // #region SET Y GET
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        int añoActual = LocalDate.now().getYear();
        if (año >= añoActual) {
            this.año = añoActual - 1;
        } else {
            this.año = año;
        }
    }
    // #endregion

    // #region CONTRUCTORES
    public Ventas(int año) {
        setAño(año);
        for (int i = 0; i < ventasDelMes.length; i++) {
            this.ventasDelMes[i] = (int) (Math.random() * 999 + 1);
        }

    }

    public Ventas(int año, int[] ventasDelMes) {
        setAño(año);
        if (ventasDelMes.length != 12) {
            for (int i = 0; i < ventasDelMes.length; i++) {
                this.ventasDelMes[i] = (int) (Math.random() * 999 + 1);
            }
        } else {
            this.ventasDelMes = ventasDelMes;
        }
    }
    // #endregion

    // #region MÉTODOS
    /**
     * Funcion que calcula la media de los valores de un array
     * @return la media de los valores
     */
    public double media() {
        double acu = 0;
        for (int i = 0; i < ventasDelMes.length; i++) {
            acu += ventasDelMes[i];
        }
        double mediaVentas = acu / ventasDelMes.length;
        return mediaVentas;
    }

    /**
     * Funcion que muestra por pantalla una grafica en funcion de los valores de cada mes
     */
    public void grafica() {
        System.out.print("Año: " +getAño());
        int unidades;
        for (int i = 0; i < ventasDelMes.length; i++) {
            unidades = ventasDelMes[i]/100 + 1;
            System.out.printf("\nMes %2d): ", i+1, "(" + ventasDelMes[i]);
            for (int j = 0; j < unidades; j++) {
                System.out.print("#");
            }
        }
    }
    // #endregion

}
