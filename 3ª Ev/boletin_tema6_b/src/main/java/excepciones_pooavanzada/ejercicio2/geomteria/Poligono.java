package excepciones_pooavanzada.ejercicio2.geomteria;

public class Poligono extends Figura{
    public Punto[] puntos;

    //TODO TODO MAL LLAMAR A CURRO
    public Poligono(String nombre, Punto origen, int puntos, int tamañoDelArray){
        setNombre("triangulo");
        setOrigen(new Punto(0, 0));
        for (int i = 0; i < this.puntos.length; i++) {
            puntos = (int)(Math.random());
        }
        
    }
    public Poligono(){
        this(nombre, origen, 0, 3);
    }
}
