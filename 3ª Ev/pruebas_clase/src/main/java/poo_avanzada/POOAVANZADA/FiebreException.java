package poo_avanzada.POOAVANZADA;

public class FiebreException extends IllegalArgumentException {
    public FiebreException() {
        super("Supera los 39 grados");
    }
}
