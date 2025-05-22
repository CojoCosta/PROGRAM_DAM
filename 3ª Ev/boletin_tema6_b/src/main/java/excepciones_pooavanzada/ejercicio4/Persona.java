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
        comprobarDNI(dni);
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
        return nombre + " " + apellidos;
    }

    public String comprobarDNI(String dni){
        int numeros = 0;
        String numerosString = "";
        try {
            numerosString = dni.substring(0, 8);   
        } catch (IllegalArgumentException e) {
            throw new DNIException("tamaño de cadena incorrecto");
        }
        System.err.println(numerosString);
        if (dni.length() != 9 && dni.length() != 10 || numerosString.length() != 8) {
            throw new DNIException("DNI no valido.");
        } else {
                try {
                    numeros = Integer.parseInt(numerosString);
                } catch (NumberFormatException e) {
                    throw new DNIException("DNI no valido");
                }
        }
        String letra = dni.substring(8);
        if (letra.equals("-")) {
            letra = dni.replace('-', dni.charAt(9));
        }

        char letra2 = letra.charAt(0);
        letra2 = Character.toUpperCase(letra2);

        char letraFinal = LetrasDNI.charAt(numeros % 23);

        if (letra2 != letraFinal) {
            throw new DNIException("Esa letra no corresponde en el numero del DNI");
        }
        return numerosString + letra;
    }

}
