package poo_avanzada;

public class Principal {
    public static void main(String[] args) {
        Mosca m = new Mosca();
        Perro p = new Perro(5, "Palleiro", "Lucky");

        System.out.println(m.nombreCientifico);
        System.out.println(m.getEdad());
        System.out.println();
        System.out.println(p.nombreHumano);
        System.out.println(p.nombreCientifico);
    }
}
