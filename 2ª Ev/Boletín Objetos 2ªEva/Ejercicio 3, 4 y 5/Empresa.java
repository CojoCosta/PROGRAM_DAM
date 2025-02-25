public class Empresa {
    private double ganancias;
    public Directivo directivo1;
    public Empleado empleado1;
    public Empleado empleado2;

    public IUDirectivo iuDirectivo1;
    public IUEmpleado iuEmpleado1;
    public IUEmpleado iuEmpleado2;

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }
    public double getGanancias() {
        return ganancias;
    }

    //#region CONSTRUCTORES
    public Empresa(Directivo directivo1, Empleado empleado1, Empleado empleado2){
        this.directivo1 = directivo1;
        iuDirectivo1 = new IUDirectivo(directivo1);
        this.empleado1 = empleado1;
        iuEmpleado1 = new IUEmpleado(empleado1);
        this.empleado2 = empleado2;
        iuEmpleado2 = new IUEmpleado(empleado2);
    }
    
    public Empresa(Directivo directivo1, Empleado empleado1, Empleado empleado2, double ganancias){
        this.directivo1 = directivo1;
        iuDirectivo1 = new IUDirectivo(directivo1);
        this.empleado1 = empleado1;
        iuEmpleado1 = new IUEmpleado(empleado1);
        this.empleado2 = empleado2;
        iuEmpleado2 = new IUEmpleado(empleado2);
        setGanancias(ganancias);
    }
    //#endregion
}
