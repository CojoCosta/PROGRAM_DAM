package excepciones_pooavanzada.ejercicio5;

import java.util.InputMismatchException;

public class RadioNegativoException extends InputMismatchException{
    public RadioNegativoException(String mensaje){
        super(mensaje);
    }
}
