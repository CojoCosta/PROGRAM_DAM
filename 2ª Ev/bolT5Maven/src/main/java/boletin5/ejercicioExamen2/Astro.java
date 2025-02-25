package boletin5.ejercicioExamen2;

public class Astro {
    private String nombre;
    public double radio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre.toUpperCase().trim();
    }
    
    public String getNombre(char caracter){
        String palabra = "";
        for (int i = 0; i < nombre.length(); i++) {
            if (i < nombre.length() - 1) {
                palabra += nombre.charAt(i);
                palabra += caracter;
            } else {
                palabra += nombre.charAt(i);
            }

        }
        return palabra;
    }


    public void muestraDatos(){
        setNombre(nombre);
        System.out.println(getNombre());
        System.out.printf("El radio del sol es %.2f", radio);
    }
}
