package boletin5.ejercicioExamen2;

public class Principal {
    public static void main(String[] args) {
        Astro nombre = new Astro();
        nombre.setNombre("sol");
        System.out.println(nombre.getNombre());
        System.out.println(nombre.getNombre('_'));
        
    }
}
