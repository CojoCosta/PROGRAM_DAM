package excepciones_pooavanzada.ejercicio5.clases;

public class Astro {
    private String nombre;
    private double radio;

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }
    public String getNombre() {
        return nombre;
    }
    public String getNombre(char caracter) {
        String nuevoNombre = "";
        for (int i = 0; i < nombre.length(); i++) {
            nuevoNombre += nombre.charAt(i) + caracter;
        }
        return nuevoNombre.substring(0, nuevoNombre.length() - 1);
    }

    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new RadioNegativoException("Debe tener un radio positivo");
        } else{
            this.radio = radio;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
