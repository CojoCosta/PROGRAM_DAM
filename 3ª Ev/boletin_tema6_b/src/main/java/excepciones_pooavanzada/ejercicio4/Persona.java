package excepciones_pooavanzada.ejercicio4;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private static String LetrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

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
    
    public void setDni(int numeros, char letra) {
        String numerosString = String.format("%8d", numeros);
        if (!numerosString.matches("\\d{8}"))  { //TODO preguntar a Curro si puedo uitlizar esta funcion
            throw new DNIException("El numero del DNI debe tener 8 cifras");
        }
        letra = Character.toUpperCase(letra);

        char letraFinal = LetrasDNI.charAt(numeros%23);

        if (letra != letraFinal) {
            throw new DNIException("Esa letra no corresponde en el numero del DNI");
        }
        this.dni = numerosString + letra;
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
        setDni(dni); //TODO preguntar porque falla
    }

    //#endregion
    @Override
    public String toString() {
        return nombre + apellidos;
    }
    
}
