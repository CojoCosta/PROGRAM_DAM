import java.util.Scanner;

public class Principal {
    // #region VER DATOS
    // CURRO ME DEJASTE DEJAR ESTE ASI!!! HAZ MEMORIA (jueves 16/01/2025 13:18)
    public static void mostrarUnDato(Empresa empresa) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Elige el dato que quieres mostrar (de 1 a 5) ");
        System.out.println("1: Nombre y Apellidos");
        System.out.println("2: Edad");
        System.out.println("3: DNI");
        System.out.println("4: Salario anual");
        System.out.println("5: IRPF");
        opcion = sc.nextInt();
        empresa.iuEmpleado1.mostrar(opcion);
        empresa.iuEmpleado2.mostrar(opcion);
        
    }
    
    public static void mostrarTodosDato(Empresa empresa) {
        empresa.iuEmpleado1.mostrar();
        empresa.iuEmpleado2.mostrar();
    }
    
    public static void datosDirectivo(Empresa empresa) {
        empresa.iuEmpleado1.mostrar();
        
    }
    
    // #endregion
    //#region PEDIR CAMBIAR LOS DATOS 
    public static void cambiarDatos(Empresa empresa) {
        Scanner sc = new Scanner(System.in);
        int option3;
        do {
            System.out.println("Modificar los datos de:");
            System.out.println("1.- Directivo");
            System.out.println("2.- Empleado1");
            System.out.println("3.- Empleado2");
            System.out.println("4.- Salir.");
            option3 = sc.nextInt();
            switch (option3) {
                case 1:
                    empresa.iuDirectivo1.pedir();
                    break;
                case 2:
                    empresa.iuEmpleado1.pedir();
                    break;
                    case 3:
                    empresa.iuEmpleado2.pedir();                    
                    break;
                case 4:
                    System.out.println("Gracias por venir");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option3 != 4);
        
    }
//#endregion
    //#region PAGAR
    public static void pagar(Empresa empresa){
        System.out.printf("\nGanancias: %.2f", empresa.getGanancias());
        double ganancias = empresa.getGanancias();
        double sueldo1 = empresa.empleado1.getSalarioAnual();
        double sueldo2 = empresa.empleado2.getSalarioAnual();
        double gananciasFinales = ganancias - sueldo1 - sueldo2;
        empresa.setGanancias(gananciasFinales);
        System.out.printf("\nGanancias: %.2f", empresa.getGanancias());
        
    }
    //#endregion
    //#region GANANCIAS 
    public static void ganancias(Empresa empresa){
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nGanancias: %.2f", empresa.getGanancias());
        System.out.print("\nAumente las ganancias de la empresa: ");
        double aumento = sc.nextDouble();
        double gananciasFinales = empresa.getGanancias() + aumento;
        empresa.setGanancias(gananciasFinales);
        System.out.printf("\nGanancias: %.2f", empresa.getGanancias());
    }
    //#endregion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // #region OBJETOS
        Directivo directivo1 = new Directivo("Diego", "Costa Pereira", 24, "35461584G", "Informatica", 25);
        Empleado empleado1 = new Empleado("Hugo", "Montes", 21, "56464482L", 35000);
        Empleado empleado2 = new Empleado("Carlos Alberto", "Italiani", 39, "64868424R", 20000);
        Empresa empresa = new Empresa(directivo1, empleado1, empleado2, 2000000);

        int opcion;
        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1- Ver datos empleados");
            System.out.println("2- Ver datos directivo");
            System.out.println("3- Modificar datos");
            System.out.println("4- Pagar");
            System.out.println("5- Cobrar");
            System.out.println("6- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int option2;
                    do {
                        System.out.println("1.- Mostrar uno de los datos de los empleados.");
                        System.out.println("2.- Mostrar todos los datos de los empleados.");
                        System.out.println("3.- Salir.");
                        option2 = sc.nextInt();
                        switch (option2) {
                            case 1:
                                mostrarUnDato(empresa);
                                break;
                            case 2:
                                mostrarTodosDato(empresa);
                                break;
                            case 3:
                                System.out.println("Salir del programa");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } while (option2 != 3);
                    break;
                case 2:
                    datosDirectivo(empresa);
                    break;
                case 3:
                    cambiarDatos(empresa);
                    break;
                case 4:
                    pagar(empresa);

                    break;
                case 5:
                    ganancias(empresa);
                    break;
                case 6:
                    System.out.println("Salir del programa");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        } while (opcion != 6);
        sc.close();

    }
}