package excepciones_pooavanzada.ejercicio4;

public class Main {
    // #region GANANCIAS
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Costa", "Diego", 24, "39458229G", 5000);
        Empleado empleado2 = new Empleado("Costa", "Diego", 24, "39458229-G", 5000);
        Empleado empleado3 = new Empleado("Costa", "Diego", 24, "39458229g", 5000);
        System.err.println(empleado1.getDni());
        System.out.println();
        empleado1.setDni(empleado2.getDni());
        System.out.println();
        empleado1.setDni(empleado3.getDni());

        // System.out.println(empleado1.getNombre());
        // System.out.println(empleado1.getApellidos());
        // System.out.println(empleado1.getDni());
        // System.out.println(empleado1.getEdad());
        // System.out.println(empleado1.getSalarioAnual());
        // System.out.println(empleado1.getIrpf());
        // System.out.println();

        // Directivo directivo1 = new Directivo("Carlos", "Italiani", 39, "39458229g", "hola", 5);
        // System.out.println(directivo1.getNombre());
        // System.out.println(directivo1.getApellidos());
        // System.out.println(directivo1.getDni());
        // System.out.println(directivo1.getEdad());
        // System.out.println(directivo1.getDepartamento());
        // System.out.println(directivo1.getPorcentajeBeneficios());
    }
}
