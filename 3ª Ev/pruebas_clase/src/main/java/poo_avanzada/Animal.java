package poo_avanzada;

public class Animal {
    public String nombreCientifico;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void muestraDatos(){
        System.out.printf("\nTengo %d años", this.edad);
        }

    
}
