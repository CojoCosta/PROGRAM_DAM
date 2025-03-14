/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2025 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */

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
