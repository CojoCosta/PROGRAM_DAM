package excepciones_pooavanzada.ejercicio4;


public class Directivo extends Persona{
    
    private String departamento;
    private double porcentajeBeneficios;



    //#region GET SET 
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
        super("", "", 0, "");
        departamento = " ";
        porcentajeBeneficios = 0;
    }
    public Directivo(String nombre, String apellidos, int edad, String dni, String departamento, double porcentajeBeneficios){
        super(nombre, apellidos, edad, dni);
        setPorcentajeBeneficios(porcentajeBeneficios);
    }
    //#endregion
    
}
