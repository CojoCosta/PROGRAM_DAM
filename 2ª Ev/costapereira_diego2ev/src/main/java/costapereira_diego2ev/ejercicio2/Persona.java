package costapereira_diego2ev.ejercicio2;

public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 10 || edad <= 80) {
            this.edad = edad;
        }
    }

    public Persona (String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
    }



}
