package excepciones_pooavanzada.ejercicio1;

import java.util.InputMismatchException;

public class StringTooLongException extends InputMismatchException{
    public StringTooLongException(){
        super("Cadena demasiado larga");
    }
}
