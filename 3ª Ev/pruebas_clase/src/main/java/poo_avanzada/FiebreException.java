package poo_avanzada;

public class FiebreException extends IllegalArgumentException {
    public FiebreException() {
        super("Supera los 39 grados");
    }
}
