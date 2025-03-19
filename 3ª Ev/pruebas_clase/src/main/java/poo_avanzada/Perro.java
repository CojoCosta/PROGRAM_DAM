package poo_avanzada;

class Perro extends Animal {
    public String raza;
    public String nombreHumano;

    public Perro() {
        this.nombreCientifico = "Canis Familiaris";
    }

    public Perro(int edad, String raza, String nombreHumano) {
        this.setEdad(edad);
        this.raza = raza;
        this.nombreHumano = nombreHumano;
        this.nombreCientifico = "Canis Familiaris";
    }

    public void ladrar() {
        System.out.println("GUAU!!!");
    }
}
