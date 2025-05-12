package excepciones_pooavanzada.ejercicio4;

public class Main {
    // #region GANANCIAS
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Costa", "Diego", 24, "3945822", 5000);
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getApellidos());
        System.out.println(empleado1.getDni());
        System.out.println(empleado1.getEdad());

        Directivo directivo1 = new Directivo("Carlos", "Italiani", 39, "39458229-g", "hola", 5);
        System.out.println(directivo1.getNombre());
        System.out.println(directivo1.getApellidos());
        System.out.println(directivo1.getEdad());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
