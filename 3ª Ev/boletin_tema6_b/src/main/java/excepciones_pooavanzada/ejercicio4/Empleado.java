package excepciones_pooavanzada.ejercicio4;

public class Empleado extends Persona{

    private double salarioAnual;
    private double irpf;

    //#region SET Y GET
    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
        if (salarioAnual < 6000) {
            irpf = 7.5;
        } else if (salarioAnual >= 6000 && salarioAnual <= 30000) {
            irpf = 15;
        } else if (salarioAnual > 30000) {
            irpf = 20;
        }
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public double getIrpf() {
        return irpf;
    }
    // #endregion
    // #region CONSTRUCTORES
    public Empleado() {
        super("", "", 0, "");
        salarioAnual = 0;
        irpf=7.5;
    }

    public Empleado(String apellidos, String nombre, int edad, String dni, double salarioAnual) {
        super(nombre, apellidos, edad, dni);
        setSalarioAnual(salarioAnual);
    }

    // #endregion
    // #region METODOS
    double irpf() {
        return (getSalarioAnual() * getIrpf() / 100);
    }
    // #endregion
}
