package Programas.BoletinTema3;

import java.util.Scanner;

public class Bol3_Ejer3 {
    /**
     * Pedir datos y que sean positivos
     * @return sacar valor para altura y radio más adelante
     */
    public static Double pedirDato(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un dato : ");
        double n;
        n = sc.nextDouble();
        while (n<0) {
            System.out.print("Debe ser positivo. Dime un dato : ");
            n = sc.nextDouble();
        }
        return n;
    }

    /**
     * Fórmula de la superficie del cilindro
     * @param altura
     * @param radio
     * @return operación de cálculo
     */
    public static Double superficieCilindro(double altura, double radio){
        return 2 * Math.PI * radio * altura;
    }
    /**
     * Mostrar en el programa el resultado final
     * @param algo
     * @param resultado
     */
    public static void mostrarDato(String algo, double resultado){
        System.out.printf("%s %.3f \n",algo, resultado);
    }
    public static void main(String[] args) {
        double altura;
        double radio;
        altura = pedirDato();
        radio = pedirDato();
        double superficie = superficieCilindro(altura, radio);
        mostrarDato("El area es de: ", superficie);


    }
}
// 3. Realiza un programa que halle la superficie de un cilindro sabiendo que:
// Superficie=2*π*radio*altura
// Debe constar de 3 métodos:
// • pedirDato: pide un dato real usuario comprobando que sea un valor
// positivo. Al final devuelve dicho dato.
// • superficieCilindro: Se le pasa como parámetros el radio y la altura,
// hace el cálculo de la superficie y lo devuelve (sin nada de interfaz de
// usuario).
// • mostrarDato: Función que tiene un real como parámetro y un String.
// Muestra en la misma línea el String y a continuación el real con 3
// decimales. No devuelve nada.
// Por tanto en el programa principal (main) solo debe llamarse a los tres métodos (y
// declarar variables auxiliares para recoger los datos). Dos veces al primero para
// pedir primero radio y después la altura, luego se llama al segundo para hacer el
// cálculo, y finalmente se llama al tercero para mostrar el resultado. Si lo necesitas
// usa variables intermedias para quedar con resultados de las funciones.