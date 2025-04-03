package excepciones_pooavanzada.ejercicio2.geomteria;

import excepciones_pooavanzada.ejercicio2.interfaz.Libreria;

public class Linea extends Figura{
    private Punto puntoFinal;
    
    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }
    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        puntoFinal = new Punto(Libreria.pedirReal(), Libreria.pedirReal());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(puntoFinal);
    }

    public Linea(Punto puntoOrigen, Punto puntoFinal){
        super(puntoOrigen, "linea");
        setPuntoFinal(puntoFinal);
    }

    public Linea(){
        this(new Punto(0, 0), new Punto(1, 1));
    }
    
}
