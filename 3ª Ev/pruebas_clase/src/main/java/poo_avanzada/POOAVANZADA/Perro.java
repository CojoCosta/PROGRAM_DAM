package poo_avanzada.POOAVANZADA;

class Perro extends Animal {
    public String raza;
    public String nombreHumano;

    public Perro() {
        this(0, "", "");//Para hacer el constructor corto (Tiene que ser el primero)
        this.nombreCientifico = "Canis Familiaris";
    }

    public Perro(int edad, String raza, String nombreHumano) {
        super();//Igual que this en el constructor pero para el constructor de la superclase
        this.setEdad(edad);
        this.raza = raza;
        this.nombreHumano = nombreHumano;
        this.nombreCientifico = "Canis Familiaris";
    }

    public void ladrar() {
        System.out.println("GUAU!!!");
    }

    private double temperatura;
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        if (temperatura > 39.0) {
            throw new FiebreException();
        }
    }
    public double getTemperatura() {
        return temperatura;
    }
}
