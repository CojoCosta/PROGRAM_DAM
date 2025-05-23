package excepciones_pooavanzada.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cadena cd1 = new Cadena();
        String cd2 = "cd1";
        char[] cd3 = new char[]{'c','d','1'};
        cd1.setCadena("cd1");
        System.out.println(cd1.equals(cd2));
        System.out.println(cd1.equals(cd3));
    }
}
