import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        // ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Tamaño: " + nombres.size());
        nombres.add("a");// 0
        nombres.add("p");// 1 y con la 'T' 2
        nombres.add(1, "T");// 1 Colocamos en la posicion 1 y desplaza la 'p'

        System.out.println("Tamaño: " + nombres.size());
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(1));
        System.out.println(nombres.get(2));
        nombres.add("D");
        System.out.println("Tamaño: " + nombres.size());
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(1));
        System.out.println(nombres.get(2));
        System.out.println(nombres.get(3));
        nombres.remove(2);
        System.out.println("Tamaño: " + nombres.size());
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(1));
        System.out.println(nombres.get(2));
    }
}
