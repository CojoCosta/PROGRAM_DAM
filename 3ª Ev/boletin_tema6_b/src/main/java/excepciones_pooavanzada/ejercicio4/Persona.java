package excepciones_pooavanzada.ejercicio4;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private static String LetrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    // #region SET Y GET
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
        int numeros;
        String numerosString = dni.substring(0, 8);
        if (dni.length() != 9  || numerosString.length() != 8) {
            throw new DNIException("El numero del DNI debe tener 8 cifras");
        } else {
            for (int i = 0; i < numerosString.length(); i++) {
                Integer.parseInt(String.format("%c",numerosString.charAt(i)));
            }
            numeros = Integer.parseInt(numerosString);
        }
        String letra = dni.substring(8);

        char letra2 = letra.charAt(1);
        letra2 = Character.toUpperCase(letra2);

        char letraFinal = LetrasDNI.charAt(numeros % 23);

        if (letra2 != letraFinal) {
            throw new DNIException("Esa letra no corresponde en el numero del DNI");
        }
        this.dni = numerosString + letra;
    }

    public String getDni() {
        return dni;
    }
    // #endregion

    // #region CONSTRUCTORES
    public Persona(String nombre, String apellidos, int edad, String dni) {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
    }

    // #endregion
    @Override
    public String toString() {
        return nombre + apellidos;
    }

}
