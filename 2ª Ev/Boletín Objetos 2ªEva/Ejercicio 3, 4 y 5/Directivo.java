public class Directivo {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String departamento;
    private double porcentajeBeneficios;



    //#region GET SET 
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
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento.toUpperCase();
    }
    public void setPorcentajeBeneficios(double porcentajeBeneficios) {
        this.porcentajeBeneficios = porcentajeBeneficios;
    }
    public double getPorcentajeBeneficios() {
        if (porcentajeBeneficios<=100 && porcentajeBeneficios>=0) {
            return porcentajeBeneficios;
        } else{
            return 0;
        }
    }
    //#endregion

    //#region CONSTRUCTORES
    public Directivo(){
        nombre = " ";
        apellidos = " ";
        edad = 0;
        dni = " ";
        departamento = " ";
        porcentajeBeneficios = 0;
    }
    public Directivo(String nombre, String apellidos, int edad, String dni, String departamento, double porcentajeBeneficios){
        setNombre(nombre);
        setApellidos(apellidos) ;
        setEdad(edad) ;
        setDni(dni);
        setDepartamento(departamento);
        setPorcentajeBeneficios(porcentajeBeneficios);
    }
    //#endregion
    
}
