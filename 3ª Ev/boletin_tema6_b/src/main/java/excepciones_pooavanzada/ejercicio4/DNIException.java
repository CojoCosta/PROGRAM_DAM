package excepciones_pooavanzada.ejercicio4;

public class DNIException extends IllegalArgumentException{
    public DNIException (String mensaje){
        super(mensaje);
    }
}
