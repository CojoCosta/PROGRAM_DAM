package excepciones_pooavanzada.ejercicio2.geomteria;

import excepciones_pooavanzada.ejercicio2.interfaz.Libreria;

public class Circunferencia extends Figura{
    private double radio;

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        } else{
            this.radio = radio;
        }
    }

    public Circunferencia(Punto punto, double radio){
        super(punto, "Circunferencia");
        setRadio(radio);
    }
    public Circunferencia(){
        this(new Punto(0, 0), 1);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        System.out.print("Cual es el radio de la circunferencia: ");
        this.radio = Libreria.pedirReal();
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(this.radio);
    }
    
}
