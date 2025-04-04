package excepciones_pooavanzada.ejercicio1;

public class StringOutOfBoundsException extends IllegalArgumentException{
    public StringOutOfBoundsException(String mensaje){
        super(mensaje);
    }
}
