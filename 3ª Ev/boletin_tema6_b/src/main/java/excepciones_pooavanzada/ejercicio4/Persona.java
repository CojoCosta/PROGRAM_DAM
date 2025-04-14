package excepciones_pooavanzada.ejercicio4;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    //#region SET Y GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getDni() {
        return dni;
    }
    //#endregion

    //#region  CONSTRUCTORES
    public Persona(String nombre, String apellidos, int edad, String dni) {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
    }
    //#endregion
    
}
