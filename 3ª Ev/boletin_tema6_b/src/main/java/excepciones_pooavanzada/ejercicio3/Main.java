package excepciones_pooavanzada.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cadena cd1 = new Cadena();
        String cd2 = "h o l   a";
        char[] cd3 = new char[]{'c','d','1'};
        cd1.setCadena("   h o l   a   ");
        System.out.println();
        System.out.println("String");
        System.out.println(cd1.equals(cd2));
        System.out.println();
        System.out.println("char[]");
        System.out.println(cd1.equals(cd3));
        System.out.println();
        System.out.println("toString:");
        System.out.println(cd1.toString());
    }
}
