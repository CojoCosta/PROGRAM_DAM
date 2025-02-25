import java.util.Scanner;

public class IUEmpleado {
    Scanner sc = new Scanner(System.in);
    public Empleado empleado1;
    public Empleado empleado2;

    // public Empleado empleado2;
    // public Empleado empleado3;
    // #region
    public IUEmpleado(Empleado empleado) {
        this.empleado1 = empleado;
    }

    // #region METODOS
    public void mostrar() {
        System.out.printf(
                "El empleado de nombre %s y apellidos %s, con una edad de %d años, dni %s, tiene un salario anual de %.2f, con un IRPF del %.2f por ciento , por lo que hacienda le descuenta %.2f",
                empleado1.getNombre(), empleado1.getApellidos(), empleado1.getEdad(), empleado1.getDni(),empleado1.getSalarioAnual(),empleado1.getIrpf(), empleado1.irpf());
    }

    public void mostrar(int opcion) {

        switch (opcion) {
            case 1:
                System.out.printf("\n\n%s %s", empleado1.getNombre(), empleado1.getApellidos());
                break;

            case 2:
                System.out.printf("\n\nEdad de %d", empleado1.getEdad());
                break;

            case 3:
                System.out.printf("\n\nDNI: %s", empleado1.getDni());
                break;

            case 4:
                System.out.printf("\n\nSalario anual: %.2f\n\nIrpf: %.2f por ciento", empleado1.getSalarioAnual(), empleado1.getIrpf());
                break;

            case 5:
                System.out.printf("\n\nCantidad que se lleva hacienda: %.2f", empleado1.irpf());
                break;

            default:
                System.out.println("\n\nVenga a tomar por culo\nTodos los pesados me tocan a mi");
                break;
        }
    }

    public void pedir() {
        System.out.print("Nombre: ");
        empleado1.setNombre(sc.nextLine());
        System.out.print("Apellido: ");
        empleado1.setApellidos(sc.nextLine());
        System.out.print("Edad: ");
        empleado1.setEdad(sc.nextInt());
        sc.nextLine();   
        System.out.print("DNI: ");
        empleado1.setDni(sc.nextLine());
        System.out.print("Salario Anual: ");
        empleado1.setSalarioAnual(sc.nextDouble());
    }
    // #endregion

}
