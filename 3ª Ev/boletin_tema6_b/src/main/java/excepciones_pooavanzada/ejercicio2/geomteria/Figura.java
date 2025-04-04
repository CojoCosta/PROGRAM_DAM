package excepciones_pooavanzada.ejercicio2.geomteria;

import java.util.Scanner;

import excepciones_pooavanzada.ejercicio2.interfaz.InterfazUsuario;
import excepciones_pooavanzada.ejercicio2.interfaz.Libreria;


public class Figura implements InterfazUsuario {
    protected Punto origen;
    protected String nombre;

    // #region SET/GET
    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto punto) {
        this.origen = punto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }
    // #endregion

    // #region CONSTRUCTORES
    public Figura(Punto punto, String nombre) {
        setOrigen(punto);
        setNombre(nombre);
    }

    public Figura() {
        this(new Punto(0, 0), "");
    }
    // #endregion

    // #region FUNCIONES
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        System.out.print("Escribe el nombre: ");
        this.nombre = sc.nextLine();
        x = Libreria.pedirReal();
        y = Libreria.pedirReal();
        this.origen = new Punto(x, y);
    }

    @Override
    public void mostrarDatos() {
        System.out.println(nombre);
        System.out.println(origen);
    }
    // #endregion
}
