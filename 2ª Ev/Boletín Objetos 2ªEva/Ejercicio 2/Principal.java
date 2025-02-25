import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia1, dia2;
        int mes1, mes2;
        int año1, año2;

        System.out.println("Escoja la primera fecha que quiera:");
        System.out.print("Dia: ");
        dia1 = sc.nextInt();
        System.out.print("Mes: ");
        mes1 = sc.nextInt();
        System.out.print("Año: ");
        año1 = sc.nextInt();
        Fecha fecha1 = new Fecha(dia1, mes1, año1);
        fecha1.setDia(dia1);
        fecha1.setMes(mes1);
        fecha1.setAño(año1);
        System.out.println(fecha1.fechaFormateada(true));
        System.out.println(fecha1.fechaFormateada(false));
        
        System.out.println("Escoja la segunda fecha que quiera:");
        System.out.print("Dia: ");
        dia2 = sc.nextInt();
        System.out.print("Mes: ");
        mes2 = sc.nextInt();
        System.out.print("Año: ");
        año2 = sc.nextInt();
        Fecha fecha2 = new Fecha(dia2, mes2, año2);
        fecha2.setDia(dia2);
        fecha2.setMes(mes2);
        fecha2.setAño(año2);
        
        System.out.println(fecha2.fechaFormateada(true));
        System.out.println(fecha2.fechaFormateada(false));
        System.out.printf("Hay %d años de diferencia", Fecha.diferenciaFechas(fecha1, fecha2));
        
        sc.close();


    }
    
}
